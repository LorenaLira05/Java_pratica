package personagens;

public class PrincesaDaLua implements Personagem {
	@Override
	   public void atacar() {
	       System.out.println("Princesa da Lua usa o brilho da lua para cegar temporariamente seus inimigos!");
	   }
	   @Override
	   public void defender() {
	       System.out.println("Princesa da Lua manipula o tempo para poder fugir dos seus inimigos!");
	   }
	   @Override
	   public void habilidadeEspecial() {
	       System.out.println("Princesa da Lua convoca a força da lua para se transformar em diferentes animais e usar suas respectivas habilidades para atacar seus inimigos");
	   }
}
