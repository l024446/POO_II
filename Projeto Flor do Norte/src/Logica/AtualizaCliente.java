/*
 * Projeto SI400A - Flor do Norte Limpeza e Organização
 * Luis Miguel Barletta Filho - RA 024446
 * 
 * 
 */
package Logica;

import projeto.flor.pkgdo.norte.ClienteFisico;
import projeto.flor.pkgdo.norte.ClienteJuridico;
import projeto.flor.pkgdo.norte.ColecoesDeDados;

/**
 *
 * @author l024446
 */
public class AtualizaCliente {
    
    public AtualizaCliente (int id, String tipo, String nome, String endereço, String telefone, String celular, String email, int documento, ColecoesDeDados arquivo){
            if(tipo.contentEquals("PF")){
               ClienteFisico aux = new ClienteFisico(id, nome, endereço, telefone, celular, email, documento);
                arquivo.setClienteFisico(id, aux);
            }else
                if(tipo.contentEquals("PJ")){
                ClienteJuridico aux = new ClienteJuridico (id, nome, endereço, telefone, celular, email, documento);
                arquivo.setClienteJuridico(id, aux);
            }
    }
}
