package JFoPractice3;

import javax.swing.JOptionPane;

public class JFoPractice_3 {

public static void main(String[] args) {
    
        String name = JOptionPane.showInputDialog("Digite seu nome:");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em metros:"));
        String color = JOptionPane.showInputDialog("Digite sua cor favorita:");
        String animal = JOptionPane.showInputDialog("Digite um nome de um animal:");
        int number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        double temperature = Double.parseDouble(JOptionPane.showInputDialog("Digite uma temperatura em graus Celsius:"));
        String food = JOptionPane.showInputDialog("Digite o nome de um alimento:");
        String city = JOptionPane.showInputDialog("Digite o nome de uma cidade:");
        String hobby = JOptionPane.showInputDialog("Digite o nome de um hobby:");

        String story = "Olá, " + name + "! Sei que você tem " + age + " anos de idade e mede " + height + " metros de altura.";
        story += " Sua cor favorita é " + color + " e seu animal favorito é o(a) " + animal + ".";
        story += " Você escolheu o número " + number + " e está fazendo " + hobby + ".";
        story += " Hoje, a temperatura está em " + temperature + " graus Celsius, e você está na cidade de " + city + ".";
        story += " Para o seu almoço, você está comendo " + food + ".";

        JOptionPane.showMessageDialog(null, story);
}



}