package JFoPractice8;

public class Equipe {
    
    private String nome;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int golsMarcados;
    private int golsSofridos;


    public String getNome(){    // para que esse metodo seja acessado por qualquer um desse programa usa o public
        return nome;
    }

    public void setNome (String n){   // void pois n tem retorno 
        nome = n;
    }

    public int getVitorias(){
        return vitorias;
    }

    public void setVitorias(int v){
        vitorias = v;
    }

    public int getDerrotas (){
        return derrotas;
    }
    public void setDerrotas(int d){
        derrotas = d;
    }
    
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public int getGolsMarcados() {
        return golsMarcados;
    }
    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }
    public int getGolsSofridos() {
        return golsSofridos;
    }
    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos = golsSofridos;
    }
}

