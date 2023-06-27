package JFoPractice7;
import java.util.Random;

public class Cartao {
    private int numeroCartao;
    private int saldoCreditos;
    private int saldoTickets;

    public Cartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
        this.saldoCreditos = 0;
        this.saldoTickets = 0;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public int getSaldoCreditos() {
        return saldoCreditos;
    }

    public int getSaldoTickets() {
        return saldoTickets;
    }

    public void setSaldoCreditos(int saldoCreditos) {
        this.saldoCreditos = saldoCreditos;
    }

    public void setSaldoTickets(int saldoTickets) {
        this.saldoTickets = saldoTickets;
    }
}
