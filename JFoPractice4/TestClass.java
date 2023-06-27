package JFoPractice4;

public class TestClass {
    
    public static void main(String[] args) {
        
        ComputeMethods computeMethods = new ComputeMethods();

        double tempFahrenheit = 100.0;
        double tempCelsius = Problem1.Fahrenheit(tempFahrenheit, 0.0);
        System.out.println("Temp em Celsius: " + tempCelsius);

        double ladoA = 3.0;
        double ladoB = 4.0;
        double hipotenusa = Problem1.CalcularHipotenusa(ladoA, ladoB);
        System.out.println("Hipotenusa: " + hipotenusa);

        int somaDados = Problem1.girarDado();
        System.out.println("Soma dos valores dos dados: " + somaDados);
    }
}
