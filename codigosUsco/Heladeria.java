import java.util.Scanner;
//Tuve ayuda de una ia para la validación de datos, cambió algunas cosas del código :'D
/*public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int cantlimon=0,cantnuez=0,cantlulo=0,cantfresa=0,cantcrema=0;
    double ventalimon=0,ventanuez=0,ventalulo=0,ventafresa=0,ventacrema=0,ventaTotal=0;
    boolean continua=true;
        while(continua){
            boolean contvta=true;
            boolean cicloconti=true;
                while(contvta){
                    System.out.println("***sabores***");
                    System.out.println("1. Limón");
                    System.out.println("2. Nuez");
                    System.out.println("3. Lulo");
                    System.out.println("4. fresa");
                    System.out.println("5. crema");
                    int sabor=sc.nextInt();
                    sc.nextLine();
                    switch (sabor) {
                        case 1:
                            System.out.println("cantidad vendida: ");
                            int cantFLimon=sc.nextInt();
                            sc.nextLine();
                            cantlimon=cantlimon+cantFLimon;
                            break;
                        case 2:
                            System.out.println("cantidad vendida: ");
                            int cantFNuez=sc.nextInt();
                            sc.nextLine();
                            cantnuez=cantnuez+cantFNuez;
                            break;
                        case 3:
                            System.out.println("cantidad vendida: ");
                            int cantFLulo=sc.nextInt();
                            sc.nextLine();
                            cantlulo=cantlulo+cantFLulo;
                            break;
                        case 4:
                            System.out.println("cantidad vendida: ");
                            int cantFFresa=sc.nextInt();
                            sc.nextLine();
                            cantfresa=cantfresa+cantFFresa;
                            break;
                        case 5:
                            System.out.println("cantidad vendida: ");
                            int cantFCrema=sc.nextInt();
                            sc.nextLine();
                            cantcrema=cantcrema+cantFCrema;
                            break;
                        default:
                        System.out.println("sabor no identificado error");
                    }
                    boolean contsabor=true;
                    while (contsabor) {
                        System.out.println("¿desea incluir otro sabor? (S/N)");
                        String rto=sc.nextLine();
                        if (rto.toUpperCase().equals("N")) {
                            contvta=false;
                            contsabor=false;
                        } else  {if (rto.toUpperCase().equals("S")) {
                            contvta = true;
                            contsabor = false;
                        } else {
                            System.out.println("¡error!, ingrese N o S para continuar con el proceso");
                            contsabor=true;
                        }
                        }
                    }
            }
            while (cicloconti) {
                System.out.println("¿desea procesar otra factura? (S/N)");
                String rta=sc.nextLine();
                    if (rta.toUpperCase().equals("N")) {
                        continua = false;
                        cicloconti= false;} 
                    else {
                        if (rta.toUpperCase().equals("S")) {
                        continua = true;
                        cicloconti = false;} 
                    else {
                        System.out.println("¡error!, ingrese N o S para continuar con el proceso");
                        cicloconti=true;
                }  
                }
            }
    }
    System.out.println("sabror       Cantidad          valor");
    System.out.println("Limón       "+cantlimon+"        "+(cantlimon*2500));
    System.out.println("nuez        "+cantnuez+"         "+(cantlimon*2800));
    System.out.println("Lulo        "+cantlulo+"         "+(cantlulo*2600));
    System.out.println("fresa       "+cantfresa+"        "+(cantlimon*2000));
    System.out.println("crema        "+cantcrema+"         "+(cantlimon*3000));
    System.out.println("Ventas Totales="+((cantlimon*2500)+(cantnuez*2800)+(cantlulo*2600)+(cantfresa*2000)+(cantcrema*3000)));
    }*/
   //El código de abajo tiene validaciones, coloqué el primero para guiarme...
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