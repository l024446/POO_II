/*
 * Projeto SI400A - Flor do Norte Limpeza e Organização
 * Luis Miguel Barletta Filho - RA 024446
 * Jonatas Estevão de Oliveira Bueno - RA ⁠⁠⁠159776
 * Henrique Tetzner de Morais - RA 155731
 */
package projeto.flor.pkgdo.norte;

import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * A classe Agenda irá ser utilizada para gerenciar as agendas de cada funciona-
 * rio. Ela será importante para controlar o gerenciamento de envio de mensagens
 * lebrando o funcionário sobre o serviço solicitado e também permitirá ao clien
 * te verificar se o funcionário está disponível para o serviço no dia desejado.  
 * @author l024446
 */
public class Agenda {
    
    private TreeSet<DiaDaAgenda> agenda;
    private Iterator<Agenda> i;
    
     /**
     * adicionaDia recebe como parâmetro o dia a ser incluido na agenda e o adi-
     * ciona à lista.
     * @param dia
     */
    public void adicionaDia(DiaDaAgenda dia){
        this.agenda.add(dia);
    }
    
    /**
     * removeDia recebe como parâmetro o dia a ser removido da agenda e o exclui
     * da lista.
     * @param dia
     */
    public void removeDia(DiaDaAgenda dia){
        this.agenda.remove(dia);
    }
    
    /**
     *A função alteraDia foi sobrecarregada para alterar cada uma das informa-
     * ções de um determinado dia da agenda. Caso um dia precise ser alterado, 
     * basta chamar a função informando o dia a ser alterado e qual informação 
     * deve ser alterada.
     **/
    
    public void alteraDia(DiaDaAgenda dia, Date novadata){
        if (this.agenda.contains(dia)){
            this.agenda((Iterator<Agenda>) dia).setData(novadata);
            }
    }
    public void alteraDia(DiaDaAgenda dia, Servico novoservico){
        if (this.agenda.contains(dia)){
            this.agenda((Iterator<Agenda>) dia).setServico(novoservico);
            }            
    }    
    public void alteraDia(DiaDaAgenda dia, Funcionario novofuncionario){
        if (this.agenda.contains(dia)){
            this.agenda((Iterator<Agenda>) dia).setFuncionario(novofuncionario);
        }
    }

    private DiaDaAgenda agenda(Iterator<Agenda> i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}