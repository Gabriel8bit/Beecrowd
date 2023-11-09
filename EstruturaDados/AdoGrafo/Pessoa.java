package AdoGrafo;

import java.util.ArrayList;

// Classe que representa uma pessoa na rede social
public class Pessoa {
    private String nome;
    private ArrayList<Pessoa> amigos;

    public Pessoa(String nome) {
        this.nome = nome;
        this.amigos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Pessoa> getAmigos() {
        return amigos;
    }

    // Adiciona um amigo e mantém a relação bidirecional
    public void adicionarAmigo(Pessoa amigo) {
        amigos.add(amigo);
        amigo.getAmigos().add(this);
    }

    // Calcular a quantidade de amigos em comum com outra pessoa
    public int amigosEmComum(Pessoa outraPessoa) {
        int contagem = 0;
        for (Pessoa amigo : amigos) {
            if (outraPessoa.getAmigos().contains(amigo)) {
                contagem++;
            }
        }
        return contagem;
    }

    @Override
    public String toString() {
        return nome;
    }
}
