package JFoPractice8;

import java.util.Scanner;

public class ProgramaLigaFutebol {
    
    public static void main(String[] args) {
        
        Equipe barcelona = new Equipe();  // foi criado uma variavel barcelona q é do tipo Equipe que receb o novo objeto
        Equipe realMadrid = new Equipe();
        Equipe valladolid = new Equipe();
        Equipe valencia = new Equipe();

        barcelona.setNome("Barcelona"); // estou alterando o nome do objeto barcelona
        realMadrid.setNome("Real Madrid");
        valladolid.setNome("valladolid");
        valencia.setNome("valencia");

       LigaFutebol liga = new LigaFutebol();

       Scanner teclado = new Scanner(System.in);
       
       double temperatura;
       int p1, p2;
       
       do {
        System.out.println("Digite a temperatura da semana");
        temperatura = teclado.nextDouble();

        Jogo jogoSemana = new Jogo();

        System.out.println("Digite o placar do time 1");
        p1= teclado.nextInt();
        System.out.println("Digite o placar do time 2");
        p2 = teclado.nextInt();

        jogoSemana.setPlacarTime1(p1);
        jogoSemana.setPlacarTime2(p2);
        jogoSemana.setTemperatura(temperatura);

        liga.tabelaDeJogos.add( jogoSemana);

       } while (temperatura > 0);

        Jogo jogoDeAbertura = new Jogo(); //jogodeabertura é o objeto
        jogoDeAbertura.setTemperatura(30); // estou mudando a temperatura 
        jogoDeAbertura.setTime1(barcelona);  // estou passando o objeto inteiro
        jogoDeAbertura.setTime2(realMadrid);
        jogoDeAbertura.setPlacarTime1(5);
        jogoDeAbertura.setPlacarTime2(2);

        liga.tabelaDeJogos.add(0, jogoDeAbertura);  // adcionei objeto dentro de um vetor q aumenta com o tempo
        
        Jogo partidaFinal = new Jogo();

        liga.tabelaDeJogos.add(0, partidaFinal);

        liga.tabelaDeJogos.get(2); // significa que estou pegar a informação do array

        System.out.println(
            
        jogoDeAbertura.getTime1().getNome()
        
        + " " +
        jogoDeAbertura.getPlacarTime1() + " X " + jogoDeAbertura.getPlacarTime2() 
        
        + " " +
        jogoDeAbertura.getTime2().getNome()
        );
    
    }
}
