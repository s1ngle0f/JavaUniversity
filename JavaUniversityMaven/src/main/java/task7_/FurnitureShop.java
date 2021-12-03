package task7_;

import java.util.ArrayList;

public class FurnitureShop {
    protected ArrayList<Furniture> furnitureArrayList = new ArrayList<Furniture>();

    public void Add(Furniture furniture){
        furnitureArrayList.add(furniture);
    }

    public void Buy(Furniture furniture){
        for(int i = 0; i < furnitureArrayList.size(); i++){
            if(furnitureArrayList.get(i) == furniture){
                furnitureArrayList.remove(i);
            }
        }
    }

    public void PrintShop() {
        System.out.println("Shop: ");
        for(int i = 0; i < furnitureArrayList.size(); i++){
            System.out.println("    " + furnitureArrayList.get(i).toString());
        }
    }
}
