import java.util.ArrayList;
import java.util.List;

public class AccountRegister {
    List<Account> Accountlist= new ArrayList<>();
    List<SavingsAccount> SavingsAccountlist= new ArrayList<>();
    public void createAccount(String owner, double balance){
        Account a= new Account(owner,balance);
        Accountlist.add(a);
    }
    public void createSavingsAccount(String owner,double balance){
        SavingsAccount a = new SavingsAccount(owner,balance);
        SavingsAccountlist.add(a);
    }
    public void printall(){
        for (int i = 0; i < Accountlist.size(); i++) {
            System.out.println(Accountlist.get(i).getOwner());
            System.out.println(Accountlist.get(i).getBalance());
        }
        for (int i = 0; i < SavingsAccountlist.size(); i++) {
            System.out.println(SavingsAccountlist.get(i).getOwner());
            System.out.println(SavingsAccountlist.get(i).getBalance());
        }
    }
    public Account findaccount(String inputowner){
        for (int i = 0; i < Accountlist.size(); i++) {
            if (Accountlist.get(i).getOwner().equalsIgnoreCase(inputowner)){
                System.out.println(inputowner + "'s acount exists!");
                return Accountlist.get(i);
            }
        }

        return null;
    }
    public SavingsAccount findsavingsAccount(String inputowner ){
        for (int i = 0; i < SavingsAccountlist.size(); i++) {
            if (SavingsAccountlist.get(i).getOwner().equalsIgnoreCase(inputowner)){
                System.out.println(inputowner + "'s acount exists!");
                return SavingsAccountlist.get(i);
            }
        }
        return null;
    }
}
