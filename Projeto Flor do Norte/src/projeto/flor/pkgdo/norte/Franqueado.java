/*
 * Projeto SI400A - Flor do Norte Limpeza e Organização
 * Luis Miguel Barletta Filho - RA 024446
 * Jonatas Estevão de Oliveira Bueno - RA ⁠⁠⁠159776
 * Henrique Tetzner de Morais - RA 155731
 */
package projeto.flor.pkgdo.norte;

/**
 * A classe Franqueado será utilizada para gerenciar as informações dos fran- 
 * queados que tenham adquirido uma franquia da empresa. Todo franqueado é um
 * gerente, portanto ela será criada como uma suclasse da classe Gerente. Ela 
 * deve armazenar os  * dados da região em que o franqueado se encontra, e por
 * ser um gerente, também os identificadores dos funcionários que se encontram 
 * sob sua gerência.
 * @author l024446
 */
public class Franqueado extends Gerente{
    
    public Franqueado(String nome, String endereço, String cpf) {
        super(nome, endereço, cpf);
    }
    
}