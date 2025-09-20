package ads.coding.lista.ex20;

public class Liquidificador {
	boolean ligado;
	  int velocidade; // 1 = baixo, 2  =médio, 3 = alto

	  //construtor
	  //O liquidificador começa desligado e na velocidade 0
	  public Liquidificador() {
	    ligado = false;
	    velocidade = 0;
	  } 

	  //Método para ligar o liquidificador
	    public void ligar(){
	      if(ligado) {
	        System.out.println("O liquidificador já está ligado");
	      } else {
	        ligado = true;
	        System.out.println("Ligando... liquidificador ligado");
	      }
	    }

	  //Método para desligar o liquidificador
	   public void desligar(){
	      if(!ligado) {
	        System.out.println("O liquidificador já está desligado");
	      } else {
	        ligado = false;
	        velocidade = 0;
	        System.out.println("Desligando... liquidificador desligado");
	      }
	    }

	  //Método para aumentar a velocidade do ventilador
	     public void aumentarVelocidade(){
		    if(!ligado) {
		      System.out.println("Não é possivel aumentar a velocidade quando o liquidificador está desligado");
		    } else if (velocidade <3) {
		    	velocidade ++ ;
		    	System.out.println("Aumentando a velocidade... Velocidade: " + velocidade );
		    } else { System.out.println("Velocidade já está no máximo");
	      }
		  }

	   //Método para diminuir a velocidade do ventilador
	    public void diminuirVelocidade(){
		    if(!ligado) {
		      System.out.println("Não é possivel diminuir a velocidade quando o liquidificador está desligado");
		    } else if (velocidade > 1) {
		    	velocidade -- ;
		    	System.out.println("Diminuindo a velocidade... Velocidade: " + velocidade );
		    } else { System.out.println("Velocidade já está no mínimo");
	      }
		  }
	    
	    //status
	    public void status(){
	    System.out.println("liquidificador " + (ligado ? "ligado" : "desligado") + ", velocidade: " + velocidade);
	}
}
