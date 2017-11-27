/*
 * Projeto SI400A - Flor do Norte Limpeza e Organização
 * Luis Miguel Barletta Filho - RA 024446
 * 
 * 
 */
package projeto.flor.pkgdo.norte;

import java.io.Serializable;
import java.util.Map;
/**
 ** A classe Archive vai ser responsável pelo arquivamento das coleções de dados
 * necessárias para o funcionamento do sistema. Ela irá criar e controlar o aces
 * so às coleções de dados.
 * @author l024446
 */
public class ColecoesDeDados implements Serializable{

    private Map<Integer, Colaborador> listaColaborador;
    private Map<Integer, ClienteFisico> listaClienteFisico;
    private Map<Integer, ClienteJuridico> listaClienteJuridico;
    private Map<Integer, Agenda> listaAgenda;
    private Integer idColaborador;
    private Integer idCliente;
    private Integer idAgenda;

    public Integer getIdColaborador() {
        return idColaborador;
    }

    public void setIdColaborador(Integer idColaborador) {
        this.idColaborador = idColaborador;
    }

    
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    
    public Integer getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(Integer idAgenda) {
        this.idAgenda = idAgenda;
    }

    
    public Colaborador getColaborador(Integer id) {
        return listaColaborador.get(id);
    }

    public void setColaborador(Integer id, Colaborador colaborador) {
        listaColaborador.replace(id, colaborador);
    }
    
    public void addColaborador(Integer id, Colaborador colaborador){
        if (listaColaborador.containsKey(id)){
            //incluir erro de chave já utilizada.            
        }else{
            listaColaborador.put(id, colaborador);
        }
    }

    
    public ClienteFisico getClienteFisico(Integer id) {
        return listaClienteFisico.get(id);
    }

    public void setClienteFisico(Integer id, ClienteFisico cliente) {
        listaClienteFisico.replace(id, cliente);
    }
    
    public void addClienteFisico(Integer id, ClienteFisico cliente){
        if (listaClienteFisico.containsKey(id)){
            //incluir erro de chave já utilizada.            
        }else{
            listaClienteFisico.put(id, cliente);
        }
    }

    
    public ClienteJuridico getClienteJuridico(Integer id) {
        return listaClienteJuridico.get(id);
    }

    public void setClienteJuridico(Integer id, ClienteJuridico cliente) {
        listaClienteJuridico.replace(id, cliente);
    }
    
    public void addClienteJuridico(Integer id, ClienteJuridico cliente){
        if (listaClienteJuridico.containsKey(id)){
            //incluir erro de chave já utilizada.            
        }else{
            listaClienteJuridico.put(id, cliente);
        }
    }
 

    public Agenda getAgenda(Integer id) {
        return listaAgenda.get(id);
    }

    public void setAgeda (Integer id, Agenda agenda) {
        listaAgenda.replace(id, agenda);
    }
    
    public void addAgenda(Integer id, Agenda agenda){
        if (listaAgenda.containsKey(id)){
            //incluir erro de chave já utilizada.            
        }else{
            listaAgenda.put(id, agenda);
        }
    }
    
    
    /*Todos os dados serão guardados em mapas, a chave de acesso dos mapas serão
    os IDs de cada um dos objetos.
    A classe irá verificar a existência de um arquivo serializado para resgatar 
    os dados, se ela não localizar irá retornar uma nova classe Archive vazia.*/
    
    
}
