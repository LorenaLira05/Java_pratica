package lampadas;

public class Lampada {
	boolean ligada = false;
	
	//metodos
	public void ligar() {
		ligada = false;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	public void status() {
		
		if (ligada == true)
			System.out.println("Ligada");
			else 
				System.out.println("Desligada");
	}
	
	public static void main(String[] args) {
		
		Lampada l1 = new Lampada();
		
		l1.status();
		l1.ligar();
		l1.status();

	}

}
