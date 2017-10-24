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
 * ções e informações necessárias para pagamento.
 * @author l024446
 */
public class Funcionario {
    private int id; 
    private String nome;
    private String endereço;
    private final String cpf;
    private String dadosbancarios;

    public String getDadosbancarios() {
        return dadosbancarios;
    }

    public void setDadosbancarios(String dadosbancarios) {
        this.dadosbancarios = dadosbancarios;
    }
    private int idgerente;

    public int getIdgerente() {
        return idgerente;
    }

    public void setIdgerente(int idgerente) {
        this.idgerente = idgerente;
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
     
    public Funcionario(String nome, String endereço, String cpf, int idgerente, String dadosbancarios){
        this.nome = nome;
        this.endereço = endereço;
        this.cpf = cpf;
        this.idgerente = idgerente;
        this.dadosbancarios = dadosbancarios;
    }
       
}