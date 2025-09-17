
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        String Nombre ; 
        int Edad ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir los numeros de amigos :");
        int numeroAmigos = sc.nextInt();
        sc.nextLine();
        System.out.println();

        Edad [] arrayEdads = new Edad[numeroAmigos];

        for(int i = 0 ; i<numeroAmigos;i++){
            
            System.out.println("Persona "+(1+i));
            System.out.println("Introducir El nombre ");
            Nombre = sc.nextLine();
            System.out.println("Introducir La edad ");
            Edad = sc.nextInt();
            sc.nextLine();
            System.out.println();

            arrayEdads[i]=new Edad(Nombre,Edad);
        }

        Edad personaMayor = encontrarMayorEdad(arrayEdads);{
        System.out.println("\nLa persona de mayor edad es:");
        personaMayor.mostrarResultado();
        
        sc.close();
        }
    }
    public static Edad encontrarMayorEdad(Edad[] personas){
        Edad mayor = personas[0];
        for (int i = 1; i < personas.length; i++) {
            if(personas[i].getEdad() > mayor.getEdad()){
                mayor = personas[i];
            }
        }
        return mayor;
    }
}

