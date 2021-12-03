package task7_;

public class Sofa extends Furniture{
    public Sofa(String name, double price) {
        super(name, price);
    }

    public void Decompose(){
        System.out.println(name + "was decomposed");
    }

    public void Compose(){
        System.out.println(name + "was composed");
    }
}
