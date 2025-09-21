public class MaquinaDeCafe {

    // Recursos disponíveis na máquina (em ml ou unidades)
    private int agua;       // ml de água
    private int cafe;       // gramas de café
    private int leite;      // ml de leite
    private int acucar;     // colheres de açúcar

    public MaquinaDeCafe(int agua, int cafe, int leite, int acucar) {
        this.agua = agua;
        this.cafe = cafe;
        this.leite = leite;
        this.acucar = acucar;
    }

    // Tipos de bebida disponíveis
    public enum Bebida {
        CAFE_PRETO,      // água + café
        CAFE_COM_LEITE, // água + café + leite
        CAFE_COM_ACUCAR // água + café + açúcar
    }

    // Preparo da bebida
    public String preparar(Bebida bebida) {
        switch (bebida) {
            case CAFE_PRETO:
                if (agua >= 100 && cafe >= 15) {
                    agua -= 100;
                    cafe -= 15;
                    return "Café preto preparado com sucesso!";
                } else {
                    return "Recursos insuficientes para preparar café preto.";
                }
            case CAFE_COM_LEITE:
                if (agua >= 80 && cafe >= 15 && leite >= 50) {
                    agua -= 80;
                    cafe -= 15;
                    leite -= 50;
                    return "Café com leite preparado com sucesso!";
                } else {
                    return "Recursos insuficientes para preparar café com leite.";
                }
            case CAFE_COM_ACUCAR:
                if (agua >= 100 && cafe >= 15 && acucar >= 2) {
                    agua -= 100;
                    cafe -= 15;
                    acucar -= 2;
                    return "Café com açúcar preparado com sucesso!";
                } else {
                    return "Recursos insuficientes para preparar café com açúcar.";
                }
            default:
                return "Bebida não reconhecida.";
        }
    }

    // Método para mostrar recursos atuais
    public void mostrarRecursos() {
        System.out.println("Recursos atuais:");
        System.out.println("Água: " + agua + " ml");
        System.out.println("Café: " + cafe + " g");
        System.out.println("Leite: " + leite + " ml");
        System.out.println("Açúcar: " + acucar + " colheres");
    }

}
