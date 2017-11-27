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
import java.util.Date;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.runtime.Debug.id;
/**
 ** A classe Archive vai ser responsável pelo arquivamento das coleções de dados
 * necessárias para o funcionamento do sistema. Ela irá criar e controlar o aces
 * so às coleções de dados.
 * @author l024446
 */
public class ColecoesDeDados implements Serializable{

    private Map<Integer, Colaborador> listaColaborador;
    private Map<Integer, Cliente> listaCliente;
    private Map<Date, Agenda> listaAgenda;
    private Map<Integer, Servico> listaServico;
    
    public Colaborador getColaborador(Integer id) {
        return listaColaborador.get(id);
    }

    public void setColaborador(Integer id, Colaborador colaborador) {
        listaColaborador.replace(id, colaborador);
    }
    
    public void addColaborador(Integer id, Colaborador colaborador){
        if (listaColaborador.containsKey(id)){
            //incluir erro de chave já utilizada.            
        }else{
            listaColaborador.put(id, colaborador);
        }
    }
    
    public Cliente getCliente(Integer id) {
        return listaCliente.get(id);
    }

    public void setCliente(Integer id, Cliente cliente) {
        listaCliente.replace(id, cliente);
    }
    
    public void addCliente(Integer id, Cliente cliente){
        if (listaCliente.containsKey(id)){
            //incluir erro de chave já utilizada.            
        }else{
            listaCliente.put(id, cliente);
        }
    }

  
    
    /*Todos os dados serão guardados em mapas, a chave de acesso dos mapas serão
    os IDs de cada um dos objetos.
    A classe irá verificar a existência de um arquivo serializado para resgatar 
    os dados, se ela não localizar irá retornar uma nova classe Archive vazia.*/
    
    
}
