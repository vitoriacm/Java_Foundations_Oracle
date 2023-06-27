package JFoPractice8;
import java.util.Random;

public class Jogo {
    
      private int placarTime1;
    private int placarTime2;
    private double temperatura;
    private int ID;
    private Equipe time1;
    private Equipe time2;
    private static final int GOLS_MAXIMOS = 5;
    private Random random = new Random();

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPlacarTime1() {
        return placarTime1;
    }

    public void setPlacarTime1(int placarTime1) {
        this.placarTime1 = placarTime1;
    }

    public int getPlacarTime2() {
        return placarTime2;
    }

    public void setPlacarTime2(int placarTime2) {
        this.placarTime2 = placarTime2;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public Equipe getTime1() {
        return time1;
    }

    public void setTime1(Equipe time1) {
        this.time1 = time1;
    }

    public Equipe getTime2() {
        return time2;
    }

    public void setTime2(Equipe time2) {
        this.time2 = time2;
    }

    public Jogo(int numero, Equipe equipe1, Equipe equipe2, double temperatura) {
        this.ID = numero;
        this.time1 = equipe1;
        this.time2 = equipe2;
        this.temperatura = temperatura;

        if (temperatura > 30) {
            this.placarTime1 = random.nextInt(GOLS_MAXIMOS + 1);
            this.placarTime2 = random.nextInt(GOLS_MAXIMOS + 1);
        } else {
            this.placarTime1 = random.nextInt(3);
            this.placarTime2 = random.nextInt(3);
        }

        equipe1.adicionarGolsMarcados(placarTime1);
        equipe1.adicionarGolsSofridos(placarTime2);
        equipe2.adicionarGolsMarcados(placarTime2);
        equipe2.adicionarGolsSofridos(placarTime1);

        if (placarTime1 > placarTime2) {
            equipe1.adicionarVitoria();
            equipe2.adicionarDerrota();
        } else if (placarTime1 < placarTime2) {
            equipe1.adicionarDerrota();
            equipe2.adicionarVitoria();
        } else {
            equipe1.adicionarEmpate();
            equipe2.adicionarEmpate();
        }
    }
}

