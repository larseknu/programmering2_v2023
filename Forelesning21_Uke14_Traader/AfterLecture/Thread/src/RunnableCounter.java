public class RunnableCounter implements Runnable {
    private int countingTo;

    public RunnableCounter(int countingTo) {
        this.countingTo = countingTo;
    }

    @Override
    public void run() {
        for (int i = 0; i < countingTo; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

}
