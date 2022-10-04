import java.util.Scanner;

public class TicketCompra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo=0;
        double precio=0;
        int cantidad=0;


        codigo = sc.nextInt();

        precio = sc.nextDouble();

        cantidad = sc.nextInt();

        sc.close();


        double total = precio*cantidad;

        System.out.println(codigo + " " + precio + " " + cantidad + " " + total);



    }
}
