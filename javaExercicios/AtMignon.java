import java.util.Scanner;
import java.util.Random;

public class AtMignon {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcao = 1;
		int[] vetor = null;

		while (opcao != 0) {
			System.out.println("Menu de Opções:");
			System.out.println("1 - Inicializar o vetor com números aleatórios; ");
			System.out.println("2 - Imprimir o vetor;");
			System.out.println("3 - Verificar se um determinado número está contido no vetor;");
			System.out.println("4 - Buscar o maior número armazenado no vetor;");
			System.out.println("5 - Calcular a média dos números pares armazenados no vetor;");
			System.out.println("6 - Calcular o percentual dos números ímpares armazenados no vetor;");
			System.out.println("7 - Calcula a média centralizada dos números armazenados no vetor;");
			System.out.println(
					"8 - Verificar se dado um valor existe dois números em posições distintas que somados são iguais ao valor informado.");
			System.out.println("0 - Sair do programa");

			opcao = sc.nextInt();

			if (opcao != 1 && vetor != null || opcao == 1) {
				switch (opcao) {
					case 0:
						System.out.println("Programa encerrado!");
						break;

					case 1:
						Random r = new Random();
						System.out.println("Qual vai ser o tamanho do vetor ? : ");
						int tamanhoVetor = sc.nextInt();
						System.out.println("Qual vai ser o número mais alto do vetor ?: ");
						int m = sc.nextInt();
						vetor = new int[tamanhoVetor];

						for (int i = 0; i < vetor.length; i++) {
							vetor[i] = r.nextInt(m);
						}
						break;

					case 2:
						imprimir(vetor);
						break;

					case 3:
						System.out.println("Insira o valor que deseja procurar : ");
						int procurar = sc.nextInt();
						int indice = valorIgual(vetor, procurar);

						if (indice != -1) {
							System.out.println("Valor encontrado na posição: " + indice);
						} else {
							System.out.println("Valor não encontrado.");
						}
						break;

					case 4:
						int qualMaior = maior(vetor);
						System.out.println("O maior número do vetor é : " + qualMaior);
						break;

					case 5:
						int medpar = mediaPares(vetor);
						System.out.println("A média dos números pares no vetor é : " + medpar);
						break;

					case 6:
						double percentual = percentualImpar(vetor);
						System.out.printf("A porcentagem de números impar(es) no vetor é %.1f \n", percentual);
						break;

					case 7:
						int mediaCentralizada = mediaCentral(vetor);
						System.out.println(mediaCentralizada);
						break;

					case 8:
						System.out.println("Informe o valor : ");
						int valorInformado = sc.nextInt();
						boolean retorno = checaSoma(vetor, valorInformado);
						System.out.println(retorno);
						break;

					default:
						System.out.println("Opção inválida!");
						break;
				}
			} else {
				System.out.println("Vetor nao inicializado");
			}

		}
	}

	// 2 - Função para imprimir o vetor.
	public static void imprimir(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%4d", vetor[i]);
		}
		System.out.println();
	}

	// 3 - Função para encontrar determinado valor dentro do vetor.
	public static int valorIgual(int[] vetor, int procurar) {

		int indice = -1;
		for (int i = 0; i < vetor.length; i++) {
			if (procurar == vetor[i]) {
				indice = i;
				break;
			}
		}
		return indice;
	}

	// 4 - função retornar o maior
	public static int maior(int[] vetor) {
		int maior = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		return maior;
	}

	// 5 - função para calcular a média dos números pares armazenados no vetor
	public static int mediaPares(int[] vetor) {
		int mediaPares = 0;
		int cont = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				mediaPares = vetor[i] + mediaPares;
				cont++;
			}
		}
		mediaPares /= cont;
		return mediaPares;
	}

	// 6 - Calcular o percentual dos números ímpares armazenados no vetor
	public static double percentualImpar(int[] vetor) {
		double percentual = 0;
		int cont = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 != 0) {
				cont++;
			}
			percentual = i + 1;
		}
		percentual = 100 * cont / percentual;
		return percentual;
	}

	// 7 - Função para Calcular a média centralizada dos números armazenados no

	public static int mediaCentral(int[] vetor) {
		int maior = 0, menor = 0, media = 0, armazenar = 0;
		for (int i = 0; i < vetor.length; i++) {
			armazenar = i;
			media = vetor[i] + media;
			if (vetor[i] >= maior) {
				maior = vetor[i];
			} else if (vetor[i] <= menor) {
				menor = vetor[i];
			}
		}
		media = media - maior - menor;
		media = media / (armazenar - 2);

		return media;
	}

	// 8 - Verificar se, dado um valor, existe dois números em posições distintas
	// que somados é igual ao valor informado por parâmetro.
	public static boolean checaSoma(int[] vetor, int valorInformado) {
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 1; i < vetor.length; i++) {
				if (valorInformado == vetor[i] + vetor[j]) {

					return true;
				}
			}
		}
		return false;
	}
}
