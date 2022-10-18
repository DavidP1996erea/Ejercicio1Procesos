public class Ejercicio2_procesoLento {
    public static void main(String[] args) {


        System.out.println("hola mundo");


        for (int i=0; i<10; i++) {
            System.out.println(i);

            try {
                /**
                 * Deja un tiempo de espera entre las iteraciones
                 */
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }
}
