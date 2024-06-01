import java.util.ArrayList;
import java.util.List;

public class Account {
    String number;
    String currency;
    double balance;
    List<Transaction> transactions;

    public Account(String number, String currency, double balance) {
        this.number = number;
        this.currency = currency;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public void makeDeposit(double amount, String note) {
        this.transactions.add(new Transaction(this.currency, amount, note));
        this.balance += amount;
    }

    public void makeWithdrawal(double amount, String note) {
        this.transactions.add(new Transaction(this.currency, -amount, note));
        this.balance -= amount;
    }
}