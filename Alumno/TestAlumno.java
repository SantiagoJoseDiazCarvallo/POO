import java.util.Scanner;

public class TestAlumno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alumno[] alumnos = new Alumno[30];
        int totalAlumnos = 0;

        while (totalAlumnos < 30) {
            System.out.print("Introduce el nombre del estudiante número "+(totalAlumnos+1)+": ");//Indica a qué estudiante se le está asignando las notas
            String nombre = sc.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            Alumno alumno = new Alumno(nombre);
            System.out.println("Introduce sus notas, cada una dejando un espacio de por medio: ");/*Su propio nombre lo indica;
            Poner una nota, separada con espacio de otra */
            String[] partes = sc.nextLine().split(" ");
            for (int i = 0; i < partes.length; i++) {
                try {
                    int nota = Integer.parseInt(partes[i]);
                    if (!alumno.incluirNota(nota)) {
                        System.out.println("La nota " + nota + " no se pudo añadir");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida: " + partes[i]);
                }
            }

            alumnos[totalAlumnos] = alumno;
            totalAlumnos++;
        }

        System.out.println("\nListado final de alumnos:");
        System.out.printf("%-12s %-16s %-10s %-10s\n", "Nombre", "Número de notas", "Aprobados", "Media");
        System.out.println("============ ================ ========== ==========");

        for (int i = 0; i < totalAlumnos; i++) {
            Alumno a = alumnos[i];
            System.out.printf("%-12s %-16d %-10d %-10.1f\n",
                    a.getNombre(), a.numNota(), a.getNumeroAprobado(), a.getNotaMedia());
        }

        sc.close();
    }
}
