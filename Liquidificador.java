package ads.coding.lista.ex20;

public class Liquidificador {
    boolean ligado;
    int velocidade; // 1 a 3

    // Construtor
    public Liquidificador() {
        ligado = false;
        velocidade = 0;
    }

    // Método para Ligar
    public void ligar() {
        if (!ligado) {
            ligado = true;
            velocidade = 1;
            System.out.println("Ligando... Liquidificador ligado na velocidade " + velocidade);
        } else {
            System.out.println("O liquidificador já está ligado");
        }
    }

    // Método para Desligar
    public void desligar() {
        if (ligado) {
            ligado = false;
            velocidade = 0;
            System.out.println("Desligando... Liquidificador desligado.");
        } else {
            System.out.println("O liquidificador já está desligado");
        }
    }

    // Método para bater
    public void bater() {
        if (ligado) {
            if (velocidade >= 1 && velocidade <= 3) {
                System.out.println("Batendo! O liquidificador está funcionando na velocidade " + velocidade + ".");
            } else {
                System.out.println("Velocidade inválida! Só é permitido de 1 a 3.");
            }
        } else {
            System.out.println("Tentando bater... mas o liquidificador está desligado!");
        }
    }
}
