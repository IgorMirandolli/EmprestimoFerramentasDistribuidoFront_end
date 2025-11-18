package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import modelo.Ferramenta;

// Interface RMI para operações com ferramentas
public interface FerramentaInterface extends Remote {
    
    // Cadastra nova ferramenta
    void cadastrarFerramenta(Ferramenta ferramenta) throws RemoteException;
    
    // Atualiza dados de uma ferramenta
    void atualizarFerramenta(Ferramenta ferramenta) throws RemoteException;
    
    // Exclui ferramenta pelo ID
    void excluirFerramenta(int id) throws RemoteException;
    
    // Busca ferramenta pelo ID
    Ferramenta buscarFerramentaPorId(int id) throws RemoteException;
    
    // Retorna todas as ferramentas cadastradas
    List<Ferramenta> listarFerramentas() throws RemoteException;
}