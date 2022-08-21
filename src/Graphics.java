import java.util.ArrayList;

public class Graphics {

    // This method erases all animation from the array
    public static String[][] graphics = new String[21][101];
    public static void graphicsErase(){
        for (int i = 0; i < 20; i++) {
            for (int k = 0; k < 100; k++) {
                graphics [i][k] = " ";
            }
        }
    }
    // This method fills array with animation that shows the type of animal and position of all animals and plants
    public static void graphics(ArrayList <Animal> animals, ArrayList <Plants> plants) {
       for (int k = 0; k< plants.size(); k++){
         graphics [plants.get(k).y][plants.get(k).x] = plants.get(k).unicodeOfPlants;
       }
      for (int i = 0; i<animals.size(); i ++){
               graphics[animals.get(i).y][animals.get(i).x] = animals.get(i).unicodeOfAnimal;
        }
        for (int i = 0; i < 20; i++) {
            for (int k = 0; k < 100; k++) {
                System.out.print(graphics [i][k]);
            }
            System.out.println();
        }

    }


}

