import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class comandoTeclado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un comando:");
       String [] comando=sc.nextLine().split( " ");

        ProcessBuilder pb = new ProcessBuilder(comando);

        try {
            Process p = pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
