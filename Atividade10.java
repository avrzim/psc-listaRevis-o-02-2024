import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valorTotal, valorComDesconto, desconto, porcentagemDesconto;

        System.out.print("Digite o valor total do seu produto: ");
        valorTotal = input.nextDouble();

        System.out.print("Digite a porcentagem do desconto(sem %): ");
        porcentagemDesconto = input.nextDouble();

        desconto = (porcentagemDesconto / 100) * valorTotal;

        valorComDesconto =valorTotal - desconto;

        System.out.println("O desconto é de: R$" + desconto);
        System.out.println("O valor com desconto é de: R$" + valorComDesconto);

        input.close();
    }
}