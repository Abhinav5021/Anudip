interface BankOperations {
    double getBalance();

    void deposit(double amount);

    void withdraw(double amount);
}

public class BankAccount implements BankOperations {
    private String accountHolderName;
    private String bankName;
    private double accountBalance;

    public BankAccount(String accountHolderName, String bankName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }

    @Override
    public double getBalance() {
        return accountBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println(accountHolderName + " deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println(accountHolderName + " withdrew ₹" + amount);
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal.");
        }
    }

    public void displayAccount() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Current Balance: ₹ " + accountBalance);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Abhinav", "ICICI", 5000);
        BankAccount acc2 = new BankAccount("Sharad", "HDFC", 8000);
        BankAccount acc3 = new BankAccount("Rahul", "SBI", 10000);

        acc1.deposit(1500);
        acc1.withdraw(2000);
        acc1.displayAccount();

        acc2.deposit(3000);
        acc2.withdraw(4000);
        acc2.displayAccount();

        acc3.deposit(2000);
        acc3.withdraw(2500);
        acc3.displayAccount();
    }
}
