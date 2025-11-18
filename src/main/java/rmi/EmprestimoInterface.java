package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import modelo.Emprestimo;

// Interface remota para operações relacionadas a empréstimos.
//Esta interface define os métodos que podem ser chamados remotamente via RMI
//para manipular e consultar empréstimos de ferramentas.
public interface EmprestimoInterface extends Remote {

    // Registra um novo empréstimo no sistema.
    void registrarEmprestimo(Emprestimo emprestimo) throws RemoteException;

    // Realiza a devolução de uma ferramenta com base no ID do empréstimo.
    void devolverFerramenta(int emprestimoId) throws RemoteException;

    // Retorna uma lista com todos os empréstimos registrados no sistema.
    List<Emprestimo> listarEmprestimos() throws RemoteException;

    // Busca todos os empréstimos relacionados a um amigo específico.
    List<Emprestimo> buscarEmprestimosPorAmigo(int amigoId) throws RemoteException;
}
