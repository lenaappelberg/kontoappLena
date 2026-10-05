import java.util.ArrayList;
import java.util.List;

public class AccountRegister {
    List<Account> Accountlist= new ArrayList<>();

    public void createAccount(String owner, double balance){
        Account a= new Account(owner,balance);
        Accountlist.add(a);
    }
    public void printall(){
        for (int i = 0; i < Accountlist.size(); i++) {
            System.out.println(Accountlist.get(i).getOwner());
            System.out.println(Accountlist.get(i).getBalance());
        }
    }
    public void findaccount(String inputowner){
        for (int i = 0; i < Accountlist.size(); i++) {
            if (Accountlist.get(i).getOwner().equals(inputowner))System.out.println(inputowner + "'s acount exists!");
        }
    }
}
