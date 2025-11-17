package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import modelo.Amigo;

public interface AmigoInterface extends Remote {
    
    /* Cadastra um novo amigo no sistema. */
    void cadastrarAmigo(Amigo amigo) throws RemoteException;
    /* Atualiza os dados de um amigo já existente. */
    void atualizarAmigo(Amigo amigo) throws RemoteException;
   /* Exclui um amigo do sistema pelo seu ID. */ 
    void excluirAmigo(int id) throws RemoteException;
    /*Busca um amigo pelo seu ID. */
    Amigo buscarAmigoPorId(int id) throws RemoteException;
     /*Retorna uma lista de todos os amigos cadastrados no sistema. */
    List<Amigo> listarAmigos() throws RemoteException;
}