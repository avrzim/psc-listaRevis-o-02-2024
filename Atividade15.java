import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario, imposto;

        System.out.print("Digite o seu salário a seguir: ");
        salario = input.nextDouble();

        if (salario <= 2259.20) {
            System.out.println("Isento");
        } else if(salario > 2259.20 && salario <= 2826.65) {
            imposto = (salario / 100) * 7.5;
            System.out.println("O imposto a ser pago é: " + imposto + "R$");
        } else if (salario > 2826.65 && salario <= 3751.05) {
            imposto = (salario / 100) * 15;
            System.out.println("O imposto a ser pago é: " + imposto + "R$");
        } else if (salario > 3751.05 && salario <= 4664.68) {
            imposto = (salario / 100) * 22.5;
            System.out.println("O imposto a ser pago é: " + imposto + "R$");
        } else{
            imposto = (salario / 100) * 27.5;
            System.out.println("O imposto a ser pago é: " + imposto + "R$");
        }

        input.close();
    }
}