public class User implements Runnable {

    private static final int NUMBER_ITERATIONS = 5;
    private static final int USER_PAUSE = 3000;

    @Override
    public void run() {
        for (int i = 0; i < NUMBER_ITERATIONS; i++) {
            if (!Main.toggle) {
                Main.toggle = true;
                System.out.println("Пользователь включил тумблер");
                try {
                    Thread.sleep(USER_PAUSE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
