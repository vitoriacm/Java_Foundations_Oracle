package JFoPractice5;

import java.util.Scanner;

public class TrafficLightCheckerSwitch {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código da cor atual do sinal de trânsito: ");
        int corAtual = scanner.nextInt();

        switch (corAtual) {
            case 1:
                System.out.println("A próxima cor do sinal de trânsito é Verde");
                break;
            case 2:
                System.out.println("A próxima cor do sinal de trânsito é Amarelo");
                break;
            case 3:
                System.out.println("A próxima cor do sinal de trânsito é Vermelho");
                break;
            default:
                System.out.println("Cor inválida");
                break;
    }
}
}