package JFoPractice8;

import java.util.ArrayList;
import java.util.List;

public class LigaFutebol {
    
    private List<Jogo> tabelaDeJogos;
    private List<Equipe> equipes;

    public LigaFutebol() {
        tabelaDeJogos = new ArrayList<>();
        equipes = new ArrayList<>();
    }

    public void adicionarEquipe(Equipe equipe) {
        equipes.add(equipe);
    }

    public void adicionarJogo(Jogo jogo) {
        tabelaDeJogos.add(jogo);
    }

    public void imprimirEstatisticas() {
        for (Equipe equipe : equipes) {
            System.out.println("Estatísticas da equipe " + equipe.getNome());
            System.out.println("Total de vitórias: " + equipe.getTotalVitorias());
            System.out.println("Total de derrotas: " + equipe.getTotalDerrotas());
            System.out.println("Total de empates: " + equipe.getTotalEmpates());
            System.out.println("Gols marcados: " + equipe.getGolsMarcados());
            System.out.println("Gols sofridos: " + equipe.getGolsSofridos());
            System.out.println("--------------------------------------");
        }
    }
}
