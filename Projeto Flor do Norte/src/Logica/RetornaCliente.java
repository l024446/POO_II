/*
 * Projeto SI400A - Flor do Norte Limpeza e Organização
 * Luis Miguel Barletta Filho - RA 024446
 * 
 * 
 */
package Logica;

import projeto.flor.pkgdo.norte.Cliente;
import projeto.flor.pkgdo.norte.ClienteFisico;
import projeto.flor.pkgdo.norte.ClienteJuridico;
import projeto.flor.pkgdo.norte.ColecoesDeDados;

/**
 *
 * @author l024446
 */
public class RetornaCliente {
    
    ClienteFisico pf;
    ClienteJuridico pj;

    public RetornaCliente(Integer id, ColecoesDeDados arquivo, String tipo) {
        if (tipo.contentEquals("PF")){
           pf = (ClienteFisico) arquivo.getClienteFisico(id);
           RetornaClienteFisico(pf);
        }else
            if(tipo.contentEquals("PJ")){
                pj = (ClienteJuridico) arquivo.getClienteJuridico(id);
                RetornaClienteJuridico(pj);
            }
    }
    
    private ClienteFisico RetornaClienteFisico(ClienteFisico pf){
        return pf;
    }

    private ClienteJuridico RetornaClienteJuridico(ClienteJuridico pj){
        return pj;
    }
}
