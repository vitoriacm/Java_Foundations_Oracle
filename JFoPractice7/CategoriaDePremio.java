package JFoPractice7;

public class CategoriaDePremio{

   private String nome;
    private int ticketsNecessarios;
    private int itensRestantes;

    public CategoriaDePremio(String string, int i, int j) {
    }

    public void CategoriaPremio(String nome, int ticketsNecessarios, int itensRestantes) {
        this.nome = nome;
        this.ticketsNecessarios = ticketsNecessarios;
        this.itensRestantes = itensRestantes;
    }

    public String getNome() {
        return nome;
    }

    public int getTicketsNecessarios() {
        return ticketsNecessarios;
    }

    public int getItensRestantes() {
        return itensRestantes;
    }

    public void setItensRestantes(int itensRestantes) {
        this.itensRestantes = itensRestantes;
    }
}


