package MercaRegalaApp;

public class Producto implements I_Almacen{
    private String nombre;//Atributos
    private double peso;
    private double precioKilo;

    public Producto(String nombre, double peso, double precioKilo) {//Constructor específico
        this.nombre = nombre;
        this.peso = peso;
        this.precioKilo = precioKilo;
    }
    public Producto() {//Constructor inferencial
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPrecioKilo() {
        return precioKilo;
    }
    public void setPrecioKilo(double precioKilo) {
        this.precioKilo = precioKilo;
    }

    @Override
    public String toString() {
        return " nombre=" + nombre + ", peso=" + peso + ", precioKilo=" + precioKilo ;
    }
    @Override
    public double calcularPrecio() {  
        return peso*precioKilo;
    }
}
