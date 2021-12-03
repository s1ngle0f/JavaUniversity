package task2;

public class Main {

    public static void main(String[] args)
    {
        String[] names = {"Bobik", "Ezhik", "Sharik"};
        Dog dogs[] = new Dog[10];
        for(int i = 0; i < dogs.length; i++){
            dogs[i] = new Dog( names[(int) (Math.random()*3)], (int) (Math.random()*15) );
            dogs[i].toHumanAge();
            System.out.println(dogs[i].toString());
        }
    }
}
