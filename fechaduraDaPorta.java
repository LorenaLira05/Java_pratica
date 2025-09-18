package ads.coding.lista.ex02;

public class fechaduraDaPorta {
    // Atributos da classe
    boolean aberta;
    boolean trancada;

    // Construtor
    public fechaduraDaPorta() {
        aberta = true;
        trancada = false;
        // A porta começa aberta e destrancada
    }

    // Métodos
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

    public void fecharPorta() {
        // Fecha a porta
        if (!aberta) {
            System.out.println("A porta já está fechada!");
        } else {
            aberta = false;
            System.out.println("Porta fechada!");
        }
    }

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

    public void destrancarPorta() {
        // Destranca a porta (se ela estiver trancada)
        if (!trancada) {
            System.out.println("A porta já está destrancada!");
        } else {
            trancada = false;
            System.out.println("Destrancando...Porta destrancada!");
        }
    }

    public static void main(String[] args) {
        fechaduraDaPorta porta = new fechaduraDaPorta();
        porta.fecharPorta();   // Porta fechada!
        porta.trancarPorta();  // Trancando... Porta trancada!
        porta.abrirPorta();    // A porta está trancada! Não é possível abrir.
        porta.destrancarPorta(); // Destrancando...Porta destrancada!
        porta.abrirPorta(); // Porta aberta!
    }
}
