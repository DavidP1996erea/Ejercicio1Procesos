import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class clase2
{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        List<String> listaIps = new ArrayList<String>();


        for(int i = 0; i<10;i++){

                listaIps.add(sc.nextLine());

        }

        for(int i=0; i<10;i++){

            if(Integer.parseInt(listaIps.get(i).substring(0,3))<224){
                System.out.println(listaIps.get(i));
            }

        }


    }
}
