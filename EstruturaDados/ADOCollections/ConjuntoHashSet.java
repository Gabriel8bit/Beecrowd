import java.util.HashSet;
import java.util.Set;

public class ConjuntoHashSet {
    public static void main(String[] args) {
        Set<String> materias = new HashSet<>();
        materias.add("Química");
        materias.add("Literatura");
        materias.add("Educação Física");
        String materiaProcurada = "Geologia";
        if (materias.contains(materiaProcurada)) {
            System.out.println(materiaProcurada + " está no conjunto.");
        } else {
            System.out.println(materiaProcurada + " não está no conjunto.");
        }
        materias.remove("Literatura");
        System.out.println("Disciplinas restantes no conjunto:");
        for (String disciplina : materias) {
            System.out.println(disciplina);
        }
    }
}
