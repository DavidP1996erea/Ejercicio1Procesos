import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class Ejercicio1_Mapas {
    public static void main(String[] args) {
        if (args.length <= 0) {
            System.out.println("Debe indicarse comando a ejecutar.");

            System.exit(1);
        }

        /**
         * Se guarda el comando a ejecutar, como se necesita un array se está usando el args propio de la clase,
         * los comando son introducidos a través del intelliJ (Modify run configuration)
         */
        ProcessBuilder pb = new ProcessBuilder(args);

        /**
         * Redirige la salida estándar y de error de los subprocesos creados hacia las del proceso padre,
         * y su entrada estándar desde la del proceso padre.
         */
        pb.inheritIO();



        Map<String, String> mapa = pb.environment();


        for (String proceso : mapa.keySet()){

            System.out.println(proceso + " " + mapa.get(proceso));
        }

        try {
                Process p = pb.start();


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