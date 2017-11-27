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
public class AtualizaColaborador {
    
    public AtualizaColaborador (int id, String nome, String endereço, String telefone, String celular, String email, int documento, ColecoesDeDados arquivo){
        Colaborador aux = new Colaborador (id, nome, endereço, telefone, celular, email, documento);
        arquivo.setColaborador(id, aux);
        }
}

