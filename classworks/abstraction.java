public class abstraction {

    static abstract class BankAccount {
        String accountHolder;
        double balance;

        public BankAccount(String accountHolder, double balance) {
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        
        public void deposit(double amount) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        }

        
        public void checkBalance() {
            System.out.println(accountHolder + "'s balance: " + balance);
        }

        
        public abstract void withdraw(double amount);
    }

    
    static class SavingsAccount extends BankAccount {
        public SavingsAccount(String accountHolder, double balance) {
            super(accountHolder, balance);
        }

        @Override
        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient balance in Savings Account!");
            } else {
                balance -= amount;
                System.out.println(amount + " withdrawn. New balance: " + balance);
            }
        }
    }

    
    static class CurrentAccount extends BankAccount {
        public CurrentAccount(String accountHolder, double balance) {
            super(accountHolder, balance);
        }

        @Override
        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient balance in Current Account!");
            } else {
                balance -= amount;
                System.out.println(amount + " withdrawn. New balance: " + balance);
            }
        }
    }

    
    static class FixedDepositAccount extends BankAccount {
        boolean isMatured;

        public FixedDepositAccount(String accountHolder, double balance, boolean isMatured) {
            super(accountHolder, balance);
            this.isMatured = isMatured;
        }

        @Override
        public void withdraw(double amount) {
            if (!isMatured) {
                System.out.println("Cannot withdraw! Fixed Deposit has not matured yet.");
            } else if (amount > balance) {
                System.out.println("Insufficient balance in Fixed Deposit Account!");
            } else {
                balance -= amount;
                System.out.println(amount + " withdrawn. New balance: " + balance);
            }
        }
    }

    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount("Tariqul", 5000);
        BankAccount current = new CurrentAccount("Faysal", 10000);
        BankAccount fixedDeposit = new FixedDepositAccount("Rahim", 20000, false); // not matured yet

        System.out.println("---- Savings Account ----");
        savings.deposit(1000);
        savings.withdraw(2000);
        savings.checkBalance();

        System.out.println("\n---- Current Account ----");
        current.deposit(500);
        current.withdraw(3000);
        current.checkBalance();

        System.out.println("\n---- Fixed Deposit Account ----");
        fixedDeposit.deposit(1000);
        fixedDeposit.withdraw(5000);   // not working 
        fixedDeposit.checkBalance();
    }
}