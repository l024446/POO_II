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
public class NovoIdAgenda {
    
    Integer id;
    Integer aux;
    
    public NovoIdAgenda(ColecoesDeDados arquivo){
        id = arquivo.getIdAgenda();
        aux = id;
        aux++;
        arquivo.setIdAgenda(aux);
        RetornaIdAgenda(id);
    }
    
    private int RetornaIdAgenda(Integer id){
        return id;
    }
    
}
