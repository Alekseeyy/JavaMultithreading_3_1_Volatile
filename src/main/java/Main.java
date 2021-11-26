public class Main {

    public static volatile boolean toggle;

    public static void main(String[] args) {
        User user = new User();
        Toy toy = new Toy();
        Thread threadUser = new Thread(user);
        Thread threadToy = new Thread(toy);
        threadUser.start();
        threadToy.start();
        try {
            threadUser.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadToy.interrupt();
    }
}
