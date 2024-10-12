public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
         
        Thread thread1 = new Thread1();       
        thread1.start();

        Thread thread = new Thread(new Thread2(),"Thread2");
        thread.start();


        System.out.println("main is ending");

    }
}
