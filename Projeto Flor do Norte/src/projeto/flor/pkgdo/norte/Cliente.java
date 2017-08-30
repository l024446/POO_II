package projeto.flor.pkgdo.norte;

/*
 * Projeto SI400A - Flor do Norte Limpeza e Organização
 * Luis Miguel Barletta Filho - RA 024446
 * Jonatas Estevão de Oliveira Bueno - RA ⁠⁠⁠159776
 * Henrique Tetzner de Morais - RA 155731
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