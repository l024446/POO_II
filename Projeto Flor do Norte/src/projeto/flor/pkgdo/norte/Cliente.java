package projeto.flor.pkgdo.norte;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Esta é a superclasse Cliente, ela posteriormente será usada para construir
 * as subclasses ClienteFisica e ClienteJuridica se referindo à clientes que
 * sejam pessoa física ou pessoa jurídica respectivamente.
 * @author l024446
 */
public class Cliente {

    private int id; 
    private String nome;
    private String endereço;
    private String telefone;
    
    public Cliente (String nome, String endereço, String telefone){
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        }
    }
}
