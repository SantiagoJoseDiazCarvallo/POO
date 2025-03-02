import java.util.Scanner;

public class Registros{
    public static void main(String[] args) throws Exception {
        System.out.print("Por favor ingrese su usuario: ");
        Scanner vis = new Scanner (System.in);
        String registroNombre = vis.nextLine();
        System.out.println("Bienvenido al software de programación, "+registroNombre+"!");
    }
}
