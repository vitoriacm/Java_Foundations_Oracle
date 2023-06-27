package JFoPractice5;

import java.util.Scanner;

public class ColorRange {

public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do comprimento de onda: ");
        double comprimentoOnda = scanner.nextDouble();

        if (comprimentoOnda >= 380 && comprimentoOnda < 450) {
            System.out.println("A cor é Violeta");
        } else if (comprimentoOnda >= 450 && comprimentoOnda < 495) {
            System.out.println("A cor é Azul");
        } else if (comprimentoOnda >= 495 && comprimentoOnda < 570) {
            System.out.println("A cor é Verde");
        } else if (comprimentoOnda >= 570 && comprimentoOnda < 590) {
            System.out.println("A cor é Amarelo");
        } else if (comprimentoOnda >= 590 && comprimentoOnda < 620) {
            System.out.println("A cor é Laranja");
        } else if (comprimentoOnda >= 620 && comprimentoOnda <= 750) {
            System.out.println("A cor é Vermelho");
        } else {
            System.out.println("O comprimento de onda inserido não está dentro do espectro visível");
        }
}
}