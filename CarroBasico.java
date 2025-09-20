package ads.coding.lista.ex03;

public class CarroBasico {
	boolean ligado;
	  int velocidade;
	  
	//construtor
	  public CarroBasico() {
	    ligado = false;
	    velocidade = 0;
	  }

	//Método para ligar o carro
	  public void ligar(){
	    if (ligado) {
	      System.out.println("O carro já está ligado");
	    } else { 
	    	ligado = true;
	    	System.out.println("Ligando... Carro ligado");
	      
	    }
	  }
	  
	//Método para desligar o carro
	  public void desligar(){
	    if (!ligado) {
	      System.out.println("O carro já está desligado");
	    } else { 
	    	ligado = false;
	    	velocidade = 0;
	    	System.out.println("Desligando... Carro desligado");
	      
	    }
	  }
	  
	//Método para acelerar o carro
	  public void acelerar(){
	    if(!ligado) {
	      System.out.println("Não é possivel acelerar um carro desligado");
	    } else {
	    	velocidade +=10;
	    	System.out.println("Acelerando... Velocidade: " + velocidade );
	    }
	  }

	  //Método para freiar o carro
	  public void freiar(){
	    if(velocidade == 0) {
	      System.out.println("O carro já está a 0km");
	    } else {velocidade -=10;
	    System.out.println("Freiando... Velocidade: " + velocidade);
	  }
	 }
	  
	//Método para mostrar a velocidade atual
	  public void status() {
	    System.out.println("Carro " + (ligado ? "ligado" : "desligado"));
	    System.out.println("Velocidade atual: " + velocidade);
	  }
	  
}
