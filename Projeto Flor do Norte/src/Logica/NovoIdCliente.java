/*
 * Projeto SI400A - Flor do Norte Limpeza e Organização
 * Luis Miguel Barletta Filho - RA 024446
 * 
 * 
 */
package Logica;

import projeto.flor.pkgdo.norte.ColecoesDeDados;

/**
 *
 * @author l024446
 */
public class NovoIdCliente {
    
    Integer id;
    Integer aux;
    
    public NovoIdCliente(ColecoesDeDados arquivo){
        id = arquivo.getIdCliente();
        aux = id;
        aux++;
        arquivo.setIdCliente(aux);
        RetornaIdCliente(id);
    }
    
    private int RetornaIdCliente(Integer id){
        return id;
    }
    
}
