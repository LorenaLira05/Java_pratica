package ads.coding.lista.ex19;

public class Torneira {
	boolean ligada;
	int intensidadeFluxo; //Vai de 1-3, quando ligada
	
	//Construtor
	//A pia começa fechada e com intensidade 0
	public Torneira() {
		ligada = false;
		intensidadeFluxo = 0 ;
    
	}
	
 //Método para ligar a pia
    public void ligar(){
      if(ligada) {
        System.out.println("A pia já está ligada");
      } else {
        ligada = true;
        intensidadeFluxo = 1;
        System.out.println("Ligando...pia ligada");
      }
      
    }
	
   //Método para desligar a pia
	   public void desligar(){
	      if(!ligada) {
	        System.out.println("A pia já está desligada");
	      } else {
	        ligada = false;
	        intensidadeFluxo = 0;
	        System.out.println("Desligando... pia desligada");
	      }
       
	    }
	   
	 //Método para aumentar a intensidade
	     public void aumentarFluxo(){
		    if(!ligada) {
		      System.out.println("Não é possivel aumentar a intensidade quando a pia está desligada");
		    } else if (intensidadeFluxo <3) {
		    	intensidadeFluxo ++ ;
		    	System.out.println("Aumentando a intensidade... Intensidade: " + intensidadeFluxo );
		    } else { System.out.println("A intensidade já está no máximo");
	      }
         
	  }
	
	     //Método para diminuir a intensidade
	     public void diminuirFluxo(){
			    if(!ligada) {
			      System.out.println("Não é possivel diminuir a intensidade quando a pia está desligada");
			    } else if (intensidadeFluxo > 1) {
			    	intensidadeFluxo -- ;
			    	System.out.println("Diminuindo a intensidade... Intensidade: " + intensidadeFluxo );
			    } else { System.out.println("A intensidade já está no mínimo");
		      }
         
		  }
	     
	     public void status() {
	    	 System.out.println("Pia " + (ligada ? "ligada" : "desligada") + ", velocidade: " + intensidadeFluxo);
	    	 
	     }  
}
