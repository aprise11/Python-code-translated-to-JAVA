import java.util.ArrayList;
import java.util.List;

public class Client {
    static int numberOfClients = 0;

    String id;
    String name;
    List<Account> accounts;

    public Client(String id, String name) {
        this.id = id;
        this.name = name;
        this.accounts = new ArrayList<>();
        numberOfClients++;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }
}