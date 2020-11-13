public class Main {
    public static void main(String[] args) {
        Toggle toggle = new Toggle();

        User user = new User(toggle);
        Toy toy = new Toy(toggle);

        Thread threadToy = new Thread(toy);
        Thread threadUser = new Thread(user);

        threadUser.start();
        threadToy.start();

        try {
            threadUser.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(!threadUser.isAlive()) {
            threadToy.interrupt();
        }

    }
}


