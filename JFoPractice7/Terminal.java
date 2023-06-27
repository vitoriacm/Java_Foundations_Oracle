package JFoPractice7;

public class Terminal {
    
    private LeitorCartao leitorCartao;
    private int taxaDolarParaCreditos;
    private CategoriaDePremio[] categoriasPremio;

    public Terminal(int taxaDolarParaCreditos, CategoriaDePremio[] categoriasPremio) {
        this.leitorCartao = new LeitorCartao();
        this.taxaDolarParaCreditos = taxaDolarParaCreditos;
        this.categoriasPremio = categoriasPremio;
    }

    public void inserirDinheiro(Cartao cartao, int valor) {
        int creditos = valor * taxaDolarParaCreditos;
        cartao.setSaldoCreditos(cartao.getSaldoCreditos() + creditos);
        System.out.println("Cartão " + cartao.getNumeroCartao() + ": Adicionou " + creditos + " créditos.");
        System.out.println("Novo saldo de créditos: " + cartao.getSaldoCreditos());
    }

    public void verificarSaldoCartao(Cartao cartao) {
        System.out.println("Cartão " + cartao.getNumeroCartao() + ": Saldo de créditos: " + cartao.getSaldoCreditos());
        System.out.println("Cartão " + cartao.getNumeroCartao() + ": Saldo de tickets: " + cartao.getSaldoTickets());
    }

    public void transferirCreditos(Cartao cartaoOrigem, Cartao cartaoDestino, int quantidade) {
        if (cartaoOrigem.getSaldoCreditos() >= quantidade) {
            cartaoOrigem.setSaldoCreditos(cartaoOrigem.getSaldoCreditos() - quantidade);
            cartaoDestino.setSaldoCreditos(cartaoDestino.getSaldoCreditos() + quantidade);
            System.out.println("Transferidos " + quantidade + " créditos do Cartão " + cartaoOrigem.getNumeroCartao() +
                    " para o Cartão " + cartaoDestino.getNumeroCartao());
            System.out.println("Novo saldo de créditos do Cartão " + cartaoOrigem.getNumeroCartao() + ": " +
                    cartaoOrigem.getSaldoCreditos());
            System.out.println("Novo saldo de créditos do Cartão " + cartaoDestino.getNumeroCartao() + ": " +
                    cartaoDestino.getSaldoCreditos());
        } else {
            System.out.println("Cartão " + cartaoOrigem.getNumeroCartao() + ": Créditos insuficientes para transferir.");
        }
    }

    public void resgatarPremio(Cartao cartao, int indiceCategoria) {
        CategoriaDePremio categoria = categoriasPremio [indiceCategoria];
        if (cartao.getSaldoTickets() >= categoria.getTicketsNecessarios() && categoria.getItensRestantes() > 0) {
            cartao.setSaldoTickets(cartao.getSaldoTickets() - categoria.getTicketsNecessarios());
            categoria.setItensRestantes(categoria.getItensRestantes() - 1);
            System.out.println("Cartão " + cartao.getNumeroCartao() + ": Resgatou prêmio da categoria " +
                    categoria.getNome() + ".");
            System.out.println("Novo saldo de tickets: " + cartao.getSaldoTickets());
            System.out.println("Itens restantes na categoria " + categoria.getNome() + ": " +
                    categoria.getItensRestantes());
        } else {
            System.out.println("Cartão " + cartao.getNumeroCartao() + ": Tickets insuficientes ou não há mais itens " +
                    "na categoria " + categoria.getNome() + ".");
        }
    }
    class LeitorCartao {
    public void passarCartao(Cartao cartao) {
        System.out.println("Cartão " + cartao.getNumeroCartao() + ": Passou no leitor de cartão.");
    }
}
}

