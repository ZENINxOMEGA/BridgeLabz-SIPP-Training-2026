class BankAccount {

    private int accountNumber;
    private String holder;
    private double balance;

    static int totalAccounts = 0;

    BankAccount(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;

        totalAccounts++;
    }

    void deposit(double amount) {
        balance += amount;

        System.out.println(
                "Deposited ₹" + amount +
                " into Account " + accountNumber);
    }

    void withdraw(double amount) {

        if (amount > balance) {

            System.out.println(
                    "Withdrawal Failed: Insufficient Balance");

        } else {

            balance -= amount;

            System.out.println(
                    "Withdrawn ₹" + amount +
                    " from Account " + accountNumber);
        }
    }

    void getStatement() {

        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Balance        : ₹" + balance);
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount acc1 =
                new BankAccount(101, "Rahul", 10000);

        BankAccount acc2 =
                new BankAccount(102, "Priya", 15000);

        BankAccount acc3 =
                new BankAccount(103, "Aman", 20000);

        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.deposit(1000);
        acc1.withdraw(500);
        acc1.withdraw(3000);

        acc2.deposit(5000);
        acc2.withdraw(2000);
        acc2.deposit(1000);
        acc2.withdraw(3000);
        acc2.withdraw(2500);

        acc3.deposit(4000);
        acc3.withdraw(1000);
        acc3.deposit(2500);
        acc3.withdraw(5000);
        acc3.withdraw(30000);

        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        System.out.println(
                "\nTotal Accounts Created : "
                + BankAccount.totalAccounts);
    }
}