import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class comprobarProceso {
    public static void main(String[] args) throws IOException {


        if (args.length <= 0) {
            System.out.println("Debe indicarse comando a ejecutar.");

            System.exit(1);
        }

        ProcessBuilder pb = new ProcessBuilder(args);

        pb.command("java", "procesoLento");
        pb.redirectOutput(new File("C:\\Users\\dperea\\eclipse-workspace\\Ejercicio1Procesos\\salidaProcesoLento.txt"));
      //  pb.inheritIO();


        Process p = pb.start();

        while (p.isAlive()){

            System.out.println(p.isAlive());

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }





    }
}
