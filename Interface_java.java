public class App {
    public static void main(String[] args) {
        Pagamento cartao = new PagamentoCartao("4111111111111111");
        Pagamento pix = new PagamentoPix("chave@exemplo.com");


        Checkout checkout = new Checkout(cartao);
        String tx1 = checkout.pagar(120.00);


        checkout.setGateway(pix);
        String tx2 = checkout.pagar(75.50);


        checkout.estornar(tx1);
        checkout.estornar(tx2);
    }
}


public interface Pagamento {
    String processar(double valor);     // retorna id da transação
    boolean estornar(String transacaoId);


    default void validarValor(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor deve ser > 0");
    }
}


public class PagamentoCartao implements Pagamento {
    private final String numeroMascarado;


    public PagamentoCartao(String numero) {
        if (numero == null || numero.length() < 4)
            throw new IllegalArgumentException("Número de cartão inválido");
        this.numeroMascarado = "**** **** **** " + numero.substring(numero.length() - 4);
    }


    @Override
    public String processar(double valor) {
        validarValor(valor);
        String id = "CC-" + System.currentTimeMillis();
        System.out.printf("Cartão %s cobrado: R$ %.2f | tx=%s%n", numeroMascarado, valor, id);
        return id;
    }


    @Override
    public boolean estornar(String transacaoId) {
        System.out.printf("Estorno no cartão %s | tx=%s%n", numeroMascarado, transacaoId);
        return true;
    }
}


public class PagamentoPix implements Pagamento {
    private final String chave;


    public PagamentoPix(String chave) {
        if (chave == null || chave.isBlank())
            throw new IllegalArgumentException("Chave PIX inválida");
        this.chave = chave;
    }
	
    @Override
    public String processar(double valor) {
        validarValor(valor);
        String id = "PIX-" + System.nanoTime();
        System.out.printf("PIX para %s: R$ %.2f | tx=%s%n", chave, valor, id);
        return id;
    }


    @Override
    public boolean estornar(String transacaoId) {
        System.out.printf("Estorno PIX | tx=%s%n", transacaoId);
        return true;
    }
}


public class Checkout {
    private Pagamento gateway;


    public Checkout(Pagamento gateway) {
        this.gateway = gateway;
    }


    public void setGateway(Pagamento gateway) {
        this.gateway = gateway;
    }


    public String pagar(double valor) {
        return gateway.processar(valor);
    }


    public void estornar(String transacaoId) {
        gateway.estornar(transacaoId);
    }
}


