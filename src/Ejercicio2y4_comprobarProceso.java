import java.io.File;
import java.io.IOException;

public class Ejercicio2y4_comprobarProceso {
    public static void main(String[] args) throws IOException {


        if (args.length <= 0) {
            System.out.println("Debe indicarse comando a ejecutar.");

            System.exit(1);
        }

        ProcessBuilder pb = new ProcessBuilder(args);

        /**
         * Se pone el comando a ejecutar directamente en el processBuilder con el comando .command
         */
        pb.command("java", "procesoLento");

        /**
         * Se redirige la salida normal del procesoLento al fichero salidaProcesoLento.txt
         */
        pb.redirectOutput(new File("C:\\Users\\dperea\\eclipse-workspace\\Ejercicio1Procesos\\salidaProcesoLento.txt"));
      //  pb.inheritIO();


        Process p = pb.start();

        /**
         * Si el proceso aún está en ejecución se mostrará por pantalla un booleano True. Cada iteración la hará
         * cada 3 segundos
         */
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
