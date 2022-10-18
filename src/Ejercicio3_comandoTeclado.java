import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3_comandoTeclado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un comando:");
        /**
         * El comando se pide por teclado al usuario, como es necesario un array se realiza un split
         */
       String [] comando=sc.nextLine().split( " ");

        ProcessBuilder pb = new ProcessBuilder(comando);

        try {
            Process p = pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
