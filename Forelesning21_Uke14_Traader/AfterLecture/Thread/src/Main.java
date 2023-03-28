public class Main {
    public static void main(String[] args) throws InterruptedException {
        RunnableCounter runnableCounter = new RunnableCounter(1000);
        ThreadCounter threadCounter = new ThreadCounter(1000);

        Thread runnableThread = new Thread(runnableCounter);


        Thread anonThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        });

        runnableThread.start();
        threadCounter.start();
        anonThread.start();

        runnableThread.join();
        threadCounter.join();
        anonThread.join();


        System.out.println("Threads finished");
    }
}