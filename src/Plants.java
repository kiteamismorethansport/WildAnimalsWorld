import java.util.ArrayList;

public class Plants {
    public static int weight= 1;
    public boolean green;
    public int x;
    public int y;
    public static int bornWeight = 1;

    public Plants (int bornWeight, int weight, int x, int y, boolean green) {
        this.weight = weight;
        this.bornWeight = bornWeight;
        this.green = green;
        this.x = x;
        this.y = y;

    }

    public static void plantsMultiply (ArrayList <Plants> plants) {
        for (int i =0; i<100; i++){
            plants.add(new Plants(Plants.bornWeight, Plants.weight,(int)(Math.random()*20),(int)(Math.random()*100), true));
        }

    }
    public static void beEaten (ArrayList <Plants> plants){
        for(int i =0; i<plants.size(); i ++){
            if (plants.get(i).weight <=0){
                plants.get(i).green = false;
                plants.remove(i);
            }
        }
    }
}
