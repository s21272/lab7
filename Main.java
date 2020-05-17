import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Furniture f1 = new Furniture("chairs", 25.0);
        Furniture f2 = new Furniture("table", 10.0);

        ArrayList<Furniture> furniture_list1= new ArrayList<Furniture>(Arrays.asList(f1,f2));
        Room r1 = new Room(furniture_list1 ,30);

        House.newHouse("DOM");
    }
}
