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
            choice=readInt(scanner);
            if (choice==1){
                System.out.println("please type the owner of the new account");
                String owner= scanner.next();
                System.out.println("please type how much money this account should have");
                int balance= readInt(scanner);
                List.createAccount(owner,balance);
            } else if (choice==2) {
                List.printall();
            } else if (choice==3) {
                System.out.println("which account are you going to deposit money in?");
                String owner=scanner.next();
                System.out.println("Regular or savings account?");
                String accounttype=scanner.next();
                if (accounttype.equalsIgnoreCase("regular")){
                    Account currentaccount=List.findaccount(owner);
                    if (currentaccount==null){
                        System.out.println("account does not exist");
                    } else {
                        System.out.println("How much money do you want to deposit");
                        int amount= readInt(scanner);
                        currentaccount.deposit(amount);
                    }
                } else if (accounttype.equalsIgnoreCase("savings")) {
                    SavingsAccount currentsavingsaccount=List.findsavingsAccount(owner);
                    if (currentsavingsaccount==null){
                        System.out.println("account does not exist");
                    }else {
                        System.out.println("How much money do you want to deposit");
                        int amount= readInt(scanner);
                        currentsavingsaccount.deposit(amount);
                    }
                }
            } else if (choice==4) {
                System.out.println("which account are you going to withdraw money from?");
                String owner=scanner.next();
                System.out.println("Regular or savings account?");
                String accounttype=scanner.next();
                if (accounttype.equalsIgnoreCase("regular")){
                    Account currentaccount=List.findaccount(owner);
                    if (currentaccount==null){
                        System.out.println("account does not exist");
                    } else {
                        System.out.println("How much money do you want to withdraw");
                        int amount= readInt(scanner);
                        currentaccount.withdraw(amount);
                    }
                } else if (accounttype.equalsIgnoreCase("savings")) {
                    SavingsAccount currentsavingsaccount=List.findsavingsAccount(owner);
                    if (currentsavingsaccount==null){
                        System.out.println("account does not exist");
                    }else {
                        System.out.println("How much money do you want to withdraw");
                        int amount= readInt(scanner);
                        currentsavingsaccount.withdraw(amount);
                    }
                }
            } else if (choice==5) {
                System.out.println("which account do you want to look up?");
                String owner=scanner.next();
                System.out.println("Regular or savings account?");
                String accounttype=scanner.next();
                if (accounttype.equalsIgnoreCase("regular")){
                    Account currentaccount=List.findaccount(owner);
                    System.out.println(currentaccount.getOwner() + currentaccount.getBalance());
                } else if (accounttype.equalsIgnoreCase("savings")) {
                    SavingsAccount currentsavingsaccount =List.findsavingsAccount(owner);
                    System.out.println(currentsavingsaccount.getOwner() + currentsavingsaccount.getBalance());
                }
            } else if (choice==6) {
                System.out.print(" Input owner name:\n make savingsaccount");
                String owner=scanner.next();
                System.out.println("Input the start balance");
                double balance=readInt(scanner);
                List.createSavingsAccount(owner,balance);
            } else if (choice==7) {
                System.out.print("calculate interest\non which account?");
                String owner= scanner.next();
                SavingsAccount currentsavingsaccount=List.findsavingsAccount(owner);
                System.out.println("How much money?");
                double amount=readInt(scanner);
                double interestpayment=currentsavingsaccount.savingsinterest(amount);
                System.out.println("Your interest payment is "+interestpayment);
            } else if (choice==8) {
                System.out.println("Goodbye");
            }
        }
    }
    public static int readInt(Scanner scanner){
      int inputint=0;
        try {
            inputint=scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Type a number");
            scanner.next();
        }
      return inputint;
    }
}