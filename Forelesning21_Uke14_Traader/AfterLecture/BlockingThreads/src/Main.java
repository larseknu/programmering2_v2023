public class Main {
    public static void main(String[] args) {
        String resource1 = "Valuable resource 1";
        String resource2 = "Valuable resource 2";

        // Create example of deadlock of resource1 and resource2 with threads
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + " locked " + resource1);


                pauseThread(100);

                System.out.println(Thread.currentThread().getName() + " trying to lock " + resource2);
                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + " locked " + resource2);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName() + " locked " + resource2);

                pauseThread(100);

                System.out.println(Thread.currentThread().getName() + " trying to lock " + resource1);
                synchronized (resource1) {
                    System.out.println(Thread.currentThread().getName() + " locked " + resource1);
                }
            }
        });

        thread1.start();
        thread2.start();
    }

    private static void pauseThread(int timeMs) {
        try {
            Thread.sleep(timeMs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}