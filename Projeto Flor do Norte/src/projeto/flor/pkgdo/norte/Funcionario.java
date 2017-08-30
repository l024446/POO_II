/*
 * Projeto SI400A - Flor do Norte Limpeza e Organização
 * Luis Miguel Barletta Filho - RA 024446
 * Jonatas Estevão de Oliveira Bueno - RA ⁠⁠⁠159776
 * Henrique Tetzner de Morais - RA 155731
 */
package projeto.flor.pkgdo.norte;

/**
 * A classe funcionaário será utilizada para gerenciar as informações dos
 * funcionários da empresa. Tanto as informações de contato quanto as qualifica-
 * ções e informações necessárias para pagamento
 * @author l024446
 */
public class Funcionario {
    private int id; 
    private String nome;
    private String endereço;
    private final String cpf;
     
    public Funcionario(String nome, String endereço, String cpf){
        this.nome = nome;
        this.endereço = endereço;
        this.cpf = cpf;
    }
    
}