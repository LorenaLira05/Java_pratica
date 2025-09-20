package ads.coding.lista.ex02;

public class PortaComTranca {
    boolean aberta;
    boolean trancada;

    // Construtor
    public PortaComTranca() {
        aberta = true;
        trancada = false;
        // A porta começa aberta e destrancada
        
    }
    // Método para abrir a porta
    public void abrirPorta() {
        // Abre a porta
        if (aberta) {
            System.out.println("A porta já está aberta!");
        } else if (trancada) {
            System.out.println("A porta está trancada! Não é possível abrir."); 
        } else {
            aberta = true;
            System.out.println("Porta aberta!");
        }
        
    }
    // Método para fechar a porta
    public void fecharPorta() {
        // Fecha a porta
        if (!aberta) {
            System.out.println("A porta já está fechada!");
        } else {
            aberta = false;
            System.out.println("Porta fechada!");
        }
        
    }
    // Método para trancar a porta
    public void trancarPorta() {
        // Tranca a porta (se ela estiver fechada)
        if (aberta) {
            System.out.println("Você não pode trancar a porta se ela estiver aberta!"); 
        } else if (trancada) {
            System.out.println("A porta já está trancada!");
        } else {
            trancada = true;
            System.out.println("Trancando... Porta trancada!");
        }
        
    }
    // Método para destrancar a porta
    public void destrancarPorta() {
        // Destranca a porta (se ela estiver trancada)
        if (!trancada) {
            System.out.println("A porta já está destrancada!");
        } else {
            trancada = false;
            System.out.println("Destrancando...Porta destrancada!");
        }
    }
    
    public void status() {
    	System.out.println("Porta " + (aberta ? "aberta" : "fechada") +
            " e " + (trancada ? "trancada" : "destrancada"));
    }

}
