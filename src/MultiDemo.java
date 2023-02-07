public class MultiDemo {
    public static void main(String[] args) {

        try {
        ///check met Joey/Manuel over interrupt als er niets slaapt
        Thread thread = new Thread(new CustomRunnable("é", 10));
        Thread thread2 = new Thread(new CustomRunnable("&", 10000));
        Thread thread3 = new Thread(new CustomRunnable("@", 10000));

        thread.start();
        thread.join();
        thread2.start();
        thread3.start();


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
