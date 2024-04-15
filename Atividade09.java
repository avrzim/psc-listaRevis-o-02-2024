import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;

        System.out.print("Digite sua idade a seguir: ");
        idade = input.nextInt();

        if (idade < 18) {
            System.out.println("Menor de idade!");
        } else{
            System.out.println("Maior de idade!");
        }

        input.close();
    }
}