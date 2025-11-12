package rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RMIClient {
    private static final Logger LOGGER = Logger.getLogger(RMIClient.class.getName());
    private static EmprestimoFerramentasInterface servicoRemoto;
    private static final String HOST = "localhost";
    private static final int[] PORTAS_RMI = {1099, 1098, 1097, 1096, 1095};
    
    public static EmprestimoFerramentasInterface getServico() {
        if (servicoRemoto == null) {
            Exception lastException = null;
            
            for (int porta : PORTAS_RMI) {
                try {
                    Registry registry = LocateRegistry.getRegistry(HOST, porta);
                    servicoRemoto = (EmprestimoFerramentasInterface) registry.lookup("EmprestimoFerramentas");
                    String msg = "Conectado ao servidor RMI na porta " + porta;
                    LOGGER.info(msg);
                    System.out.println(msg);
                    return servicoRemoto;
                } catch (RemoteException | NotBoundException e) {
                    lastException = e;
                    String warn = "Não foi possível conectar na porta " + porta + ", tentando próxima... Exception: " + e.getMessage();
                    LOGGER.log(Level.WARNING, warn, e);
                    System.out.println(warn);
                }
            }
            
            System.err.println("Erro ao conectar ao servidor RMI em todas as portas: " + (lastException != null ? lastException.getMessage() : "null"));
            LOGGER.log(Level.SEVERE, "Erro ao conectar ao servidor RMI em todas as portas", lastException);
            throw new RuntimeException("Não foi possível conectar ao servidor RMI em nenhuma porta", lastException);
        }
        return servicoRemoto;
    }
}