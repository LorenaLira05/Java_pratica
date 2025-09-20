package ads.coding.lista.ex10;

public class ElevadorPredial {
	    int andarAtual;
	    int andarMin;
	    int andarMax;

	    // Construtor
	    public ElevadorPredial(int andarMin, int andarMax) {
	        this.andarMin = andarMin;
	        this.andarMax = andarMax;
	        this.andarAtual = andarMin; // começa no térreo
	    }

	    // Subir 1 andar
	    public void subir() {
	        if (andarAtual < andarMax) {
	            andarAtual++;
	            System.out.println("Subiu para o andar " + andarAtual);
	        } else {
	            System.out.println("Já está no último andar (" + andarMax + "). Não pode subir mais!");
	        }
	    }

	    // Descer 1 andar
	    public void descer() {
	        if (andarAtual > andarMin) {
	            andarAtual--;
	            System.out.println("Desceu para o andar " + andarAtual);
	        } else {
	            System.out.println("Já está no térreo (" + andarMin + "). Não pode descer mais!");
	        }
	    }

	    public void status() {
	        System.out.println("Elevador está no andar: " + andarAtual);
	    }

}
