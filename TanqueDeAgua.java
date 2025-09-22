package ads.coding.lista.ex29;

public class TanqueDeAgua {
    private int nivel;
    private final int capacidadeMaxima;

    public TanqueDeAgua(int capacidade) {
        capacidadeMaxima = capacidade;
        nivel = 0;
    }

    public void encher(int quantidade) {
        nivel += quantidade;
        if (nivel > capacidadeMaxima) nivel = capacidadeMaxima;
    }

    public void esvaziar(int quantidade) {
        nivel -= quantidade;
        if (nivel < 0) nivel = 0;
    }

    public int getNivel() { return nivel; }

    public static void main(String[] args) {
        TanqueDeAgua tanque = new TanqueDeAgua(100);

        tanque.encher(120); // sobe até 100
        System.out.println("Nível: " + tanque.getNivel());

        tanque.esvaziar(150); // não vai abaixo de 0
        System.out.println("Nível: " + tanque.getNivel());
    }
}

