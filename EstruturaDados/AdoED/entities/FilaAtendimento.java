package entities;

public class FilaAtendimento {
    private Cliente[] fila;
    private int tamanho;
    private int capacidade;

    public FilaAtendimento(int capacidade) {
        this.capacidade = capacidade;
        fila = new Cliente[capacidade];
        tamanho = 0;
    }

    public void adicionarCliente(Cliente cliente) {
        if (tamanho < capacidade) {
            if (cliente.isPreferencial()) { // Encontar o deficiente
                int posicaoPreferencial = 0;
                while (posicaoPreferencial < tamanho && fila[posicaoPreferencial].isPreferencial()) {
                    posicaoPreferencial++;
                }

                // Mover os clientes não preferenciais, para abrir espaço pros preferenciais
                for (int i = tamanho; i > posicaoPreferencial; i--) {
                    fila[i] = fila[i - 1];
                }

                // Inserir o preferencial
                fila[posicaoPreferencial] = cliente;
            } else {
                // Adiciona clientes não preferenciais no final da fila
                fila[tamanho] = cliente;
            }
            tamanho++;
        } else {
            System.out.println("Fila de atendimento está cheia.");
        }
    }

    public void atenderProximoCliente() {
        if (tamanho > 0) {
            Cliente clienteAtendido = fila[0];
            for (int i = 1; i < tamanho; i++) {
                fila[i - 1] = fila[i];
            }
            tamanho--;
            System.out.println("Atendendo o cliente: " + clienteAtendido.getNome());
        } else {
            System.out.println("A fila de atendimento está vazia.");
        }
    }

    public void mostrarFila() {
        System.out.println("Fila de Atendimento:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(fila[i].getNome() + (fila[i].isPreferencial() ? " (Preferencial)" : ""));
        }
    }
}