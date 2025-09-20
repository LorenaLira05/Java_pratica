package ads.coding.lista.ex07;

public class TermometroAmbiente {
	    double temperatura; // temperatura em graus Celsius

	    //construtor
	    public TermometroAmbiente(double tempInicial) {
	        temperatura = tempInicial;
	        
	    }
	    // Método para alterar a leitura da temperatura
	    public void setTemperatura(double novaTemp) {
	        temperatura = novaTemp;
	        System.out.println("Temperatura atualizada para " + temperatura + "°C");
	        
	    }
	    public void status() {
	        System.out.println("Temperatura atual do ambiente: " + temperatura + "°C");
	        
	    }
}
