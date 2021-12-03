package task7_;

public class Main {

    public static void main(String[] args)
    {
        Bowl bowl = new Bowl(100, "Fathers");
        System.out.println(bowl.toString());
        Glass glass = new Glass(200, "Mothers");
        System.out.println(glass.toString());

        Bigle bigle = new Bigle("Bobik", 10);
        System.out.println(bigle.toString());
        bigle.Voice();
        Labrador labrador = new Labrador("Sharik", 12);
        System.out.println(labrador.toString());
        labrador.Voice();

        FurnitureShop furnitureShop = new FurnitureShop();
        Sofa sofa1 = new Sofa("Mayami", 1000);
        Sofa sofa2 = new Sofa("Mayami", 2000);
        Wardrobe wardrob1 = new Wardrobe("ZZZ", 200);
        Wardrobe wardrob2 = new Wardrobe("YYY", 400);

        furnitureShop.Add(sofa1);
        furnitureShop.Add(sofa2);
        furnitureShop.Add(wardrob1);
        furnitureShop.Add(wardrob2);

        furnitureShop.PrintShop();
    }
}
