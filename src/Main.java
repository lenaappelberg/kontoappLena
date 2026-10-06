import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountRegister List= new AccountRegister();
        Scanner scanner= new Scanner(System.in);
        int choice=0;
        while(choice!=8){
            System.out.println("1. make account | 2. List all accounts | 3. deposit | 4. withdraw money " +
                    "| 5. look up a specific account |6. make savingsaccount | 7. calculate interest on savings account" +
                    " |8. end program");
            choice=scanner.nextInt();
            if (choice==1){
                System.out.println("please type the owner of the new account");
                String owner= scanner.next();
                System.out.println("please type how much money this account should have");
                int balance= scanner.nextInt();
                List.createAccount(owner,balance);
            } else if (choice==2) {
                List.printall();
            } else if (choice==3) {
                System.out.println("which account are you going to deposit money in?");
                String owner=scanner.next();
                Account currentaccount=List.findaccount(owner);
                SavingsAccount currentsavingsaccount=List.findsavingsAccount(owner);
                if (currentaccount==null&&currentsavingsaccount==null){
                    System.out.println("account does not exist");
                    break;
                } else if (currentsavingsaccount!=null) {
                    System.out.println("How much money do you want to deposit");
                    int amount= scanner.nextInt();
                    currentsavingsaccount.deposit(amount);
                } else {
                    System.out.println("How much money do you want to deposit");
                    int amount= scanner.nextInt();
                    currentaccount.deposit(amount);
                }
            } else if (choice==4) {
                System.out.println("which account are you going to withdraw money from?");
                String owner=scanner.next();
                Account currentaccount=List.findaccount(owner);
                SavingsAccount currentsavingsaccount=List.findsavingsAccount(owner);
                if (currentaccount==null&&currentsavingsaccount==null){
                    System.out.println("account does not exist");
                    break;
                } else if (currentsavingsaccount!=null) {
                    System.out.println("how much money do you want to withdraw");
                    int amount= scanner.nextInt();
                    currentsavingsaccount.withdraw(amount);
                } else {
                    System.out.println("how much money do you want to withdraw");
                    int amount= scanner.nextInt();
                    currentaccount.withdraw(amount);
                }
            } else if (choice==5) {
                System.out.println("which account do you want to look up?");
                String owner=scanner.next();
                Account currentaccount=List.findaccount(owner);
                System.out.println(currentaccount.getOwner() + currentaccount.getBalance());
            } else if (choice==6) {
                System.out.println("make savingsaccount");
                System.out.println("Input owner name:");
                String owner=scanner.next();
                System.out.println("Input the start balance");
                double balance=scanner.nextInt();
                List.createSavingsAccount(owner,balance);
            } else if (choice==7) {
                System.out.println("calculate interest");
                System.out.println(" on which account?");
                String owner= scanner.next();
                SavingsAccount currentsavingsaccount=List.findsavingsAccount(owner);
                System.out.println("How much money?");
                double amount=scanner.nextInt();
                double interestpayment=currentsavingsaccount.savingsinterest(amount);
                System.out.println("Your interest payment is "+interestpayment);
            } else if (choice==8) {
                System.out.println("Goodbye");
            }
        }
    }
}