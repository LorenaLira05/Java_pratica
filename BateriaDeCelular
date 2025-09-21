package ads.coding.lista.ex14;

public class BateriaDeCelular {
    private int carga; // de 0 a 100

    // Construtor: começa com carga inicial
    public BateriaDeCelular(int cargaInicial) {
        if (cargaInicial < 0) {
            this.carga = 0;
        } else if (cargaInicial > 100) {
            this.carga = 100;
        } else {
            this.carga = cargaInicial;
        }
    }

    // Método para consumir carga
    public void consumir(int quantidade) {
        if (quantidade < 0) return; // ignora valores inválidos
        carga -= quantidade;
        if (carga < 0) {
            carga = 0;
        }
        System.out.println("Bateria consumida: -" + quantidade + "%. Nível atual: " + carga + "%");
    }

    // Método para carregar a bateria
    public void carregar(int quantidade) {
        if (quantidade < 0) return;
        carga += quantidade;
        if (carga > 100) {
            carga = 100;
        }
        System.out.println("Bateria carregada: +" + quantidade + "%. Nível atual: " + carga + "%");
    }

    // Mostrar nível atual
    public void mostrarNivel() {
        System.out.println("Nível atual da bateria: " + carga + "%");
    }
}
