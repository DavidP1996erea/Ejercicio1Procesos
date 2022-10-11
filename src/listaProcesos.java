import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class listaProcesos {
    public static void main(String[] args) {


        ProcessBuilder claseA = new ProcessBuilder("java", "clase1");
        ProcessBuilder claseB = new ProcessBuilder("java", "clase2");
        ProcessBuilder claseC = new ProcessBuilder("java", "clase3");

        List<ProcessBuilder> listaDeProcesos = new ArrayList<ProcessBuilder>();

        listaDeProcesos.add(claseA);
        listaDeProcesos.add(claseB);
        listaDeProcesos.add(claseC);

        claseC.redirectError(ProcessBuilder.Redirect.INHERIT);
        claseC.redirectOutput(new File("C:\\Users\\dperea\\IdeaProjects\\Ejercicio1Procesos\\ficheroIPSalida.txt"));




        try {
            ProcessBuilder.startPipeline(listaDeProcesos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
