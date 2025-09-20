package ads.coding.lista.ex08;

public class RelogioDigital {
	    int hora;
	    int minuto;
	    
	    //construtor
	    public RelogioDigital(int horaInicial, int minutoInicial) {
	        hora = horaInicial;
	        minuto = minutoInicial;
	        
	    }
	    // Ajustar horário
	    public void setHorario(int novaHora, int novoMinuto) {
	        hora = novaHora;
	        minuto = novoMinuto;
	        System.out.println("Horário ajustado para " + hora + ":" + minuto);
	        
	    }
	    // Mostrar horário
	    public void status() {
	        System.out.println("Horário atual: " + hora + ":" + minuto);
	        
	    }

}

