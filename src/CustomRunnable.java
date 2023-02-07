public class CustomRunnable implements Runnable{


    private String sign;
    private int times;

    public CustomRunnable(String sign, int times) {
        this.sign = sign;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i =0; i<times; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("A thread has been interrupted");
            }
            System.out.println(i+ ": "+sign);

        }
    }
}
