
import java.util.Scanner;


public class ejercicio2 {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir N personas");
        int N = sc.nextInt();
        sc.nextLine();

        Personas [] arrayPersonas = new Personas[N];
        
        for (int i = 0; i < N; i++) {

            System.out.println("Persona " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("DNI: ");
            int dni = sc.nextInt();
            System.out.print("CUI: ");
            int cui = sc.nextInt();
            sc.nextLine(); 
        
        arrayPersonas[i] =new Personas(nombre, dni, cui);

        }
        System.out.println();
        System.out.println("Personas registrados : \n" );

        for (Personas persona : arrayPersonas) {
            persona.mostrarDatos();
        }

        sc.close();
    }
}
