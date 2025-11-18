package modelo;

import java.io.Serializable;


// Representa uma ferramenta cadastrada no sistema
public class Ferramenta implements Serializable {
    private static final long serialVersionUID = 1L;

    // Dados da ferramenta
    private int IdFerramentas;
    private String NomeFerramentas;
    private String MarcaFerramentas;
    private double CustoFerramentas;

    //Construtor vazio. Cria ferramenta com valores padrão
    public Ferramenta() {
        this(0, "", "", 0.0);
    }

    // Construtor padrão. Cria ferramenta com todos os dados preenchidos
    public Ferramenta(int IdFerramentas, String NomeFerramentas, String MarcaFerramentas, double CustoFerramentas) {
        this.IdFerramentas = IdFerramentas;
        this.NomeFerramentas = NomeFerramentas;
        this.MarcaFerramentas = MarcaFerramentas;
        this.CustoFerramentas = CustoFerramentas;
    }

    
    public int getIdFerramentas() {
        return IdFerramentas;
    }

    public void setIdFerramentas(int IdFerramentas) {
        this.IdFerramentas = IdFerramentas;
    }

    public String getNomeFerramentas() {
        return NomeFerramentas;
    }

    public void setNomeFerramentas(String NomeFerramentas) {
        this.NomeFerramentas = NomeFerramentas;
    }

    public String getMarcaFerramentas() {
        return MarcaFerramentas;
    }

    public void setMarcaFerramentas(String MarcaFerramentas) {
        this.MarcaFerramentas = MarcaFerramentas;
    }

    public double getCustoFerramentas() {
        return CustoFerramentas;
    }

    public void setCustoFerramenta(double CustoFerramentas) {
        this.CustoFerramentas = CustoFerramentas;
    }
}