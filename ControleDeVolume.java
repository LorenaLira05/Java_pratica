package ads.coding.lista.ex11;

public class ControleDeVolume {
	int volume; //De 0 a 100
	
	//Construtor 
	public ControleDeVolume() {
		volume = 10;
	}
	
	//Método para aumentar o volume em 1 
	public void aumentarVolume() {
		if (volume == 100) {
			System.out.println("O volume já está no máximo");
		} else {
			volume++ ;
			System.out.println("Aumentando...Volume aumentado para: " + volume);
		}
		
	}
	//Método para diminuir o volume em 1
	public void diminuirVolume() {
		if (volume == 0) {
			System.out.println("O volume já está no mínimo");
		} else {
			volume-- ;
			System.out.println("Diminuindo...Volume diminuido para: " + volume);
		}
		
	}
	//Método para escolher o volume
	public void setVolume(int volume) {
		if(volume < 0) {
			System.out.println("Não foi possível alterar o volume. O volume mínimo é 0");
		} else if(volume > 100) {
			System.out.println("Não foi possível alterar o volume. O máximo é 100");
		} else {
			this.volume = volume; 
			System.out.println("Volume alterado para: " + this.volume);
		}
			
	}
	
	//Método para visualizar o volume
	public void getVolume() {
		System.out.println("O volume atual é: " + volume);
	}
}
