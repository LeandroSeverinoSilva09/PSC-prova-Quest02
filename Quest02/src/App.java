//a) Implemente o método calcularMediaDeCadaAluno. Ele deve
//- capturar o número de alunos e guardar na variável numeroAlunos
//- capturar notas a1, a2 e a3 de cada aluno
//- calcular a média de cada aluno e exibir, conforme critérios da São Judas

//b) Implemente o método calcularMediaDaTurma. Ele deve calcular a média geral da turma.
//CRITÉRIO: A solução deve utilizar estruturas de repetição em Java, como for, while e/ou do/while. Também é necessário fazer a captura de dados via JOptionPane ou Scanner.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        LivroDeNotas livroDeNotas = new LivroDeNotas();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número de alunos: ");
        livroDeNotas.setNumeroAlunos(scanner.nextInt());

        livroDeNotas.calcularMediaDaTurma();

        scanner.close();
    }
}
