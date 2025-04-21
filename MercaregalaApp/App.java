package MercaRegalaApp;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        System.out.println("ingrese la cantidad de productos que se van a ingresar ");
        int productos = sc.nextInt();
        sc.nextLine();
        Producto[] p = new Producto[100];
        Almacen a = new Almacen(p);
        while (contador < productos) {
            int op = menu();
            int op2=3;
            int op3=3;
            if (op==0) {
              op2 = carneBase();
            }
            if (op2==1) {
               op3 = carneCongelada();
            }
            
            switch (op) {
                case 0: // carne
                    switch (op2) {
                        case 0:// carne fresca
                            p[contador] = new CarneFresca(nombre(), peso(), precioKilo(), origen(), diasCaducidad());
                            contador++;
                            break;
                        case 1:// carne conglada
                            switch (op3) {
                                case 0:// carne congelada entera
                                    Empresa a2 = new Empresa(id(), nombreE(), email());
                                    p[contador] = new CarneCogeladaEntera(nombre(), peso(), precioKilo(), origen(), a2,
                                            bandeja());
                                            contador++;
                                    break;
                                case 1:// carne congelada troceada
                                    Empresa b2 = new Empresa(id(), nombreE(), email());
                                    p[contador] = new CarneCongeladaTroceada(nombre(), peso(), precioKilo(), origen(), b2,
                                            piezas());
                                            contador++;
                                    break;
                                default:
                                    break;
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 1: // pescado
                    p[contador] = new Pescado(nombreP(), pesoP(), precioKiloP(), tipoP());
                    contador++;
                    break;
    
                default:
                    break;
            }
        }
        contador=0;
        while (contador<productos) {
            System.out.println(p[contador].toString());
            contador++;
        }
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n ¿que tipo de producto desea registrar?: 0. para carne 1. para pescado.");
        int c = 0;
        int tipoProducto = 0;
        tipoProducto = sc.nextInt();
        sc.nextLine();
        while (c == 0) {
            if (tipoProducto <= 1 && tipoProducto >= 0) {
                c++;
            } else {
                System.out.println("ingrese un numero valido (0/1) ");
                tipoProducto = sc.nextInt();
                sc.nextLine();
            }
        }

        return tipoProducto;
    }

    public static int carneBase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n ¿ que tipo de carne desea registrar ?: 0. para carne fresca 1. para carne comgelada.");
        int c = 0;
        int tipoCarne = 0;
        tipoCarne = sc.nextInt();
        sc.nextLine();
        while (c == 0) {
            if (tipoCarne <= 1 && tipoCarne >= 0) {
                c++;
            } else {
                System.out.println("ingrese un numero valido (0/1) ");
                tipoCarne = sc.nextInt();
                sc.nextLine();
            }
        }

        return tipoCarne;
    }

    public static int carneCongelada() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n ¿ que tipo de carne congelada desea registrar ?: 0 para entera, 1 para troceada.");
        int c = 0;
        int tipoCongelada = 0;
        tipoCongelada = sc.nextInt();
        sc.nextLine();
        while (c == 0) {
            if (tipoCongelada <= 1 && tipoCongelada >= 0) {
                c++;
            } else {
                System.out.println("ingrese un numero valido (0/1) ");
                tipoCongelada = sc.nextInt();
                sc.nextLine();
            }
        }

        return tipoCongelada;
    }

    public static String nombre() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el nombre de la carne ");
        String nombre = sc.nextLine();
        return nombre;
    }

    public static double peso() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el peso de la carne  ");
        double peso = sc.nextDouble();
        sc.nextLine();
        return peso;
    }

    public static double precioKilo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el precio por kilo de la carne  ");
        double precioKilo = sc.nextDouble();
        sc.nextLine();
        return precioKilo;
    }

    public static String origen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el origen de la  carne ");
        String origen = sc.nextLine();
        return origen;
    }

    public static boolean bandeja() {
        Scanner sc = new Scanner(System.in);
        boolean bandeja = true;
        System.out.println("ingrese 1. si viene en bandeja o 2 si no viene en bandeja  ");
        int numero = sc.nextInt();
        sc.nextLine();
        if (numero == 1) {
            bandeja = true;
        } else {
            bandeja = false;
        }
        return bandeja;
    }

    public static double piezas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de piezas en las que esta partida la carne ");
        double piezas = sc.nextDouble();
        sc.nextLine();
        return piezas;
    }

    public static int diasCaducidad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero de dias de caducidad de la carne  ");
        int diasCaducidad = sc.nextInt();
        sc.nextLine();
        return diasCaducidad;
    }

    public static String id() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el id de la empresa ");
        String id = sc.nextLine();
        return id;
    }

    public static String nombreE() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el nombre de la empresa ");
        String nombreE = sc.nextLine();
        return nombreE;
    }

    public static String email() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el email de la empresa  ");
        String email = sc.nextLine();
        return email;
    }

    public static String tipoP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el nombre del producto ");
        String tipoP = sc.nextLine();
        return tipoP;
    }

    public static String nombreP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el nombre del pescado ");
        String nombre = sc.nextLine();
        return nombre;
    }

    public static double pesoP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el peso del pescado ");
        double peso = sc.nextDouble();
        sc.nextLine();
        return peso;
    }

    public static double precioKiloP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el precio por kilo del pescado ");
        double precioKilo = sc.nextDouble();
        sc.nextLine();
        return precioKilo;
    }
    public static void calcularPrecio() {
        
    }
    public static void ProductosEnPeligro() {
        
    }
    public static void CalculoPrecioMedio() {
        
    }
    public static void EliminarBandejas() {
        
    }

}
