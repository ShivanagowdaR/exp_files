public class BankService {

    // Simple BankAccount class
    static class BankAccount {
        double balance;

        // Constructor
        BankAccount(double money) {
            balance = money;
        }

        // Deposit money
        void deposit(double money) {
            balance = balance + money;
        }

        // Withdraw money
        void withdraw(double money) {
            balance = balance - money;
        }

        // Show balance
        double getBalance() {
            return balance;
        }
    }

    // Main method
    public static void main(String[] args) {

        BankAccount acc = new BankAccount(5000);

        System.out.println("Initial Balance: " + acc.getBalance());

        acc.deposit(600);
        System.out.println("After Deposit: " + acc.getBalance());

        acc.withdraw(200);
        System.out.println("After Withdraw: " + acc.getBalance());

        System.out.println("Final Balance: " + acc.getBalance());
    }
}
