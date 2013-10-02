package br.com.ofmaria.model;

public class Veiculo {

    private int codigo;
    private String cor;
    private String fabricante;
    private String modelo;
    private String cilindrada;

    @Override
    public String toString() {
        return "Veiculo{" + "codigo=" + codigo + ", cor=" + cor + ", fabricante=" + fabricante + ", modelo=" + modelo + ", cilindrada=" + cilindrada + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Veiculo(int codigo, String cor, String fabricante, String modelo, String cilindrada) {
        this.codigo = codigo;
        this.cor = cor;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }
}
