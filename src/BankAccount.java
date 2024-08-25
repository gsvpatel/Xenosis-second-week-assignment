public class BankAccount {


    private double balance;

    public BankAccount(double initialbalance) throws IllegalAccessException {

        if (initialbalance < 0) {

            throw new IllegalAccessException("initial value  cant null");

        }

        this.balance = initialbalance;

    }

    public void deposit(double amount) throws IllegalAccessException {
        if (amount < 0) {
            throw new IllegalAccessException("Deposit must be Positive");
        }
        balance += amount;
        System.out.println("Deposited$ "+ amount + "New balance is$ "+ balance);
    }

    public void withdraw(double amount) throws IllegalAccessException {

        if (amount < 0) {
            throw new IllegalAccessException("withraw amounnt cant be null ");

        }
        if (amount > balance) {
            throw new IllegalAccessException("sorry insufficient balance in acount");
        }
        balance -= amount;

        System.out.printf("Withdrew $%.2f. New balance is $%.2f.%n", amount, balance);
    }




    public void displayBalance(){
        System.out.println("current balance in your account : "+balance);
    }

    public static void main(String[] args) throws IllegalAccessException {

        BankAccount b1 = new BankAccount(100);

        b1.deposit(500);

        b1.withdraw(50);


        b1.displayBalance();
    }
}












