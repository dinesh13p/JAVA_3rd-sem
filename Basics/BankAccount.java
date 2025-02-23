public class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;

    // Parameterized constructor
    BankAccount(int _accountNumber, String _accountHolderName, double _balance) {
        this.accountNumber = _accountNumber;
        this.accountHolderName = _accountHolderName;
        this.balance = _balance;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited amount is: NPR " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn amount is: NPR " + amount);
        } else if (amount > 0) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    // Display balance method
    void displayBalance() {
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Balance: NPR " + balance);
    }

    public static void main(String[] args) {
        // First account
        System.out.println("Bank account 1:");
        BankAccount bankAccount1 = new BankAccount(1010, "Chunil", 0);
        bankAccount1.deposit(1000);
        bankAccount1.withdraw(500);
        bankAccount1.displayBalance();

        System.out.println(); // for seperating line in output

        // Second account
        System.out.println("Bank account 2:");
        BankAccount bankAccount2 = new BankAccount(2020, "Aarav", 5000);
        bankAccount2.deposit(2000);
        bankAccount2.withdraw(3000);
        bankAccount2.displayBalance();
    }
}


// -------------- Static keyword --------------- //