package task7_;

public class Wardrobe extends Furniture{
    public Wardrobe(String name, double price) {
        super(name, price);
    }

    public void Open(){
        System.out.println(name + "was opened");
    }

    public void Close(){
        System.out.println(name + "was closed");
    }
}
