package imovel;

public class Imovel {
    private int idImovel;
    private String endereco;
    private String tipo;
    private double valor;
    private double valorOriginal;

    public Imovel(int idImovel, String endereco, String tipo, double valor) {
        this.idImovel = idImovel;
        this.endereco = endereco;
        this.tipo = tipo;
        this.valor = valor;
        this.valorOriginal = valor;
    }

    public void calcularDesconto() {
        if (this.valor >= 350000.00) {
            this.valor = this.valor * 0.70;
        } else if (this.valor >= 280000.00) {
            this.valor = this.valor * 0.90;
        } else if (this.valor >= 175000.00) {
            this.valor = this.valor * 0.96;
        }
    }
    public String classificarRanking() {
        if (this.valor < 0) {
            throw new IllegalArgumentException("dados inválidos");
        }
        if (this.valor >= 200000.00) {
            return "TOP";
        } else if (this.valor >= 150000.00) {
            return "Médio";
        } else {
            return "Abaixo";
        }
    }
    public int getIdImovel() {
        return idImovel;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
    public double getValorOriginal() {
        return valorOriginal;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}