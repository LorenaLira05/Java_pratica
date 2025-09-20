package ads.coding.lista.ex01;

public class LampadaInteligente {
	  public boolean ligada;
	  public int intensidade;
	  public  String tipoDaLuz;
	  public String modo;

	   //Construtor
	    public LampadaInteligente() {
	        this.ligada = false;
	        this.intensidade = 0;
	        this.tipoDaLuz = "branca";
	        this.modo = "desligada";
	        // A lâmpada começa desligada
	    }

	    //Método para ligar a lâmpada
	    public void ligar() {
	        //Liga a lâmpada
	        if(this.ligada) {
	            System.out.println("A Lâmpada já está ligada");
	        } else {
	            ligada = true;
	          if (intensidade == 0) intensidade = 50;
	          modo = "normal";
	          System.out.println("Lâmpada ligada");
	        }
	        
	    }
	    //Método para desligar a lâmpada
	    public void desligar() {
	        //Desliga a lâmpada
	       if(!this.ligada) {
	           System.out.println("A lâmpada já está desligada");
	       } else  {
	           ligada = false;
	           intensidade = 0;
	           modo = "desligada";
	           System.out.println("Lâmpada desligada");
	       }
	       
	    }
	    
	  /*Métodos para aumentar e diminuir a intensidade 
	   * (provavelmente um detalhe um pouco inútil, mas decidi colocar já que a 
	   * lâmpada tem vários modos
	   */
	    public void aumentarIntensidade() {
	        if (this.ligada &&  this.intensidade < 100) {
	            this.intensidade +=10;
	            System.out.println("Intensidade aumentada para: " + intensidade);
	        }
	        
	    }

	    public void diminuirIntensidade() {
	        if (this.ligada &&  this.intensidade > 0) {
	            this.intensidade -=10;
	            System.out.println("Intensidade diminuida para: " + intensidade);
	        }
	        
	    }
	    
	    public void trocarTipoDaLuz(String novoTipo) {
	        if (this.ligada &&  this.tipoDaLuz.equals("branca"))  {
	            this.tipoDaLuz = novoTipo;
	            System.out.println("Tipo de Luz trocado para: " + tipoDaLuz);
	        }
	        
	    }
	    // --- MODOS ESPECIAIS ---
	    public void setModoRelax() {
	        this.ligada = true;
	        this.intensidade = 50;
	        this.tipoDaLuz = "Amarela";
	        this.modo = "Relax";
	        System.out.println("Lâmpada configurada no modo Relax.");
	    }

	    public void setModoEstudo() {
	        this.ligada = true;
	        this.intensidade = 100;
	        this.tipoDaLuz = "Branca";
	        this.modo = "Estudo";
	        System.out.println("Lâmpada configurada no modo Estudo.");
	    }
	    
	    // Mostra status atual
	    public void status() {
	        System.out.println("Ligada: " + ligada +
	                " \nIntensidade: " + intensidade +
	                " \nTipo da Luz: " + tipoDaLuz +
	                " \nModo: " + modo);
	    }  
}
