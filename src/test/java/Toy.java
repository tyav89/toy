public class Toy implements Runnable {
    Toggle toggle;
    int sleep = 1000;

    public Toy(Toggle toggle) {
        this.toggle = toggle;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
                if (toggle.getStatus()){
                    try {
                        Thread.sleep(sleep);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    toggle.off();
                    System.out.println("ВЫКЛ");
                }

        }
    }


}
