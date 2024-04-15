import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Digite o número a seguir: ");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número é par!");
        } else{
            System.out.println("O número é impar!");
        }

        input.close();
    }
}