public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
         
        Thread thread1 = new Thread1();
        thread1.start();

        System.out.println("main is ending");

    }
}
