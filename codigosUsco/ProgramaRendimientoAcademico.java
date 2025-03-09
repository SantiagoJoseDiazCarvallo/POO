import java.util.Scanner;
import java.util.Locale;//importada para permitir leer el "." como decimal

public class ProgramaRendimientoAcademico {
    /*
     * Una institución educativa estableció un programa para estimular a los alumnos
     * con buen
     * rendimiento académico y que consiste en lo siguiente:
     * ▪ Si el promedio es de 9.5 o más y el alumno es de tecnología, entonces este
     * podrá cursar
     * 55 créditos y se le hará un 25% de descuento.
     * ▪ Si el promedio es mayor o igual a 9 pero menor que 9.5 y el alumno es de
     * tecnología,
     * entonces este podrá cursar 50 créditos y se le hará un 10% de descuento.
     * ▪ Si el promedio es mayor que 7 y menor que 9 y el alumno es de tecnología,
     * este podrá
     * cursar 50 créditos y no tendrá ningún descuento.
     * ▪ Si el promedio es de 7 o menor, el número de materias reprobadas es de 0 a
     * 3 y el
     * alumno es de tecnología, entonces podrá cursar 45 créditos y no tendrá
     * descuento.
     * 
     * ▪ Si el promedio es de 7 o menor, el número de materias reprobadas es de 4 o
     * más y el
     * alumno es de tecnología, entonces podrá cursar 40 créditos y no tendrá ningún
     * descuento.
     * ▪ Si el promedio es mayor o igual a 9.5 y el alumno es de profesional,
     * entonces podrá
     * cursar 55 créditos y se le hará un 20% de descuento.
     * ▪ Si el promedio es menor de 9.5 y el alumno es de profesional, entonces
     * podrá cursar 55
     * créditos y no tendrá descuento.
     * Obtener el total que tendrá que pagar un alumno si el valor de la matrícula
     * para alumnos de
     * profesional es de $30.000 por cada cinco créditos y para alumnos de
     * tecnología es de $18.000
     * por cada cinco créditos.
     */
    public static void main(String[] args) {
        Scanner veriN = new Scanner(System.in);
        veriN.useLocale(Locale.US);// Para que tome el "." como valor decimal
        String rango;
        double promN;
        int materiasF;
        int numCredit;
        double totalCredit;
        double totalValor = 0;
        boolean rangoVeri = false;
        boolean promVeri = false;
        boolean materiasVeri = false;
        while (!rangoVeri) {// Mientras sea falsa, hacer...
            System.out.println("¿El alumno pertenece a una tecnología o a una profesional? (T/P)");
            rango = veriN.nextLine().toUpperCase();// para que convierta todo a mayúsculas
            if (rango.equals("T")) {// si el caracter equivale a la letra "T"
                while (!promVeri) {
                    System.out.print("Por favor ingrese su promedio: ");
                    if (veriN.hasNextDouble()) {// si posee un valor double
                        promN = veriN.nextDouble();
                        veriN.nextLine();// limpiar el buffer
                        if (promN < 0) {// qué pasa si el promedio es un valor negativo?
                            System.out.println("Error: El promedio no puede ser un valor negativo");
                        } else {
                            if (promN >= 9.5) {
                                numCredit = 55;
                                totalCredit = numCredit / 5;
                                totalValor = (totalCredit * 18000) * 0.75;
                            } else if (promN < 9.5 && promN >= 9.0) {
                                numCredit = 50;
                                totalCredit = numCredit / 5;
                                totalValor = (totalCredit * 18000) * 0.9;
                            } else if (promN < 9.0 && promN >= 7.0) {
                                numCredit = 50;
                                totalCredit = numCredit / 5;
                                totalValor = (totalCredit * 18000);
                            } else {
                                while (!materiasVeri) {
                                    System.out.print("Digite cuántas materias perdidas posee: ");
                                    if (veriN.hasNextInt()) {
                                        materiasF = veriN.nextInt();
                                        veriN.nextLine();

                                        if (materiasF >= 0) {
                                            if (materiasF <= 3) {
                                                numCredit = 45;
                                            } else {
                                                numCredit = 40;
                                            }
                                            totalValor = (numCredit / 5) * 18000;
                                            materiasVeri = true;
                                        } else {
                                            System.out.println("Error: Ingrese un número entero positivo!");
                                        }
                                    } else {
                                        System.out.println("Error: Solo puede ingresar números enteros!");
                                        veriN.next(); // Limpia la entrada incorrecta
                                    }
                                }
                            }
                            promVeri = true;
                        }
                    } else {
                        System.out.println("Error: Debe ingresar un valor decimal positivo!");
                        veriN.nextLine();
                    }
                }
                rangoVeri = true;
            } else if (rango.toUpperCase().equals("P")) {// Si el caracter equivale a la letra "P"
                while (!promVeri) {
                    System.out.print("Por favor ingrese su promedio: ");
                    if (veriN.hasNextDouble()) {// Si posee un valor double
                        promN = veriN.nextDouble();
                        veriN.nextLine();// Limpia la entrada
                        if (promN < 0) {// Qué pasa si el promedio es un valor negativo?
                            System.out.println("Error: El promedio no puede ser un valor negativo!");
                        } else {
                            if (promN >= 9.5) {
                                numCredit = 55;
                                totalCredit = numCredit / 5;
                                totalValor = (totalCredit * 30000) * 0.8;
                            } else {
                                numCredit = 55;
                                totalCredit = numCredit / 5;
                                totalValor = totalCredit * 30000;
                            }
                            promVeri = true;
                        }
                    } else {
                        System.out.println("Error: Debe ingresar un número decimal positivo!");
                        veriN.next(); // Limpia la entrada para que no se ocasione un bucle infinito
                    }
                }
                rangoVeri = true;
            } else{
                System.out.println("Error: Tipo de dato no válido. Por favor ingrese las letras T o P!");
            }
        }
        System.out.print("El total del valor a pagar por la matrícula del estudiante es de: " + totalValor);
        veriN.close();
    }
}