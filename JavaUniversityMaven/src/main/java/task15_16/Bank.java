package task15_16;

public class Bank {
    private double balance = 1000000;
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw( double count ){
        if( balance - count > 0 )
            balance -= count;
    }

    public void deposit( double count ){
        balance += count;
    }
}
