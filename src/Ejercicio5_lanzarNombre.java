import java.io.File;
import java.io.IOException;

public class Ejercicio5_lanzarNombre {
    public static void main(String[] args) {

        /**
         * Se crea un objeto File y un array de String que servirá para meter el comando a ejecutar
         */
        File entradaNombre = new File("entrada.txt");

        String [] comando = {"java", "Ejercicio5_preguntarNombre"};

        ProcessBuilder pb = new ProcessBuilder(comando);

        /**
         * Se redirecciona la entrada del Scanner del java Ejercicio5_preguntarNombre, para que coja el txt
         */
        pb.redirectInput(entradaNombre);

        /**
         * Redirecciona la salida para que sea por pantalla
         */
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        try {
            Process p = pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
