import com.sun.jdi.Value;

public class clase1 {


    public static void main(String[] args) {

        for(int i=0; i<10;i++){

            int ips = (int) (Math.random() * 255);
            int ips2 = (int) (Math.random() * 255);
            int ips3 = (int) (Math.random() * 255);
            int ips4 = (int) (Math.random() * 255);


            System.out.println(ips + "." + ips2 + "." + ips3 + "." + ips4);

        }



    }

}
