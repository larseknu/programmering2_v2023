public class TransactionHandler implements Runnable {
    private BankAccount bankAccount;

    public TransactionHandler(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (bankAccount) {
                int startBalance = bankAccount.getBalance();

                bankAccount.deposit(100);

                pauseThread(100);

                int endBalance = bankAccount.getBalance();

                System.out.println("Start balance: " + startBalance + " End balance: " + endBalance + " - " + Thread.currentThread().getName());
            }
        }
    }

    private void pauseThread(int timeMs) {
        try {
            Thread.sleep(timeMs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
