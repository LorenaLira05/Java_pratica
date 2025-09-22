package ads.coding.lista.ex28;

public class SensorDePresenca {
    private boolean ativo;

    public SensorDePresenca() {
        ativo = false;
    }

    public void ativar() { ativo = true; }
    public void desativar() { ativo = false; }

    public void detectarPresenca() {
        if (ativo) System.out.println("Presença detectada!");
        else System.out.println("Sensor inativo");
    }

    public static void main(String[] args) {
        SensorDePresenca sensor = new SensorDePresenca();

        sensor.detectarPresenca(); // inativo
        sensor.ativar();
        sensor.detectarPresenca(); // ativo
    }
}

