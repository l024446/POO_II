/*
 * Projeto SI400A - Flor do Norte Limpeza e Organização
 * Luis Miguel Barletta Filho - RA 024446
 * 
 * 
 */
package projeto.flor.pkgdo.norte;

import java.util.Date;

/**
 * Esta classe será utilizada para armazenar os dados de um dia na agenda. Ela
 * vai vincuar o dia especificado com o cliente, o serviço e o funcionário.
 * @author l024446
 */
public class DiaDaAgenda {
    private Date data;
    private Cliente cliente;
    private Funcionario funcionario;
    private Servico servico;

    public DiaDaAgenda(Date data, Cliente cliente, Funcionario funcionario, Servico servico) {
        this.data = data;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.servico = servico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
       
}
