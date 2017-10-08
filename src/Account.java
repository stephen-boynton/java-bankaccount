/**
 * Created by stephenboynton on 6/28/17.
 */
public class Account {

    private int accountNumber;
    private double balance;
    private String name;
    private String eMail;
    private String phone;


    public Account () {
        this(1234, 0.00, "Default", "No email on file", "No number");
    }

    //This is how you create your own Constructor! Pretty nfity!
    public Account (int accountNumber, double balance, String name, String eMail, String phone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.eMail = eMail;
        this.phone = phone;
    }

    public void deposit (double amount) {
        this.balance = this.balance + amount;
        System.out.println(balance);
    }

    public void withdraw (double amount) {
        if (amount > this.balance) {
            System.out.println("Not enough money.");
        } else {
            this.balance = this.balance - amount;
            System.out.println(balance);
        }
    }



}
