package principal;

import rmi.RMIClient;
import visao.FrmMenuPrincipal;
import javax.swing.JOptionPane;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {
    private static final Logger LOGGER = Logger.getLogger(Principal.class.getName());

    public static void main(String[] args) {
        try {
            // Tenta conectar ao servidor RMI
            RMIClient.getServico();
            LOGGER.info("Conectado ao servidor RMI com sucesso");

            // Cria o objeto "tela"    
            FrmMenuPrincipal tela = new FrmMenuPrincipal();

            // Método para exibir o objeto tela
            tela.setVisible(true);
        } catch (RuntimeException e) {
            LOGGER.log(Level.SEVERE, "Erro ao conectar ao servidor RMI", e);
            JOptionPane.showMessageDialog(null, 
                "Erro ao conectar ao servidor.\nVerifique se o servidor está rodando.",
                "Erro de Conexão",
                JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
}
