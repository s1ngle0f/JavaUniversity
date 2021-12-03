package task15_16;

public class ATM implements Runnable{

    private String name;
    private Bank bank;

    public ATM(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    private void deposit(double count){
        bank.deposit(count);
        System.out.println("Deposit: " + bank.getName() + ", " + name + ", " + count + ", Bank balance: " + bank.getBalance());
    }

    private void withdraw(double count){
        bank.withdraw(count);
        System.out.println("Withdraw: " + bank.getName() + ", " + name + ", " + count + ", Bank balance: " + bank.getBalance());
    }

    @Override
    public void run() {
        int r;
        while (true){
            try {
                r = (int)(Math.random()*2);
                if( r == 0 )
                    withdraw(10000 + Math.random()*2500);
                else
                    deposit(10000 + Math.random()*2500);
                Thread.sleep((long) (3000 + Math.random()*2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
