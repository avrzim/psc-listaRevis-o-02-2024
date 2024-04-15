import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota;

        System.out.print("Digite a nota do aluno a seguir (0 a 10): ");
        nota = input.nextDouble();

        if (nota < 7) {
            System.out.println("O aluno foi reprovado!");
        } else{
            System.out.println("O aluno foi aprovado!");
        }

        input.close();
    }
}