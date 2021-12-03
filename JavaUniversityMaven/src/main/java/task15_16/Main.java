package task15_16;

public class Main {
    public static void main(String[] args)
    {
        Bank sberbank = new Bank("SBERBANK");
        Bank tinkoff = new Bank("TINKOFF");

        ATM atm1 = new ATM("ATM1", sberbank);
        ATM atm2 = new ATM("ATM2", sberbank);

        ATM atm4 = new ATM("ATM1", tinkoff);
        ATM atm5 = new ATM("ATM2", tinkoff);

        Thread myThready0 = new Thread(atm1);
        Thread myThready1 = new Thread(atm2);
        Thread myThready2 = new Thread(atm4);
        Thread myThready3 = new Thread(atm5);
        myThready0.start();
        myThready1.start();
        myThready2.start();
        myThready3.start();
    }
}
