package JFoPractice7;

public class Fliperama {
    
    public static void main(String[] args) {
        
        Cartao cartao1 = new Cartao(1);
        Cartao cartao2 = new Cartao(2);
        
        CategoriaDePremio[] categorias = {
            new CategoriaDePremio("Categoria A", 5, 10),
            new CategoriaDePremio("Categoria B", 10, 5),
            new CategoriaDePremio("Categoria C", 15, 3)
        };
        
        Terminal terminal = new Terminal(2, categorias);
        
        terminal.inserirDinheiro(cartao1, 10);
        terminal.inserirDinheiro(cartao2, 20);
        
        jogo jogo1 = new jogo();
        jogo jogo2 = new jogo();
        
        jogo1.jogar(cartao1);
        jogo1.jogar(cartao2);
        jogo2.jogar(cartao1);
        
        terminal.transferirCreditos(cartao1, cartao2, 4);
        
        terminal.resgatarPremio(cartao2, 1);
        terminal.resgatarPremio(cartao1, 2);
        
        terminal.verificarSaldoCartao(cartao1);
        terminal.verificarSaldoCartao(cartao2);
    }

}







