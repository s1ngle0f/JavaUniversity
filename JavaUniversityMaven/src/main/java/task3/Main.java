package task3;

public class Main {

    public static void main(String[] args)
    {
        Circle circles[] = new Circle[100];
        for(int i = 0; i < circles.length; i++){
            circles[i] = new Circle((float) (Math.random()*10));
            System.out.println(circles[i].getRadius() + " " + circles[i].getLengthOfCircle() + " " + circles[i].getАreaOfCircle());
        }

        Human humans[] = new Human[10];
        for(int i = 0; i < humans.length; i++){
            humans[i] = new Human( new Hand("r"), new Hand("l"), new Leg("r"), new Leg("l"), new Head((int) (Math.random()*100)) );
            System.out.println(humans[i].getInfoAboutHuman());
        }

        Book books[] = new Book[10];
        for(int i = 0; i < books.length; i++){
            books[i] = new Book("pushkin", "asd", 1098);
            System.out.println(books[i].toString());
        }
    }
}
