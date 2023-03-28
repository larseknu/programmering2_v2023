import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount yourBankAccount = new BankAccount("9001", 10000);
        BankAccount myBankAccount = new BankAccount("9002", 10000);

        manualThread(yourBankAccount);
        executorThreads(myBankAccount);
    }

    private static void executorThreads(BankAccount bankAccount) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i=0; i < 3; i++) {
            executorService.submit(new TransactionHandler(bankAccount));
        }

        executorService.shutdown();

        executorService.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("End balance: " + bankAccount.getBalance());

    }

    private static void manualThread(BankAccount bankAccount) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();

        for (int i=0; i < 3; i++) {
            Thread thread = new Thread(new TransactionHandler(bankAccount));
            thread.start();
            threads.add(thread);
        }

        for (Thread thread : threads) {
                thread.join();
        }

        System.out.println("End balance: " + bankAccount.getBalance());
    }
}