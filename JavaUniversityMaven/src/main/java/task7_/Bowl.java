package task7_;

public class Bowl extends Dish{
    public Bowl(double price, String name) {
        super(price, name);
    }

    public void Smash(){
        System.out.println("Bowl was smashed");
    }
}
