import java.util.Scanner;
//Tuve ayuda de una ia para la validación de datos, resultó cambiándome todo el código :'D
public class Heladeria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantlimon = 0, cantnuez = 0, cantlulo = 0, cantfresa = 0, cantcrema = 0;
        boolean continua = true;
        while (continua) {
            boolean contvta = true;
            boolean cicloconti = true;
            while (contvta) {
                int sabor = 0;
                boolean entradaValida = false;
                //Se valida el tipo de dato para el sabor.
                while (!entradaValida) {
                    System.out.println("*** Sabores ***");
                    System.out.println("1. Limón");
                    System.out.println("2. Nuez");
                    System.out.println("3. Lulo");
                    System.out.println("4. Fresa");
                    System.out.println("5. Crema");
                    System.out.print("Por favor seleccione el sabor que desea (1-5): ");
                    if (sc.hasNextInt()) {// Verifica si es un número
                        sabor = sc.nextInt();
                        sc.nextLine();
                        if (sabor >= 1 && sabor <= 5) {
                            entradaValida = true;// Número válido
                        } else {
                            System.out.println("Error: Ingrese un número entre 1 y 5.");
                        }
                    } else {
                        System.out.println("Error: Debe ingresar un número válido.");
                        sc.next();//Limpia la entrada incorrecta
                    }
                }
                System.out.print("Ingrese la cantidad a comprar de este sabor: ");
                while (!sc.hasNextInt()) {// Verifica que la cantidad sea un número válido
                    System.out.println("Error: Debe ingresar un número válido.");
                    sc.next();
                }
                int cantidadVendida = sc.nextInt();
                sc.nextLine();
                // Agregar la cantidad según el sabor elegido
                switch (sabor) {
                    case 1 -> cantlimon += cantidadVendida;
                    case 2 -> cantnuez += cantidadVendida;
                    case 3 -> cantlulo += cantidadVendida;
                    case 4 -> cantfresa += cantidadVendida;
                    case 5 -> cantcrema += cantidadVendida;
                }
                // Preguntar si quiere otro sabor
                boolean contsabor = true;
                while (contsabor) {
                    System.out.print("¿Desea incluir otro sabor? (S/N): ");
                    String rto = sc.nextLine().trim().toUpperCase();
                    if (rto.equals("N")) {
                        contvta = false;
                        contsabor = false;
                    } else if (rto.equals("S")) {
                        contsabor = false;
                    } else {
                        System.out.println("Error: Ingrese 'S' para continuar o 'N' para finalizar.");
                    }
                }
            }
            // Preguntar si desea procesar otra factura
            while (cicloconti) {
                System.out.print("¿Desea procesar otra factura? (S/N): ");
                String rta = sc.nextLine().trim().toUpperCase();
                if (rta.equals("N")) {
                    continua = false;
                    cicloconti = false;
                } else if (rta.equals("S")) {
                    cicloconti = false;
                } else {
                    System.out.println("Error: Ingrese 'S' para continuar o 'N' para finalizar.");
                }
            }
        }
        // Mostrar el total de ventas
        System.out.println("Sabor       Cantidad      Valor");
        System.out.println("Limón       " + cantlimon + "        " + (cantlimon * 2500));
        System.out.println("Nuez        " + cantnuez + "         " + (cantnuez * 2800));
        System.out.println("Lulo        " + cantlulo + "         " + (cantlulo * 2600));
        System.out.println("Fresa       " + cantfresa + "        " + (cantfresa * 2000));
        System.out.println("Crema       " + cantcrema + "        " + (cantcrema * 3000));
        System.out.println("Ventas Totales = " + ((cantlimon * 2500) + (cantnuez * 2800) + (cantlulo * 2600) + (cantfresa * 2000) + (cantcrema * 3000)));
        sc.close(); // Cerrar el scanner
    }
}