import java.util.Scanner;
/*En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500. */
public class VentaComputadoras {
    public static void main(String[] args) {
        Scanner validarDescuento = new Scanner(System.in);
        int precioPC = 500;
        int cantidadPC;
        System.out.print("Digite la cantidad de pcs comprados: ");
        cantidadPC = validarDescuento.nextInt();
        validarDescuento.nextLine();
        double valorDescuento;
        if (cantidadPC<5) {
            valorDescuento = (cantidadPC * precioPC) * 0.9;
        }else if (cantidadPC>=5 && cantidadPC<10) {
            valorDescuento = (cantidadPC * precioPC) * 0.8;
        }else{
            valorDescuento = (cantidadPC * precioPC) * 0.6;
        }
        System.out.print("Valor total de los computadores vendidos: "+valorDescuento);
    }
}
