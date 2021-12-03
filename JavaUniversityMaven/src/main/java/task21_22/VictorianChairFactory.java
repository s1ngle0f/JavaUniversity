package task21_22;

public class VictorianChairFactory implements Factory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
