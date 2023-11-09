package AdoGrafo;

import java.util.ArrayList;

public class RedeSocial {
    private ArrayList<Pessoa> pessoas;
    private ArrayList<Relacionamento> relacionamentos;

    public RedeSocial() {
        this.pessoas = new ArrayList<>();
        this.relacionamentos = new ArrayList<>();
    }

    // Adiciona uma pessoa à rede social
    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    // Obter a lista de pessoas na rede social
    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    // Adiciona um relacionamento entre duas pessoas
    public void adicionarRelacionamento(Pessoa pessoa1, Pessoa pessoa2) {
        if (!pessoas.contains(pessoa1) || !pessoas.contains(pessoa2)) {
            System.out.println("Erro: Pessoas não encontradas na rede social.");
            return;
        }

        pessoa1.adicionarAmigo(pessoa2);
        Relacionamento relacionamento = new Relacionamento(pessoa1, pessoa2);
        relacionamentos.add(relacionamento);
    }

    // Mostrar a quantidade de amigos em comum entre as pessoas na rede
    public void mostrarAmigosEmComum() {
        for (int i = 0; i < relacionamentos.size(); i++) {
            Pessoa pessoa1 = relacionamentos.get(i).getPessoa1();
            Pessoa pessoa2 = relacionamentos.get(i).getPessoa2();

            int amigosEmComum = pessoa1.amigosEmComum(pessoa2);

            System.out.println(pessoa1.getNome() + " e " + pessoa2.getNome() + " têm " + amigosEmComum + " amigos em comum.");

            System.out.println(pessoa1.getNome() + " tem amigos: " + pessoa1.getAmigos());
            System.out.println(pessoa2.getNome() + " tem amigos: " + pessoa2.getAmigos());

            if (amigosEmComum > 0) {
                System.out.println("Amigos em comum: ");
                for (Pessoa amigo : pessoa1.getAmigos()) {
                    if (pessoa2.getAmigos().contains(amigo)) {
                        System.out.println("- " + amigo.getNome());
                    }
                }
            }

            System.out.println();
        }
    }
}
