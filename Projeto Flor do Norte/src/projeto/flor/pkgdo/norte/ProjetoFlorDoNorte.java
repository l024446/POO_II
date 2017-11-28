/*
 * Projeto SI400A - Flor do Norte Limpeza e Organização
 * Luis Miguel Barletta Filho - RA 024446
 * Jonatas Estevão de Oliveira Bueno - RA ⁠⁠⁠159776
 * Henrique Tetzner de Morais - RA 155731
 */
package projeto.flor.pkgdo.norte;

import View.TelaPrincipal;
import java.io.IOException;

/**
 *
 * @author l024446
 */
public class ProjetoFlorDoNorte {

    /**
     * @param args the command line arguments
     */
    
    public static void encerrar(){
        
    }
    
    public static void main(String[] args) throws IOException {
    
        Archive gerenciador;
        gerenciador = new Archive();
        ColecoesDeDados arquivos;
        arquivos = gerenciador.load();

        TelaPrincipal tela;
        tela = new TelaPrincipal();
        tela.setDefaultCloseOperation(TelaPrincipal.EXIT_ON_CLOSE);
        tela.pack();
        tela.setVisible(true);
        
    }
    
}
