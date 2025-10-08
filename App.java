package personagens;

public class App {
		   public static void main(String[] args) {
	
		       Personagem Princesa = new PrincesaDaLua();
		       Personagem Fada = new FadaDoTempo();
		       Personagem Guerreira = new GuerreiraFloral();
		       
		       System.out.println("\n==Princesa da lua==");
		       Princesa.atacar();
		       Princesa.defender();
		       Princesa.habilidadeEspecial();
		       
		       System.out.println("\n==Fada do tempo==");
		       Fada.atacar();
		       Fada.defender();
		       Fada.habilidadeEspecial();
		       
		       System.out.println("\n==Guerreira Floral==");
		       Guerreira.atacar();
		       Guerreira.defender();
		       Guerreira.habilidadeEspecial();
		   }
		
}
