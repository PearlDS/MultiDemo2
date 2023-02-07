public class CustomThread extends Thread{

    private String sign;

    public CustomThread(String sign) {
        this.sign = sign;
    }

    @Override
    public void run() {
        for (int i =0; i<100; i++){
            System.out.println(sign);

        }
    }
}
