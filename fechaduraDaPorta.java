package ads.coding.lista.ex02;

public class fechaduraDaPorta {
  //Atributos da classe
    boolean aberta;
    boolean trancada;
  
  //Construtor
    public fechaduraDaPorta() {
        this.aberta = true;
        this.trancada = false;
        // A porta começa aberta e destrancada
    }
    //Metodos
      public void abrirPorta() {
        //abre a porta
        if(this.aberta == true) {
            System.out.println("A porta já está aberta!");
        } else {
            aberta = true;
          System.out.println("Porta aberta!");
        }
    }
      public void fecharPorta() {
        //fecha a porta
            if(this.aberta == false) {
            System.out.println("A porta já está fechada!");
            } else {
            aberta = false;
            System.out.println("Porta fechada!");
        }

      }

     public void trancarPorta() {
        //tranca a porta (se ela estiver fechada)
          if(this.aberta == true) {
            System.out.println("Voce nao pode trancar a porta se ela estiver aberta!");
          } else if (trancada == true){
            System.out.println("A porta ja esta trancada!");
          } else {
            trancada == true;
              System.out.println("Trancando...Porta trancada!");
            
      
    }

     }
}
