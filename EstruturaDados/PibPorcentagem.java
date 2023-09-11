import java.io.*;

public class PibPorcentagem {
    public static void main(String[] args) {

        // Nome dos arquivos
        String nomeDoArquivo1 = "pib.txt";
        String nomeDoArquivo2 = "regioes.txt";
        String nomeDoArquivoSaida = "saida.txt";

        double somaNorte = 0;
        double somaNordeste = 0;
        double somaSudeste = 0;
        double somaSul = 0;
        double somaCentroOeste = 0;

        double pibTotal = 0;

        try {
            // Criar
            FileWriter fileWriterSaida = new FileWriter(nomeDoArquivoSaida);
            BufferedWriter bufferedWriterSaida = new BufferedWriter(fileWriterSaida);

            // Ler
            FileReader fileReaderRegioes = new FileReader(nomeDoArquivo2);
            BufferedReader bufferedReaderRegioes = new BufferedReader(fileReaderRegioes);

            String linhaRegioes;

            while ((linhaRegioes = bufferedReaderRegioes.readLine()) != null) {

                if (linhaRegioes.trim().isEmpty()) { // trim = tirar linhas em branco
                    continue;
                }

                // Se a linha não está vazia, é uma nova região. regioes.txt
                String regiao = linhaRegioes.trim();

                // Ler estados da região e somar o PIB
                while ((linhaRegioes = bufferedReaderRegioes.readLine()) != null && !linhaRegioes.trim().isEmpty()) {
                    String estado = linhaRegioes.trim();

                    FileReader fileReaderPib = new FileReader(nomeDoArquivo1);
                    BufferedReader bufferedReaderPib = new BufferedReader(fileReaderPib);

                    String linhaPib;

                    while ((linhaPib = bufferedReaderPib.readLine()) != null) {
                        String[] numeros = linhaPib.split(";");
                        try {
                            String estadoPib = numeros[0].trim();
                            double valor = Double.parseDouble(numeros[1].trim());

                            if (estadoPib.equals(estado)) {
                                // Se o estado do PIB corresponder ao estado da região, somar o valor à variável
                                // da região
                                switch (regiao) {
                                    case "Norte":
                                        somaNorte += valor;
                                        break;
                                    case "Nordeste":
                                        somaNordeste += valor;
                                        break;
                                    case "Sudeste":
                                        somaSudeste += valor;
                                        break;
                                    case "Sul":
                                        somaSul += valor;
                                        break;
                                    case "Centro-Oeste":
                                        somaCentroOeste += valor;
                                        break;
                                }
                            }
                        } catch (NumberFormatException e) {
                            System.err.println("Valor inválido: " + numeros[1]);
                        }
                    }

                    bufferedReaderPib.close();
                }
            }

            bufferedReaderRegioes.close();

            pibTotal = somaNorte + somaNordeste + somaSudeste + somaSul + somaCentroOeste;

            bufferedWriterSaida.write("O pib do Norte é :" + somaNorte + "\n");
            bufferedWriterSaida.write("O pib do Nordeste é : " + somaNordeste + "\n");
            bufferedWriterSaida.write("O pib do Sudeste é : " + somaSudeste + "\n");
            bufferedWriterSaida.write("O pib do Sul é : " + somaSul + "\n");
            bufferedWriterSaida.write("O pib do Centro-Oeste é : " + somaCentroOeste + "\n");

            bufferedWriterSaida
                    .write("Porcentagem do PIB Norte: " + String.format("%.2f", (somaNorte / pibTotal) * 100) + "%\n");
            bufferedWriterSaida.write(
                    "Porcentagem do PIB Nordeste: " + String.format("%.2f", (somaNordeste / pibTotal) * 100) + "%\n");
            bufferedWriterSaida.write(
                    "Porcentagem do PIB Sudeste: " + String.format("%.2f", (somaSudeste / pibTotal) * 100) + "%\n");
            bufferedWriterSaida
                    .write("Porcentagem do PIB Sul: " + String.format("%.2f", (somaSul / pibTotal) * 100) + "%\n");
            bufferedWriterSaida.write("Porcentagem do PIB Centro-Oeste: "
                    + String.format("%.2f", (somaCentroOeste / pibTotal) * 100) + "%\n");

            bufferedWriterSaida.close();

            FileReader fileReaderEstados = new FileReader(nomeDoArquivo1);
            BufferedReader bufferedReaderEstados = new BufferedReader(fileReaderEstados);

            String linhaEstado;

            // imprimir estados
            while ((linhaEstado = bufferedReaderEstados.readLine()) != null) {
                String[] numeros = linhaEstado.split(";");
                try {
                    String estado = numeros[0].trim();
                    double valor = Double.parseDouble(numeros[1].trim());
                    double porcentagem = (valor / pibTotal) * 100;
                    System.out.println(estado + ": " + String.format("%.2f", porcentagem) + "%");
                } catch (NumberFormatException e) {
                    System.err.println("Valor inválido: " + numeros[1]);
                }
            }

            bufferedReaderEstados.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo inexistente: '" + nomeDoArquivo1 + "' ou '" + nomeDoArquivo2 + "'");
        } catch (IOException ex) {
            System.out.println("Erro lendo ou escrevendo nos arquivos");
        }
    }
}
