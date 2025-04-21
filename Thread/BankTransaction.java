// Thread Communication Example: Withdrawal and Deposit

class Account {
    private int balance = 0;

    // Method to deposit money
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Current Balance: " + balance);
        notify(); // Notify any waiting thread
    }

    // Method to withdraw money
    public synchronized void withdraw(int amount) {
        while (balance < amount) { // Wait if balance is insufficient
            System.out.println("Insufficient balance for withdrawal. Waiting for deposit...");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
    }
}

public class BankTransaction {
    public static void main(String[] args) {
        Account account = new Account();

        // Thread for Withdrawal
        Thread withdrawThread = new Thread(() -> {
            account.withdraw(500); // Trying to withdraw 500
        });

        // Thread for Deposit
        Thread depositThread = new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulating delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
            account.deposit(1000); // Depositing 1000
        });

        withdrawThread.start();
        depositThread.start();
    }
}
