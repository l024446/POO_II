/*
 * Projeto SI400A - Flor do Norte Limpeza e Organização
 * Luis Miguel Barletta Filho - RA 024446
 * 
 * 
 */
package projeto.flor.pkgdo.norte;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 ** A classe Archive vai ser responsável pelo arquivamento das coleções de dados
 * necessárias para o funcionamento do sistema. Ela irá criar e controlar o aces
 * so às coleções de dados.
 * @author l024446
 */
public class Archive implements Serializable{
    
    private static final Logger LOG = Logger.getLogger(Archive.class.getName());
    private final Path arquivoSerializado;
    private static final String SERIAL_FILENAME = "flor_do_norte.dat";
     
    /*Todos os dados serão guardados em mapas, a chave de acesso dos mapas serão
    os IDs de cada um dos objetos.
    A classe irá verificar a existência de um arquivo serializado para resgatar 
    os dados, se ela não localizar irá retornar uma nova classe Archive vazia.*/
    
    public Archive() {
        LOG.setLevel(Level.INFO);
        arquivoSerializado = FileSystems.getDefault().getPath(SERIAL_FILENAME);
    }
    
    
    public ColecoesDeDados load() throws IOException {
        if (Files.exists(arquivoSerializado)) {
            LOG.log(Level.INFO, "Usando {0}", arquivoSerializado.toString());
            return loadSerialized();
        } else {
            LOG.info("Criando novo arquivo para gerencamento de dados.");
            return new ColecoesDeDados();
        }
    }

           
    private ColecoesDeDados loadSerialized() throws IOException {
        ObjectInputStream is;
        ColecoesDeDados dados = null;
        try {
            is = new ObjectInputStream(Files.newInputStream(arquivoSerializado));
            dados = (ColecoesDeDados) is.readObject();
        } catch (ClassNotFoundException | IOException ex) {
            LOG.log(Level.SEVERE, "loadSerialized", ex);
        }
        return dados;
    }
    
}
