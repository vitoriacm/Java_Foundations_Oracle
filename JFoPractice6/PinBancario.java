
package JFoPractice6;

import java.util.Scanner;
public class PinBancario{

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int pinCorreto = 34565987;

        while (true){

            System.out.println("Digite o Pin Bancário");
            int pinInserido = teclado.nextInt();

            if (pinInserido == pinCorreto){
                System.out.println("PIN correto! Acesso concedido à conta.");
                break; 
            } else {
                System.out.println("PIN incorreto! Tente novamente.");
            }
            }
            
            teclado.close();
        }

        

    }

