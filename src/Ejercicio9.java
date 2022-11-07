import java.io.*;

public class Ejercicio9 {
    public static void main(String[] args) {

        /**
         * Devuelve el objeto Runtime asociado con la aplicación de Java actual
         */
        Runtime rt = Runtime.getRuntime();


        /**
         * Se guarda el comando a ejecutar en un array
         */
        String [] comando = {"java","Ejercicio5_preguntarNombre"};


        try{
            /**
             * Se inicia el proceso indicado
             */
            Process p = rt.exec(comando);

            /**
             * Se lee el fichero entrada.txt, que contiene un nombre
             */
            FileReader fre = new FileReader("C:\\Users\\david\\IdeaProjects\\Ejercicio1Procesos\\src\\entrada.txt");
            BufferedReader br = new BufferedReader(fre);

            /**
             * Devuelve un Stream (datos aún codificados, por ello necesitamos los bufferReader y
             * bufferWriter) de salida conectando con la entrada estándar del proceso
             */
            OutputStream os = p.getOutputStream();
            OutputStreamWriter osr = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osr);

            String line= br.readLine();
            while (line != null){

                bw.write(line);
                bw.newLine();
                line = br.readLine();

            }
            bw.close();
            br.close();
            os.close();
            osr.close();

            /**
             * Este comando hace que no se ejecute el siguiente proceso hasta que el anterior haya terminado
             */
            p.waitFor();


            InputStream is = p.getInputStream();
            InputStreamReader isr =  new InputStreamReader(is);
            BufferedReader br2 = new BufferedReader(isr);

            String line2=br2.readLine();
            while (line2 != null){

                System.out.println(line2);
                line2 = br2.readLine();

            }

            is.close();
            isr.close();
            br2.close();

        } catch (IOException e) {

            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
