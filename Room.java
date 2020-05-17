import java.util.ArrayList;

public class Room {

    int roomArea;
    public ArrayList<Furniture> furniture = new ArrayList<Furniture>();

    public Room(ArrayList<Furniture> furniture, int roomArea) {
        this.furniture = furniture;
        this.roomArea = roomArea;
    }
    public ArrayList<Furniture> getTheFurniture() {
        return furniture;
    }

    public double getTotalPrice(ArrayList<Furniture> furniture){
        double TotalPrice =0;
        for (int i =0; i < furniture.size(); i++){
            TotalPrice += furniture.get(i).getPriceWithVAT();
        }
        return TotalPrice;
    }

}