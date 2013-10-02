package br.com.ofmaria.model;

public class Fornecedor extends PessoaJuridica {

    private String tipo; //fornecedor de produto ou serviço

    public Fornecedor(String tipo, int codigo, String nome, String endereco, String telefone, String cnpj, String email, String website) {
        super(codigo, nome, endereco, telefone, cnpj, email, website);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "tipo=" + tipo + '}';
    }
}
