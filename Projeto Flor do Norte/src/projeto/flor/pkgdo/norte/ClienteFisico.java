/*
 * Projeto SI400A - Flor do Norte Limpeza e Organização
 * Luis Miguel Barletta Filho - RA 024446
 * 
 * 
 */
package projeto.flor.pkgdo.norte;

/**
 * A classe Cliente Fisico extende a classe cliente. No momento ela apenas adici
 * ona o CPF ao cadastro. Como o CPF não pode ser alterado, ele não precisa de 
 * função set, apenas de função get.
 * @author l024446
 */
public class ClienteFisico extends Cliente{
    private final int cpf;

    public ClienteFisico(String nome, String endereço, String telefone, int cpf) {
        super(nome, endereço, telefone);
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }
    
    
}
