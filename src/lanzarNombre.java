import java.io.File;
import java.io.IOException;

public class lanzarNombre {
    public static void main(String[] args) {

        File entradaNombre = new File("entrada.txt");

        String [] comando = {"java", "preguntarNombre"};

        ProcessBuilder pb = new ProcessBuilder(comando);

        pb.redirectInput(entradaNombre);
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        try {
            Process p = pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
