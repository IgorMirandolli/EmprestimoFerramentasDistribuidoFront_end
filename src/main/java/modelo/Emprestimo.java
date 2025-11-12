package modelo;

import java.io.Serializable;

public class Emprestimo implements Serializable {
    private static final long serialVersionUID = 1L;

    // Field names must match server-side model for Java serialization
    private int IdEmprestimo;
    private int IdAmigo;
    private int IdFerramentas;
    private String dataEmp;
    private String dataDev;

    public Emprestimo() {
        this(0, 0, 0, "", "");
    }

    public Emprestimo(int IdEmprestimo, int IdAmigo, int IdFerramentas, String dataEmp, String dataDev) {
        this.IdEmprestimo = IdEmprestimo;
        this.IdAmigo = IdAmigo;
        this.IdFerramentas = IdFerramentas;
        this.dataEmp = dataEmp;
        this.dataDev = dataDev;
    }

    public int getIdAmigo() {
        return IdAmigo;
    }

    public void setIdAmigo(int IdAmigo) {
        this.IdAmigo = IdAmigo;
    }

    public int getIdEmprestimo() {
        return IdEmprestimo;
    }

    public void setIdEmprestimo(int IdEmprestimo) {
        this.IdEmprestimo = IdEmprestimo;
    }

    public String getDataEmp() {
        return dataEmp;
    }

    public void setDataEmp(String dataEmp) {
        this.dataEmp = dataEmp;
    }

    public String getDataDev() {
        return dataDev;
    }

    public void setDataDev(String dataDev) {
        this.dataDev = dataDev;
    }

    public int getIdFerramentas() {
        return IdFerramentas;
    }

    public void setIdFerramentas(int IdFerramentas) {
        this.IdFerramentas = IdFerramentas;
    }
}