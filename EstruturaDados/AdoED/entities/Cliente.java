package entities;

public class Cliente {
    private String nome;
    private boolean preferencial;

    public Cliente(String nome, boolean preferencial) {
        this.nome = nome;
        this.preferencial = preferencial;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public String getNome() {
        return nome;
    }
}

