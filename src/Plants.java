import java.util.ArrayList;

public class Plants {
    public static String unicodeOfPlants = "\uD83C\uDF3F";
    public static int weight= 1;
    public boolean green;
    public int x;
    public int y;
    public static int bornWeight = 1;

    public Plants (String unicodeOfPlants, int bornWeight, int weight, int x, int y, boolean green) {
        this.unicodeOfPlants =unicodeOfPlants;
        this.weight = weight;
        this.bornWeight = bornWeight;
        this.green = green;
        this.x = x;
        this.y = y;

    }
// This method realizes procces of reproduction of plants
    public static ArrayList <Plants> plantsMultiply (ArrayList <Plants> plants) {
        for (int i = 0; i<100; i++) {
            plants.add(new Plants(Plants.unicodeOfPlants, Plants.bornWeight, Plants.weight, (int) (Math.random() * 100), (int) (Math.random() * 20), true));
        }
      return plants;
    }
    // This method realizes procces of removing of plants that were eaten by animals
    public static void beEaten (ArrayList <Plants> plants){
        for(int i =0; i<plants.size(); i ++) {
            if (plants.get(i).weight <= 0) {
                plants.get(i).green = false;
                plants.remove(i);
            }
        }
    }
}
