public class Toy implements Runnable {

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if (Main.toggle) {
                Main.toggle = false;
                System.out.println("Игрушка выключила тумблер");
            }
        }
    }
}
