import java.io.*;

public class Ejercicio8_Runtime {
    public static void main(String[] args) {


        Runtime rt = Runtime.getRuntime();

        String [] comando  = {"java","Ejercicio2_procesoLento"};


        try {

            Process p = rt.exec(comando);

            FileWriter fre = new FileWriter("C:\\Users\\david\\IdeaProjects\\Ejercicio1Procesos\\src\\salidaProcesoLento2.txt");
            BufferedWriter bw = new BufferedWriter(fre);

            InputStream is = p.getInputStream();

            InputStreamReader isr =  new InputStreamReader(is);

            BufferedReader br2 = new BufferedReader(isr);

            String line2=br2.readLine();

            while (line2 != null){

                bw.write(line2);
                bw.newLine();
                line2 = br2.readLine();

            }

            is.close();
            isr.close();
            bw.close();
            br2.close();

        }catch (Exception e){

        }



    }
}
