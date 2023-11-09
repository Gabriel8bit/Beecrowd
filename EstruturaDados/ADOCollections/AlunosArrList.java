import java.util.ArrayList;

public class AlunosArrList<T> {
    private ArrayList<T> listaAlunos;

    public AlunosArrList() {
        this.listaAlunos = new ArrayList<>();
    }

    public void add(T aluno) {
        this.listaAlunos.add(aluno);
    }

    public void remove(T aluno) {
        this.listaAlunos.remove(aluno);
    }

    public void printAlunos() {
        System.out.println("Elementos na lista:");
        for (T elemento : this.listaAlunos) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        AlunosArrList<String> alunos = new AlunosArrList<>();

        alunos.add("Neymar");
        alunos.add("Jubiscleia");
        alunos.add("Rodolfo");

        alunos.printAlunos();

        alunos.remove("Jubiscleia");
        System.out.println("Elementos após remover Jubiscleia:");
        alunos.printAlunos();
    }
}
