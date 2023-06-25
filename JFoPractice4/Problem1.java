package JFoPractice4;

import java.util.Random;

public class Problem1 {

 public static double Fahrenheit (double Fahrenheit, double Celsius){
            Celsius = (5.0 / 9.0) * (Fahrenheit - 32);
            return Celsius;
           }

public static double CalcularHipotenusa (double ladoA, double ladoB ){
double hipotenusa = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2));
     return hipotenusa;
}

public static int girarDado(){    // Simula o giro de dois dados de seis lados e exibe a soma deles. 
Random random = new Random();
int dado1 = random.nextInt(6) + 1;
int dado2 = random.nextInt(6) + 1;
int soma = dado1 + dado2;
return soma;
}

}


