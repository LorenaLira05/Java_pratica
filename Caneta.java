package CursoJava;

public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    public boolean tampada;

    public void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Modelo "+ this.modelo);
        System.out.println("Ponta "+ this.ponta);
        System.out.println("Carga "+ this.carga);
        System.out.println("Está tampada? "+ this.tampada);

    }
    public void rabiscar() {
        if (this.tampada == true){
            System.out.println("Erro! Não posso rabiscar");
        } else {
            System.out.println("Rabiscando");
        }
    }

    public void tampar() {
        this.tampada = true;

    }

    public void destampar(){
        this.tampada = false;

    }

}

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.rabiscar();
        c1.status();
    }
}
