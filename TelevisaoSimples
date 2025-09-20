package ads.coding.lista.ex05;

public class TelevisaoSimples {
	boolean ligado;
	int canal;
	int volume; // De 0 a 100
	
	//construtor
	public TelevisaoSimples() {
		ligado = false;
		canal = 2;
		volume = 10;
		
	}
	//método para ligar
	public void ligar() {
		if(ligado) {
	        System.out.println("A TV já está ligada");
	      } else {
	        ligado = true;
	        System.out.println("Ligando... TV ligada");
	      }
		
	}
	//método para ligar
	public void desligar() {
		if(!ligado) {
	        System.out.println("A TV já está desligada");
	      } else {
	        ligado = false;
	        System.out.println("Desligando... TV desligada");
	      }
		
	}
	//método para aumentar volume
	 public void aumentarVolume(){
		    if(!ligado) {
		      System.out.println("Não é possivel aumentar o volume quando a TV está desligado"); //não permite aumentar o volume se a TV estiver desligada
		    } else if (volume < 100) {
		    	volume ++ ;
		    	System.out.println("Aumentando o volume... Volume: " + volume );
		    } else { System.out.println("O volume já está no máximo");
	      }
		    
	}
	//método para diminuir volume
	 public void diminuirVolume(){
		    if(!ligado) {
		      System.out.println("Não é possivel diminuir o volume quando a TV está desligada"); //não permite diminuir o volume se a TV estiver desligada
		    } else if (volume > 0) {
		    	volume -- ;
		    	System.out.println("Diminuir o volume... Volume: " + volume );
		    } else { System.out.println("O volume já está no mínimo");
	      }
		    
	 }
	//método para trocar de canal
	 public void trocarCanal(int novoCanal) {
		 	if(!ligado) {
		      System.out.println("Não é possivel trocar de canal quando a TV está desligada"); //não permite trocar de canal se a TV estiver desligada
		 	} else { 
		 		canal = novoCanal;
		 		System.out.println("O canal mudou para: " + canal);
		 	}
		 
	 }
	 public void status() {
		 System.out.println("TV: " + (ligado ? "ligada" : "desligada")+ ", Canal: " + canal + ", Volume: " + volume);
	 }
	 
}

