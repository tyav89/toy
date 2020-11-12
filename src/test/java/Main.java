public class Main {
    public static void main(String[] args) {
        Toggle toggle = new Toggle();
        int sleep = 1000;
        int count = 5;

        Thread user = new Thread(
                ()->{
                    while (!Thread.currentThread().isInterrupted()){
                        try {
                            Thread.sleep(sleep);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        toggle.on();
                        if(toggle.getCount() == count){
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                );

        Thread toy = new Thread(
                ()->{
                    while (!Thread.currentThread().isInterrupted()){
                        toggle.of();
                        if(!user.isAlive()){
                            Thread.currentThread().interrupt();
                        }
                    }
                }
        );

        user.start();
        toy.start();


    }
}


