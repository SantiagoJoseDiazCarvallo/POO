package MercaRegalaApp;

public class CarneCogeladaEntera extends CarneCongelada{
    private boolean bandeja;

    public CarneCogeladaEntera(String nombre, double peso, double preciokilo, String origen, Empresa distribuidora,
            boolean bandeja) {
        super(nombre, peso, preciokilo, origen, distribuidora);
        this.bandeja = bandeja;
    }

    public boolean isBandeja() {
        return bandeja;
    }

    public void setBandeja(boolean bandeja) {
        this.bandeja = bandeja;
    }

    @Override
    public String toString() {
        return " bandeja=" + bandeja + ", " + super.toString() + " ";
    }

    

}
