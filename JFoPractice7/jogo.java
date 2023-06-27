package JFoPractice7;

import java.util.Random;

public class jogo {
    
   private int creditosNecessarios;
    private Random random;

    public void Jogo(int creditosNecessarios) {
        this.creditosNecessarios = creditosNecessarios;
        this.random = new Random();
    }

    public void jogar(Cartao cartao) {
        if (cartao.getSaldoCreditos() >= creditosNecessarios) {
            int tickets = random.nextInt(10);
            cartao.setSaldoCreditos(cartao.getSaldoCreditos() - creditosNecessarios);
            cartao.setSaldoTickets(cartao.getSaldoTickets() + tickets);
            System.out.println("Cartão " + cartao.getNumeroCartao() + ": Jogou o jogo e ganhou " + tickets + " tickets.");
            System.out.println("Novo saldo de créditos: " + cartao.getSaldoCreditos());
            System.out.println("Novo saldo de tickets: " + cartao.getSaldoTickets());
        } else {
            System.out.println("Cartão " + cartao.getNumeroCartao() + ": Créditos insuficientes para jogar o jogo.");
        }
    }
}



