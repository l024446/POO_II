/*
 * Projeto SI400A - Flor do Norte Limpeza e Organização
 * Luis Miguel Barletta Filho - RA 024446
 * 
 * 
 */
package projeto.flor.pkgdo.norte;

/**
 * Esta classe irá gerenciar o cadastramento de serviços dos clientes. Ela irá 
 * fazer a anotação do local onde o serviço será realizado, as restrições impos-
 * tas pelo cliente (tanto cômodos ou móveis a serem ignorados durante a faxina
 * quanto restrições quanto aos produtos que devem ser utilizados).
 * O campo status irá controlar o status do serviço (agendado, realizado, aprova
 * do, reprovado).
 * @author l024446
 */
public class Servico {
    private String local;
    private String restricoes;
    private String status;

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getRestricoes() {
        return restricoes;
    }

    public void setRestricoes(String restricoes) {
        this.restricoes = restricoes;
    }

    public String getStatus() {
        return status;
    }
    
    public void setStatusagendado() {
        this.status = "agendado";
    }
    
    public void setStatusrealizado() {
    this.status = "realizado";
    }

    public void setStatusaprovado() {
    this.status = "aprovado";
    }    

    public void setStatusreprovado() {
    this.status = "reprovado";
    }    
    
}
