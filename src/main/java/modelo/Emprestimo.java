package modelo;

import java.io.Serializable;

/**
 * Representa um empréstimo de ferramenta realizado a um amigo.
 * Implementa Serializable para permitir transporte via RMI ou gravação em arquivo.
 */
public class Emprestimo implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Identificador do empréstimo. */
    private int IdEmprestimo;

    /** Identificador do amigo que recebeu a ferramenta. */
    private int IdAmigo;

    /** Identificador da ferramenta emprestada. */
    private int IdFerramentas;

    /** Data em que o empréstimo foi realizado. */
    private String dataEmp;

    /** Data prevista ou realizada para devolução. */
    private String dataDev;

    /**
     * Construtor padrão que inicializa o objeto com valores vazios ou zero.
     */
    public Emprestimo() {
        this(0, 0, 0, "", "");
    }

    /**
     * Construtor completo.
     *
     * @param IdEmprestimo   ID do empréstimo
     * @param IdAmigo        ID do amigo
     * @param IdFerramentas  ID da ferramenta emprestada
     * @param dataEmp        Data do empréstimo
     * @param dataDev        Data de devolução
     */
    public Emprestimo(int IdEmprestimo, int IdAmigo, int IdFerramentas, String dataEmp, String dataDev) {
        this.IdEmprestimo = IdEmprestimo;
        this.IdAmigo = IdAmigo;
        this.IdFerramentas = IdFerramentas;
        this.dataEmp = dataEmp;
        this.dataDev = dataDev;
    }

    /** @return ID do amigo. */
    public int getIdAmigo() {
        return IdAmigo;
    }

    /** @param IdAmigo Define o ID do amigo. */
    public void setIdAmigo(int IdAmigo) {
        this.IdAmigo = IdAmigo;
    }

    /** @return ID do empréstimo. */
    public int getIdEmprestimo() {
        return IdEmprestimo;
    }

    /** @param IdEmprestimo Define o ID do empréstimo. */
    public void setIdEmprestimo(int IdEmprestimo) {
        this.IdEmprestimo = IdEmprestimo;
    }

    /** @return Data de empréstimo. */
    public String getDataEmp() {
        return dataEmp;
    }

    /** @param dataEmp Define a data de empréstimo. */
    public void setDataEmp(String dataEmp) {
        this.dataEmp = dataEmp;
    }

    /** @return Data de devolução. */
    public String getDataDev() {
        return dataDev;
    }

    /** @param dataDev Define a data de devolução. */
    public void setDataDev(String dataDev) {
        this.dataDev = dataDev;
    }

    /** @return ID da ferramenta emprestada. */
    public int getIdFerramentas() {
        return IdFerramentas;
    }

    /** @param IdFerramentas Define o ID da ferramenta emprestada. */
    public void setIdFerramentas(int IdFerramentas) {
        this.IdFerramentas = IdFerramentas;
    }
}
