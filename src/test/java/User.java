public class User implements Runnable {
    Toggle toggle;
    int sleep = 1500;
    int count = 5;

    public User(Toggle toggle) {
        this.toggle = toggle;
    }

    @Override
    public void run() {
        for (int i = 0; i < count;) {
            if (!toggle.getStatus()) {
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                toggle.on();
                System.out.println("ВКЛ");
                i++;
            }
        }
    }
}
