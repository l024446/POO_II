/*
 * Projeto SI400A - Flor do Norte Limpeza e Organização
 * Luis Miguel Barletta Filho - RA 024446
 * 
 * 
 */
package Logica;

import projeto.flor.pkgdo.norte.Colaborador;
import projeto.flor.pkgdo.norte.ColecoesDeDados;

/**
 *
 * @author l024446
 */
public class RetornaColaborador {
    
    Colaborador pf;

    public RetornaColaborador (Integer id, ColecoesDeDados arquivo) {
           pf = (Colaborador) arquivo.getColaborador(id);
           RetornaColaborador(pf);
    }
    
    private Colaborador RetornaColaborador(Colaborador pf){
        return pf;
    }
}
