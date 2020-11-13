public class User implements Runnable {
    Toggle toggle;
    int sleep = 1500;
    int count = 5;

    public User(Toggle toggle) {
        this.toggle = toggle;
    }

    @Override
    public void run() {

        if (!toggle.getStatus()) {
            for (int i = 0; i < count; i++) {
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                toggle.on();
                System.out.println("ВКЛ");

            }
        }
    }
}
