public class procesoLento {
    public static void main(String[] args) {


        System.out.println("hola mundo");


        for (int i=0; i<10; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }
}
