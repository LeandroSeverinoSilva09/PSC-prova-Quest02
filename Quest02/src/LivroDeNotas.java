import java.util.Scanner;

public class LivroDeNotas {
    Scanner scanner = new Scanner(System.in);
    private int numeroAlunos;

    public int getNumeroAlunos() {
        return numeroAlunos;
    }

    public void setNumeroAlunos(int numeroAlunos) {
        this.numeroAlunos = numeroAlunos;
    }

    public double calcularMediaDeCadaAluno() {

        double nota, media;
        double soma = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.printf("Digite a nota a%d do aluno:\n", i);
            nota = scanner.nextDouble();
            soma += nota;
        }
        media = soma / 3;
        System.out.println("A média do aluno foi: " + media);
        return media;
    }

    public void calcularMediaDaTurma() {
        double somaMediaAluno = 0;
        double mediaTurma;
        for (int i = 0; i < getNumeroAlunos(); i++) {
            somaMediaAluno += calcularMediaDeCadaAluno();
        }
        mediaTurma = somaMediaAluno / getNumeroAlunos();
        System.out.printf("A média da turma foi: %.3f\n", mediaTurma);
        scanner.close();
    }

}
