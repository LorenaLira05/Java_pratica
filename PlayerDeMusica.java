package ads.coding.lista.ex09;

public class PlayerDeMusica {
	    String faixa;
	    String status; // "parado", "tocando", "pausado"

	    // Construtor
	    public PlayerDeMusica(String faixaInicial) {
	        this.faixa = faixaInicial;
	        status = "parado";
	    }

	    // Método para tocar
	    public void tocar() {
	        status = "tocando";
	        System.out.println("Tocando faixa: " + faixa);
	    }

	    // Método para pausar
	    public void pausar() {
	        if (status.equals("tocando")) {
	            status = "pausado";
	            System.out.println("Faixa pausada: " + faixa);
	        } else {
	            System.out.println("Não é possível pausar — player não está tocando.");
	        }
	    }

	    // Método para parar
	    public void parar() {
	        if (!status.equals("parado")) {
	            status = "parado";
	            System.out.println("Faixa parada: " + faixa);
	        } else {
	            System.out.println("Player já está parado.");
	        }
	    }
	    
	    public void status() {
	        System.out.println("Faixa: " + faixa + " | Status: " + status);
	    }

	   
}

