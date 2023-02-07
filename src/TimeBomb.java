public class TimeBomb implements Runnable{

    private Thread bomb;
    public TimeBomb(int seconds) {

        bomb = new Thread(()-> {for(int i = seconds; i>0; i--){
            System.out.println("YimeBomb ticking");
            System.out.println("seconds left: "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("disarmed!");
                return;
            }
        }
            System.out.println("BOOOM!");
        });
    }

    public void activate() {
        System.out.println("Start");
        bomb.start();
    }

    public void disarm() {
        if (bomb.isAlive()){
            bomb.interrupt();
            System.out.println("Bomb interupted!");
        }
    }

    @Override
    public void run() {

    }
}
