import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        double resultadoFinal = 0;

        System.out.println("Digite a primeira nota:");
        int nota1 = notas.nextInt();

        System.out.println("Digite a segunda nota:");
        int nota2 = notas.nextInt();

        System.out.println("Digite a terceira nota:");
        int nota3 = notas.nextInt();

        System.out.println("Digite a quarta nota:");
        int nota4 = notas.nextInt();

        resultadoFinal = (nota1 + nota2 + nota3 + nota4)/4;

        if (resultadoFinal >= 7) {
            System.out.println("Você foi aprovado, Parabéns!");
        } else {
            System.out.println("Você foi reprovado, Estude mais!");
        }
    }
}
