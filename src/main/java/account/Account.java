package account;

import java.io.PrintStream;
import java.util.*;

public class Account {

    protected String date;
    protected String credit;
    protected String debit;
    protected Double balance;
    protected Double suma = 0.0;
    private final List<Account> list = new ArrayList<>();

    public Account(){
        this.date = "23/10/2000";
        this.credit = String.valueOf(0);
        this.debit = String.valueOf(0);
        this.balance = 0.0;
    }

    public Account(String date,String credit, String debit, Double balance){
        this.date = date;
        this.credit = credit;
        this.debit = debit;
        this.balance = balance;
    }

    protected void deposit(int amount,String date) {
        suma += amount;
        list.add(new Account(date,String.valueOf(amount),"",suma));
    }

    protected void withdrawal(int amount, String date){
        suma -= amount;
        list.add(new Account(date,"",String.valueOf(amount),suma));
    }

    public void printStatement(PrintStream out) {
        out.printf("%1s %10s %5s %10s %5s %10s %5s %10s %5s%n", "|", "date", "|", "credit", "|",
                "debit", "|", "balance", "|");
        out.printf("%s%n", "---------------------------------------------------------------------");
        list.forEach(x -> out.printf("%1s %10s %5s %10s %5s %10s %5s %10s %5s%n", "|", x.date , "|",
                x.credit, "|", x.debit, "|", x.balance, "|"));
    }
}