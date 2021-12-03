package task7_;

public class Labrador extends Dog{
    public Labrador(String name, int age) {
        super(name, age);
    }

    @Override
    public void Voice() {
        System.out.println("Bolshoy Gav");
    }
}
