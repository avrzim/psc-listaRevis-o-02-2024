import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Digite o primeiro número a seguir: ");
        num1 = input.nextInt();
        System.out.print("Digite o segundo número a seguir: ");
        num2 = input.nextInt();
        System.out.print("Digite o terceiro número a seguir: ");
        num3 = input.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("O " + num1 + " É o maior");
        }else if (num2 > num1 && num2 > num3) {
            System.out.println("O " + num2 + " É o maior");
        }else{
            System.out.println("O " + num3 + " É o maior");
        }

        input.close();
    }
}