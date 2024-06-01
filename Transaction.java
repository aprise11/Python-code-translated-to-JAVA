import java.time.LocalDateTime;

public class Transaction {
    String currency;
    double amount;
    String note;
    LocalDateTime timeStamp;

    public Transaction(String currency, double amount, String note) {
        this.currency = currency;
        this.amount = amount;
        this.note = note;
        this.timeStamp = LocalDateTime.now();
    }
}