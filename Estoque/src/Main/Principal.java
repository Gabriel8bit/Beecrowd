package Main;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Vetor listaProdutos = new Vetor(10);

        while (true) {
            System.out.println("Selecione o que deseja fazer: ");
            System.out.println(" 0. Sair\n" +
                    " 1. Exibir Estoque\n" +
                    " 2. Adicionar ao estoque\n" +
                    " 3. Remover do estoque\n" +
                    " 4. Atualizar estoque\n" +
                    " 5. Modificar item");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo do programa...");
                    sc.close();
                    return; // Sai do programa
                //exibir
                case 1:
                    listaProdutos.listarProdutos();
                    break;
                    //adicionar
                case 2:
                    System.out.println("Digite o nome do produto:");
                    sc.nextLine(); // Limpa o buffer
                    String nomeProduto = sc.nextLine();
                    System.out.println("Digite a quantidade:");
                    int quantidadeProduto = sc.nextInt();
                    Produto produto = new Produto(nomeProduto, quantidadeProduto);
                    listaProdutos.adicionarProduto(produto);
                    System.out.println("Produto adicionado com sucesso.");
                    break;
                    //remover
                case 3:
                    System.out.println("Digite o índice do produto a ser removido:");
                    int indiceRemover = sc.nextInt();
                    listaProdutos.removerProduto(indiceRemover);
                    System.out.println("Produto removido com sucesso.");
                    break;
                    //atualizar
                case 4:
                    System.out.println("Digite o índice do produto a ser atualizado:");
                    int indiceAtualizar = sc.nextInt();
                    sc.nextLine(); // Limpa o buffer
                    System.out.println("Digite o novo nome do produto:");
                    String novoNome = sc.nextLine();
                    System.out.println("Digite a nova quantidade:");
                    int novaQuantidade = sc.nextInt();
                    listaProdutos.atualizarProduto(indiceAtualizar, novoNome, novaQuantidade);
                    System.out.println("Produto atualizado com sucesso.");
                    break;

                case 5:
                    System.out.println("Digite o índice do produto a ser modificado:");
                    int indiceModificar = sc.nextInt();
                    sc.nextLine(); // Limpa o buffer
                    System.out.println("Digite o novo nome do produto:");
                    String novoNomeModificado = sc.nextLine();
                    System.out.println("Digite a nova quantidade:");
                    int novaQuantidadeModificada = sc.nextInt();
                    listaProdutos.modificarProduto(indiceModificar, novoNomeModificado, novaQuantidadeModificada);
                    System.out.println("Produto modificado com sucesso.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}

//Muito trabalho usar o java.swing panel