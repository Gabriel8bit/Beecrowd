import java.util.HashMap;
import java.util.Map;

public class AvaliacaoHashMap {
    public static void main(String[] args) {
        Map<String, Double> avaliacoes = new HashMap<>();
        avaliacoes.put("Ana", 8.5);
        avaliacoes.put("Carlos", 9.0);
        avaliacoes.put("Patrícia", 7.8);
        System.out.println("Resultados das avaliações:");
        for (String aluno : avaliacoes.keySet()) {
            double nota = avaliacoes.get(aluno);
            System.out.println(aluno + ": " + nota);
        }

        avaliacoes.put("Patrícia", 8.2);
        System.out.println("Nova nota de Patrícia: " + avaliacoes.get("Patrícia"));
    }
}

