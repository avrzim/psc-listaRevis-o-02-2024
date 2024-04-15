import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int escolha1, escolha2;

        System.out.print("escolha pedra(1), papel(2) ou tesoura(3) para o jogador-1: ");
        escolha1 = input.nextInt();
        System.out.print("escolha pedra, papel ou tesoura para o jogador-2: ");
        escolha2 = input.nextInt();

        if (escolha1 == 1 && escolha2 == 2) {
            System.out.println("Jogador 1 perdeu e jogador 2 venceu!");
        } else if (escolha1 == 1 && escolha2 == 3){
            System.out.println("Jogador 1 venceu e jogador 2 perdeu!");
        } else if (escolha1 == 2 && escolha2 == 1){
            System.out.println("Jogador 1 venceu e jogador 2 perdeu!");
        } else if (escolha1 == 2 && escolha2 == 3){
            System.out.println("Jogador 1 perdeu e jogador 2 venceu!");
        } else if (escolha1 == 3 && escolha2 == 1){
            System.out.println("Jogador 1 perdeu e jogador 2 venceu!");
        } else if (escolha1 == 3 && escolha2 == 2){
            System.out.println("Jogador 1 venceu e jogador 2 perdeu!");
        } else if (escolha1 == escolha2){
            System.out.println("Empate!");
        } else{
            System.out.println("Escolham termos válidos!");
        }

        input.close();
    }
}