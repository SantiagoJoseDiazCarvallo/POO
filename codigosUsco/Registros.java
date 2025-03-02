import java.util.Scanner;

public class Registros{
    public static void main(String[] args) throws Exception {
        Scanner registroNombre = new Scanner (System.in, "UTF-8");//Permite reconocer letras como la ñ, y tíldes en la cadena de caracteres.
        String nombre;
        do {
            System.out.print("Bienvenido! Por favor escriba su nombre: ");
            nombre = registroNombre.nextLine().trim();//Permite que se ingrese múltiple caracteres.
            if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ ]+")) {
                System.out.println("Entrada no válida. Debe ingresar solo letras!");//Aún no acepta tíldes ni la letra ñ, cuidado!
            }
        } while (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ ]+"));//Se repetirá hasta que se ingrese una cadena de caracteres.
        System.out.println("Bienvenido, "+nombre+"!");
        registroNombre.close();
    }
}
