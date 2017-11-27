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
public class Colaborador {

    private int id; 
    private int cpf;
    private String nome;
    private String endereço;
    private String telefone;
    private String celular;
    private String email;

    public int getId() {
        return id;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getCpf(){
        return cpf;
    }

    public Colaborador (int id, String nome, String endereço, String telefone, String celular, String email, int cpf) {
        this.id = id;
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.cpf = cpf;
    }

       
}