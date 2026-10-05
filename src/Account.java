public class Account {
    private String owner;
    private double balance;
    public Account(String owner, double balance){
        this.owner=owner;
        this.balance=balance;
    }
    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        this.balance+=amount;
    }
    public void withdraw(double amount){
        if (amount<0){
            System.out.println("amount must be greater than 0");
        } else if (amount>this.balance) {
            System.out.println("amount must be smaller than account balance");
        }else this.balance-=amount;
    }
}
