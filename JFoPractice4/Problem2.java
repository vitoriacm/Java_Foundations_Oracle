package JFoPractice4;

import java.util.Scanner;

public class Problem2 {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeCompleto = scanner.nextLine();

        String[] nomes = nomeCompleto.split(" ");
        String primeiroNome = nomes[0];
        String ultimoNome = nomes[nomes.length - 1];

        String resultado = ultimoNome + ", " + primeiroNome.charAt(0);

        System.out.println("Seu nome é:" + resultado);
}
