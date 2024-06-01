import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        clients.add(new Client("123456", "Anna"));
        clients.add(new Client("987654", "Oskar"));
        clients.add(new Client("456123", "Jenifer"));

        clients.get(0).addAccount(new Account("EE654987564321", "EUR", 1000.0));
        clients.get(0).addAccount(new Account("JP582147859635", "JPY", 25000.30));
        clients.get(0).addAccount(new Account("US654987643214", "USD", 5.50)); 
        clients.get(1).addAccount(new Account("PL849512635445", "PLN", 47800.00));
        clients.get(2).addAccount(new Account("SE741254956587", "SEK", 200.18));

        clients.get(0).accounts.get(0).makeDeposit(1200, "Salary");
        clients.get(0).accounts.get(0).makeWithdrawal(50, "Grocery");
        clients.get(0).accounts.get(0).makeWithdrawal(140, "Clothes");
        clients.get(0).accounts.get(0).makeWithdrawal(20, "Dinner");

        System.out.println("We have " + Client.numberOfClients + " clients in our bank:");
        for (Client client : clients) {
            System.out.println("Client " + client.name + " has the following accounts:");
            for (Account account : client.accounts) {
                System.out.println("    " + account.number + " (" + account.currency + ") " + account.balance);
                for (Transaction transaction : account.transactions) {
                    System.out.println("        " + transaction.timeStamp + " " + transaction.currency + " " + transaction.amount);
                }
            }
        }
    }
}