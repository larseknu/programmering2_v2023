public class ThreadCounter extends Thread {
    private int countingTo;

    public ThreadCounter(int countingTo) {
        this.countingTo = countingTo;
    }

    @Override
    public void run() {
        for (int i = 0; i < countingTo; i++) {
            System.out.println(this.getName() + " " + i);
        }
    }
}
