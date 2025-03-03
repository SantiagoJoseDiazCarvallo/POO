import java.util.Scanner;

public class VentaReproductorMusica {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double descuento, total1, valorAp, total2 , iva, totalfinal;
        String marca, nosy="NOSY";
        System.out.println("Ingrese la marca del producto :");
        marca=sc.nextLine();
        System.out.println("Ingrese el precio del producto : ");
        valorAp=sc.nextInt();
        sc.nextLine();
        boolean resultado = marca.toUpperCase().equals(nosy);
        if (valorAp>=500) {
            total1=valorAp-(valorAp*0.1);
        }
        else{
            total1=valorAp;
        }
        if (resultado==true) {
            total2=total1-(total1*0.05);
            totalfinal=total2+(total2*0.19);
        }
        else{
            totalfinal=total1+(total1*0.19);
        }
        System.out.println("El precio del producto es de : "+totalfinal);

    }
}