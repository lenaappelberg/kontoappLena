public class SavingsAccount extends Account {

    public SavingsAccount(String owner, double balance) {
        super(owner, balance);
    }

    public double savingsinterest(double amount){
        double interest=1.1;
        double interestamount=amount*interest;
        return interestamount;
    }
}
