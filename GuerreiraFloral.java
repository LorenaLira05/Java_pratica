package personagens;

public class GuerreiraFloral implements Personagem {

		   @Override
		   public void atacar() {
		       System.out.println("Guerreira Floral libera vinhas encantadas que atacam os inimigos!");
		   }
		   @Override
		   public void defender() {
		       System.out.println("Guerreira Floral invoca pétalas que formam uma barreira protetora!");
		   }
		   @Override
		   public void habilidadeEspecial() {
		       System.out.println("Guerreira Floral convoca a força da natureza, causando uma explosão de flores que cura aliados e danifica inimigos!");
		   }
		

}
