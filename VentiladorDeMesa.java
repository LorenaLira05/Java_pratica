package ads.coding.lista.ex04;

public class VentiladorDeMesa {
	 boolean ligado;
	  int velocidade; // 0 = desligado, 1 = baixo, 2  =médio, 3 = alto

	  //construtor
	  public VentiladorDeMesa() {
	    ligado = false;
	    velocidade = 0;
	  } 

	  //Método para ligar o ventilador
	    public void ligar(){
	      if(ligado) {
	        System.out.println("O ventilador já está ligado");
	      } else {
	        ligado = true;
	        System.out.println("Ligando... Ventilador ligado");
	      }
	    }

	  //Método para desligar o ventilador
	   public void desligar(){
	      if(!ligado) {
	        System.out.println("O ventilador já está desligado");
	      } else {
	        ligado = false;
	        velocidade = 0;
	        System.out.println("Desligando... Ventilador desligado");
	      }
	    }

	  //Método para aumentar a velocidade do ventilador
	     public void aumentarVelocidade(){
		    if(!ligado) {
		      System.out.println("Não é possivel aumentar a velocidade quando o ventilador está desligado");
		    } else if (velocidade <3) {
		    	velocidade ++ ;
		    	System.out.println("Aumentando a velocidade... Velocidade: " + velocidade );
		    } else { System.out.println("Velocidade já está no máximo");
	      }
		  }

	   //Método para diminuir a velocidade do ventilador
	    public void diminuirVelocidade(){
		    if(!ligado) {
		      System.out.println("Não é possivel diminuir a velocidade quando o ventilador está desligado");
		    } else if (velocidade > 1) {
		    	velocidade -- ;
		    	System.out.println("Diminuindo a velocidade... Velocidade: " + velocidade );
		    } else { System.out.println("Velocidade já está no mínimo");
	      }
		  }
	    
	    //status
	    public void status(){
	    System.out.println("Ventilador " + (ligado ? "ligado" : "desligado") + ", velocidade: " + velocidade);
	}
}
