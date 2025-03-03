import java.util.Scanner;
/*En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
en lo siguiente:
• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
compran de cinco a 10 y de U$50 si se compran más de 10.
• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
que compra y la que tiene que pagar por el total de la compra.*/
public class LlantasCompradas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int precioLlantas;
        int cantidadLlantas;
        System.out.print("Digite la cantidad de llantas que quiere comprar: ");
        cantidadLlantas = sc.nextInt();
        sc.nextLine();
        double valorTotalLlanta;
        if (cantidadLlantas<5) {
            precioLlantas = 100;
            valorTotalLlanta = cantidadLlantas * precioLlantas;
        }else if (cantidadLlantas>=5 && cantidadLlantas<=10) {
            precioLlantas = 75;
            valorTotalLlanta = cantidadLlantas * precioLlantas;
        }else{
            precioLlantas = 50;
            valorTotalLlanta = cantidadLlantas * precioLlantas;
        }
        System.out.println("Valor unitario de las llantas vendidas: "+precioLlantas);
        System.out.println("Valor total de llantas compradas: "+valorTotalLlanta);
        sc.close();
    }
}