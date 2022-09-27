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

        pb.inheritIO();

        pb.command("java", "procesoLento");


        try {
            Process p = pb.start();

            try {
                System.out.println(p.isAlive());
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }



            int codRet = p.waitFor();
            System.out.println("La ejecución de " + Arrays.toString(args)
                    + " devuelve " + codRet
                    + " " + (codRet == 0 ? "(ejecución correcta)" : "(ERROR)")
            );
        } catch (IOException e) {
            System.err.println("Error durante ejecución del proceso");
            System.err.println("Información detallada");
            System.err.println("---------------------");
            e.printStackTrace();
            System.err.println("---------------------");


            System.exit(2);
        } catch (InterruptedException e) {
            System.err.println("Proceso interrumpido");
            System.exit(3);
        }






    }
}
