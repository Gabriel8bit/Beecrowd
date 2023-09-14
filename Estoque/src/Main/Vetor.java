package Main;

public class Vetor {
    private Produto[] produtos;
    private int tamanho;

    public Vetor(int capacidade) {
        produtos = new Produto[capacidade];
        tamanho = 0;
    }

    public void adicionarProduto(Produto produto) {
        if (tamanho < produtos.length) {
            produtos[tamanho] = produto;
            tamanho++;
        } else {
            System.out.println("O hortifrúti está cheio.");
        }
    }

    public void removerProduto(int indice) {
        if (indice >= 0 && indice < tamanho) {
            for (int i = indice; i < tamanho - 1; i++) {
                produtos[i] = produtos[i + 1];
            }
            tamanho--;
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void atualizarProduto(int indice, String novoNome, int novaQuantidade) {
        if (indice >= 0 && indice < tamanho) {
            produtos[indice].setNome(novoNome);
            produtos[indice].setQuantidade(novaQuantidade);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void listarProdutos() {
        if (tamanho == 0) {
            System.out.println("O hortifrúti está vazio.");
        } else {
            System.out.println("Lista de Produtos no Hortifrúti:");
            for (int i = 0; i < tamanho; i++) {
                System.out.println(i + ": " + produtos[i]);
            }
        }
    }

    public void modificarProduto(int indice, String novoNome, int novaQuantidade) {
        if (indice >= 0 && indice < tamanho) {
            produtos[indice].setNome(novoNome);
            produtos[indice].setQuantidade(novaQuantidade);
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
