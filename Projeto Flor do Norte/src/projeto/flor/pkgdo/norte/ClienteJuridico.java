/*
 * Projeto SI400A - Flor do Norte Limpeza e Organização
 * Luis Miguel Barletta Filho - RA 024446
 * 
 * 
 */
package projeto.flor.pkgdo.norte;

/**
 * A classe Cliente Juridico extende a classe cliente. No momento ela apenas adi
 * ciona o CPF ao cadastro. Como o CNPJ não pode ser alterado, ele não precisa 
 * de função set, apenas de função get.
 * @author l024446
 */
public class ClienteJuridico extends Cliente{
    private final int cnpj;

    /**
     *
     * @param cnpj
     * @param nome
     * @param endereço
     * @param telefone
     */
    public ClienteJuridico(int cnpj, String nome, String endereço, String telefone) {
        super(nome, endereço, telefone);
        this.cnpj = cnpj;
    }

    /**
     *
     * @return
     */
    public int getCnpj() {
        return cnpj;
    }
   
}
