public class BankAccount {
    private String nameOfDepositor;
    private String accountNumber;
    private String accountType;
    private double balance;

    public BankAccount(String nameOfDepositor, String accountNumber, String accountType, double balance) {
        this.nameOfDepositor = nameOfDepositor;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into the account.");
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew " + amount + " from the account.");
            } else {
                System.out.println("Insufficient balance to make the withdrawal.");
            }
        } else {
            System.out.println("Invalid withdrawal amount. Amount must be greater than 0.");
        }
    }

    public void display() {
        System.out.println("Account Holder: " + nameOfDepositor);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", "1234567890", "Savings", 1000.0);

        account.display();
        account.deposit(500);
        account.display();
        account.withdraw(300);
        account.display();
    }
}
