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
public class NovoIdColaborador {
    
    Integer id;
    Integer aux;
    
    public NovoIdColaborador(ColecoesDeDados arquivo){
        id = arquivo.getIdColaborador();
        aux = id;
        aux++;
        arquivo.setIdAgenda(aux);
        RetornaIdColaborador(id);
    }
    
    private int RetornaIdColaborador(Integer id){
        return id;
    }
    
}
