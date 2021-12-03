package task3;

public class Human {
    private Hand rHand, lHand;
    private Leg rLeg, lLeg;
    private Head head;

    public Human(Hand rHand, Hand lHand, Leg rLeg, Leg lLeg, Head head) {
        this.rHand = rHand;
        this.lHand = lHand;
        this.rLeg = rLeg;
        this.lLeg = lLeg;
        this.head = head;
    }

    public String getInfoAboutHuman(){
        return (head.getteraBytes() + " " + rHand.getId() + " " + lHand.getId() + " " + rLeg.getId() + " " + lLeg.getId());
    }
}
