import java.io.File;
import java.io.IOException;

public class lanzarTicketCompra {
    public static void main(String[] args) {



        ProcessBuilder pb = new ProcessBuilder();

        pb.command("java", "TicketCompra");
        pb.inheritIO();
        pb.redirectInput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectOutput(ProcessBuilder.Redirect.appendTo(new File("C:\\Users\\dperea\\eclipse-workspace\\Ejercicio1Procesos\\ticket" )));



        try {
            Process p = pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
