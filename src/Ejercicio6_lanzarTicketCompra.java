import java.io.File;
import java.io.IOException;

public class Ejercicio6_lanzarTicketCompra {
    public static void main(String[] args) {

        File ticket = new File("C:\\Users\\david\\IdeaProjects\\Ejercicio1Procesos\\src\\ticket.txt");

        ProcessBuilder pb = new ProcessBuilder();

        String [] comando={"java", "Ejercicio6_ticketCompra"};

        pb.command(comando);

        /**
         * Establece el origen y el destino de la E/S estándar del subproceso para que sean los mismos
         * que los del proceso Java actual.
         */
        pb.inheritIO();

        pb.redirectInput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectOutput(ProcessBuilder.Redirect.appendTo(ticket));



        try {
            Process p = pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
