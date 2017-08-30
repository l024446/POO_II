/*
 * Projeto SI400A - Flor do Norte Limpeza e Organização
 * Luis Miguel Barletta Filho - RA 024446
 * Jonatas Estevão de Oliveira Bueno - RA ⁠⁠⁠159776
 * Henrique Tetzner de Morais - RA 155731
 */
package projeto.flor.pkgdo.norte;

import java.util.Vector;

/**
 * A classe Gerente será utilizada para gerenciar as informações dos gerentes 
 * da empresa. Ela herda todas as informações da classe funcionário porém conta
 * com alguns dados extras pois ela deve armazenar também os identificadores dos 
 * funcionários que se encontram sob sua gerência.
 * @author l024446
 */
public class Gerente extends Funcionario {
    private Vector funcionarios;
    
    public Gerente(String nome, String endereço, String cpf) {
        super(nome, endereço, cpf);
        funcionarios = new Vector();
    }
    
    public void addfuncionario(Funcionario func){
        funcionarios.add(func);
    }
}