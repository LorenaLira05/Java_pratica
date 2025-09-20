package ads.coding.lista.ex25;

public class CaixaDeSom {
    boolean ligada;
    int volume; // 0 a 100
    int volumeAnterior; // para guardar antes de mutar
    boolean mudo;

    // Construtor
    public CaixaDeSom() {
        ligada = false;
        volume = 10;
        volumeAnterior = 10;
        mudo = false;
    }

    // Ligar
    public void ligar() {
        if(ligada) {
            System.out.println("A caixa de som já está ligada");
        } else {
            ligada = true;
            System.out.println("Ligando... Caixa de som ligada");
        }
    }

    // Desligar
    public void desligar() {
        if(!ligada) {
            System.out.println("A Caixa de som já está desligada");
        } else {
            ligada = false;
            System.out.println("Desligando... Caixa de som desligada");
        }
    }

    // Aumentar volume
    public void aumentarVolume() {
        if(!ligada) {
            System.out.println("Não é possível aumentar o volume quando a caixa está desligada");
        } else if(volume < 100) {
            volume++;
            mudo = false; // desativa o mudo se estava ativo
            System.out.println("Aumentando o volume... Volume: " + volume);
        } else {
            System.out.println("O volume já está no máximo");
        }
    }

    // Diminuir volume
    public void diminuirVolume() {
        if(!ligada) {
            System.out.println("Não é possível diminuir o volume quando a caixa está desligada");
        } else if(volume > 0) {
            volume--;
            System.out.println("Diminuindo o volume... Volume: " + volume);
        } else {
            System.out.println("O volume já está no mínimo");
        }
    }

    // Modo mudo 
    public void mutar() {
        if(!ligada) {
            System.out.println("Não é possível mutar a caixa de som quando ela está desligada");
            return;
        }

        if(!mudo) {
            volumeAnterior = volume;
            volume = 0;
            mudo = true;
            System.out.println("Mutando... Caixa de som no modo mudo");
        } else {
            volume = volumeAnterior;
            mudo = false;
            System.out.println("Desmutando... Volume restaurado para: " + volume);
        }
    }

    // Status da caixa
    public void status() {
        System.out.println("Ligada: " + ligada + " | Volume: " + volume + " | Mudo: " + mudo);
    }
}
