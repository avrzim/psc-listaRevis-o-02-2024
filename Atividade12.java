import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String palavra;
        int tamanho;

        System.out.print("Escreva sua String: ");
        palavra = input.nextLine();

        palavra = palavra.toLowerCase();
        tamanho = palavra.length();
        
        int i;
        for (i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - i - 1)) {
                System.out.println("A palavra não é um palíndromo.");
                break;
            }
        }
        
        if (i == tamanho / 2) {
            System.out.println("A palavra é um palíndromo.");
        }

        input.close();
    }
}