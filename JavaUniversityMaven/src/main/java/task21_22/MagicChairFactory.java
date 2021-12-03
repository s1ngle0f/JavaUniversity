package task21_22;

public class MagicChairFactory implements Factory {
    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}
