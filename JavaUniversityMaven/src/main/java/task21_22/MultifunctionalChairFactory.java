package task21_22;

public class MultifunctionalChairFactory implements Factory {
    @Override
    public Chair createChair() {
        return new MultifunctionalChair();
    }
}
