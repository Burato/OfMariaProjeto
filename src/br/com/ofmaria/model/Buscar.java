package br.com.ofmaria.model;

public abstract class Buscar {

    String id;
    String nome;

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Buscar{" + "id=" + id + ", nome=" + nome + '}';
    }

    public Buscar(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
