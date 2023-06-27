package JFoPractice5;

import java.util.Scanner;

public class TrafficLightChecker {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código da cor atual do sinal de trânsito: ");
        int corAtual = scanner.nextInt();

        if (corAtual == 1) {
            System.out.println("A próxima cor do sinal de trânsito é Verde");
        } else if (corAtual == 2) {
            System.out.println("A próxima cor do sinal de trânsito é Amarelo");
        } else if (corAtual == 3) {
            System.out.println("A próxima cor do sinal de trânsito é Vermelho");
        } else {
            System.out.println("Cor inválida");
        }
    }
}
