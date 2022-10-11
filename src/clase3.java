import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class clase3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        List<String> listaIps = new ArrayList<>();

        int contador=0;


        while (contador<10){

            listaIps.add(sc.nextLine());


            contador++;
        }


        for(String l: listaIps){

            if(Integer.parseInt(l.substring(0,2))>=0  &&  Integer.parseInt(l.substring(0,2))<=128){
                System.out.println(l + " es de clase A");
            }else if(Integer.parseInt(l.substring(0,2))>=128  &&  Integer.parseInt(l.substring(0,2))<=191){

                System.out.println(l + " es de clase B");
            }else if(Integer.parseInt(l.substring(0,2))>=192  &&  Integer.parseInt(l.substring(0,2))<=224) {
                System.out.println(l + " es de clase C");
            }else {
                System.out.println(l + " es de clase D");
            }

        }


    }
}
