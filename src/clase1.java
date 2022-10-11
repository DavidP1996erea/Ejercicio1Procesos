import com.sun.jdi.Value;

public class clase1 {


    public static void main(String[] args) {

        String ipCompleta="";
        for(int i=0; i<10;i++){

            double ips = Math.random() * 255;
            double ips2 = Math.random() * 255;
            double ips3 = Math.random() * 255;
            double ips4 = Math.random() * 255;

            ipCompleta=String.format("%.0f", ips)+"."+String.format("%.0f", ips2)+"."+String.format("%.0f", ips3)+"."+String.format("%.0f", ips4);

            System.out.println(ipCompleta);

        }



    }

}
