/*
 * Projeto SI400A - Flor do Norte Limpeza e Organização
 * Luis Miguel Barletta Filho - RA 024446
 * 
 * 
 */
package projeto.flor.pkgdo.norte;

/**
 * Esta classe irá gerenciar os produtos que podem ser solicitados nos serviços 
 * de limpeza. Cada produto terá sua quantidade em estoque controlada para que 
 * futuramente o sistema realize controle de gastos com produtos e ofereça suges
 * tão quanto ao preço a ser cobrado dos clientes pela utilização de produtos da
 * empresa na realização de limpeza no local.
 * O modelo de negócio da empresa não contempla no momento a venda de produtos, 
 * eles são utilizados exclusivamente no serviço de limpeza e qualquer sobra de
 * produto ao final da limpeza retorna para a empresa.
 * @author l024446
 */
public class Produto {
    private String nome;
    private int quantidade;
    private String  medida; /*O campo "medida" gerencia o tipo de medida do produto (kg, litro ou unidade)*/
    private int preco; /*O campo preço deve ser calculado considerando sempre o preço por unidade de medida utilizada*/

    
    public Produto(String nome, int quantidade, String medida, int preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.medida = medida;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }


    
}
