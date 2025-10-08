package personagens;

public class FadaDoTempo implements Personagem {
	
	@Override
	   public void atacar() {
	       System.out.println("A fada do tempo manipula a idade dos seus inimigos, tornando-os crianças novamente!");
	   }
	   @Override
	   public void defender() {
	       System.out.println("A fada do tempo paralisa o tempo para poder fugir dos seus inimigos!");
	   }
	   @Override
	   public void habilidadeEspecial() {
	       System.out.println("A fada do tempo pode viajar e/ou enviar outros para o futuro/passado. ");
	   }
	   
}
