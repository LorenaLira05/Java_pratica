/** Classe de domínio: CarroBasico. O que deve representar? 
Carro que liga/desliga, acelera/freira e mostra velocidade atual. 
Demonstre: dois carros com sequências de uso distintas.
**/
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
	    if (ligado == false) {
	      System.out.println("O carro já está desligado");
	    } else { 
	    	ligado = false;
	    	velocidade = 0;
	    	System.out.println("Desligando... Carro desligado");
	      
	    }
	  }
	  
	//Método para acelerar o carro
	  public void acelerar(){
	    if(ligado == false) {
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

 public static void main(String[] args) {
   //Criando o primeiro carro
   CarroBasico c1 = new CarroBasico();
     c1.ligar();
     c1.acelerar();
     c1.acelerar();
     c1.freiar();
     c1.freiar();
     c1.desligar();
     c1.status();
   
   //Criando segundo carro
     CarroBasico c2 = new Carrobasico();
     c2.status();
     c2.acelerar();
     c2.ligar();
     c2.acelerar();
     c2.freiar();
     c2.desligar();
     c2.status();
     
     
 }
