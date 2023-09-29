package application;
import java.util.Scanner;
import entities.Cliente;
import entities.FilaAtendimento;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilaAtendimento filaAtendimento = new FilaAtendimento(50);

        System.out.println("Digite 0 para encerrar o programa.");
        System.out.println("Digite 1 para cliente não preferencial.");
        System.out.println("Digite 2 para cliente preferencial.");
        System.out.println("Digite 3 para exibir a lista de clientes.");

        while (true) {
            System.out.print("Digite a opção do cliente: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            if (opcao == 0) {
                break;
            } else if (opcao == 1 || opcao == 2) {
                System.out.print("Digite o nome do cliente: ");
                String nomeCliente = scanner.nextLine();

                boolean preferencial = (opcao == 2);

                Cliente cliente = new Cliente(nomeCliente, preferencial);
                filaAtendimento.adicionarCliente(cliente);
            } else if (opcao == 3) {
                filaAtendimento.mostrarFila();
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
