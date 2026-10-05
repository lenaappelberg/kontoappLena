import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountRegister List= new AccountRegister();
        Scanner scanner= new Scanner(System.in);
        int choice=0;
        while(choice!=6){
            System.out.println("1. make account | 2. List all accounts | 3. deposit | 4. withdraw money | 5. look up a specific account |6. end program");
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
                System.out.println("How much money do you want to deposit");
                int amount= scanner.nextInt();
                currentaccount.deposit(amount);
            } else if (choice==4) {
                System.out.println("which account are you going to withdraw money from?");
                String owner=scanner.next();
                Account currentaccount=List.findaccount(owner);
                System.out.println("how much money do you want to withdraw");
                int amount= scanner.nextInt();
                currentaccount.withdraw(amount);
            } else if (choice==5) {
                System.out.println("which account do you want to look up?");
                String owner=scanner.next();
                Account currentaccount=List.findaccount(owner);
                System.out.println(currentaccount.getOwner() + currentaccount.getBalance());
            } else if (choice==6) {
                System.out.println("Goodbye");
            }
        }
    }
}