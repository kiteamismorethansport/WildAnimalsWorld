
import java.util.ArrayList;

public class Statistics {
    // This method realizes statistics about quantity of all animal types and genders
    public static void statistics(ArrayList<Animal> animals, ArrayList <Plants> plants) {
        int wolfmale = 0;
        int wolffemale = 0;
        int goatmale= 0;
        int goatfemale = 0;
        int snakemale = 0;
        int snakefemale = 0;
        int bearmale = 0;
        int bearfemale = 0;
        int boarmale = 0;
        int boarfemale = 0;
        int buffalomale = 0;
        int buffalofemale = 0;
        int caterpillar = 0;
        int deermale = 0;
        int deerfemale = 0;
        int duckmale = 0;
        int duckfemale = 0;
        int eaglemale = 0;
        int eaglefemale = 0;
        int foxmale = 0;
        int foxfemale = 0;
        int horsemale = 0;
        int horsefemale = 0;
        int mousemale = 0;
        int mousefemale = 0;
        int rabbitmale = 0;
        int rabbitfemale = 0;
        int sheepmale = 0;
        int sheepfemale = 0;
        int quantityOfPlants = 0;

        for (int i = 0; i < animals.size(); i++) {

            if (animals.get(i).sex.equals("male") && animals.get(i).nameOfAnimal.equals("wolf")) {
                wolfmale++;
            }
            if (animals.get(i).sex.equals("female") && animals.get(i).nameOfAnimal.equals("wolf")) {
                wolffemale++;
            }
            if (animals.get(i).sex.equals("male") && animals.get(i).nameOfAnimal.equals("goat")) {
                goatmale++;
            }
            if (animals.get(i).sex.equals("female") && animals.get(i).nameOfAnimal.equals("goat")) {
                goatfemale++;
            }
            if (animals.get(i).sex.equals("male") && animals.get(i).nameOfAnimal.equals("snake")) {
                snakemale++;
            }
            if (animals.get(i).sex.equals("female") && animals.get(i).nameOfAnimal.equals("snake")) {
                snakefemale++;
            }
            if (animals.get(i).sex.equals("male") && animals.get(i).nameOfAnimal.equals("bear")) {
                bearmale++;
            }
            if (animals.get(i).sex.equals("female") && animals.get(i).nameOfAnimal.equals("bear")) {
                bearfemale++;
            }
            if (animals.get(i).sex.equals("male") && animals.get(i).nameOfAnimal.equals("boar")) {
                boarmale++;
            }
            if (animals.get(i).sex.equals("female") && animals.get(i).nameOfAnimal.equals("boar")) {
                boarfemale++;
            }
            if (animals.get(i).sex.equals("male") && animals.get(i).nameOfAnimal.equals("buffalo")) {
                buffalomale++;
            }
            if (animals.get(i).sex.equals("female") && animals.get(i).nameOfAnimal.equals("buffalo")) {
                buffalofemale++;
            }
            if (animals.get(i).sex.equals("male") && animals.get(i).nameOfAnimal.equals("caterpillar")) {
                caterpillar++;
            }
            if (animals.get(i).sex.equals("female") && animals.get(i).nameOfAnimal.equals("deer")) {
                deerfemale++;
            }
            if (animals.get(i).sex.equals("male") && animals.get(i).nameOfAnimal.equals("deer")) {
                deermale++;
            }
            if (animals.get(i).sex.equals("female") && animals.get(i).nameOfAnimal.equals("duck")) {
                duckfemale++;
            }
            if (animals.get(i).sex.equals("male") && animals.get(i).nameOfAnimal.equals("duck")) {
                duckmale++;
            }
            if (animals.get(i).sex.equals("female") && animals.get(i).nameOfAnimal.equals("eagle")) {
                eaglemale++;
            }
            if (animals.get(i).sex.equals("male") && animals.get(i).nameOfAnimal.equals("eagle")) {
                eaglefemale++;
            }
            if (animals.get(i).sex.equals("female") && animals.get(i).nameOfAnimal.equals("fox")) {
                foxmale++;
            }
            if (animals.get(i).sex.equals("male") && animals.get(i).nameOfAnimal.equals("fox")) {
                foxfemale++;
            }
            if (animals.get(i).sex.equals("female") && animals.get(i).nameOfAnimal.equals("horse")) {
                horsemale++;
            }
            if (animals.get(i).sex.equals("male") && animals.get(i).nameOfAnimal.equals("horse")) {
                horsefemale++;
            }
            if (animals.get(i).sex.equals("female") && animals.get(i).nameOfAnimal.equals("mouse")) {
                mousemale++;
            }
            if (animals.get(i).sex.equals("male") && animals.get(i).nameOfAnimal.equals("mouse")) {
                mousefemale++;
            }
            if (animals.get(i).sex.equals("female") && animals.get(i).nameOfAnimal.equals("rabbit")) {
                rabbitmale++;
            }
            if (animals.get(i).sex.equals("male") && animals.get(i).nameOfAnimal.equals("rabbit")) {
                rabbitfemale++;
            }
            if (animals.get(i).sex.equals("female") && animals.get(i).nameOfAnimal.equals("sheep")) {
                sheepmale++;
            }
            if (animals.get(i).sex.equals("male") && animals.get(i).nameOfAnimal.equals("sheep")) {
                sheepfemale++;
            }
        }
        for (int k = 0; k < plants.size(); k++) {
            if (plants.get(k).green) {
                quantityOfPlants++;
            }
        }
        System.out.println("Total number of animals left : " + animals.size());
        System.out.print("Total number of wolf males: " + wolfmale + " ");
        System.out.print("Total number of wolf females: " + wolffemale+ " ");
        System.out.print("Total number of goat males: " + goatmale+ " ");
        System.out.print("Total number of goat females: " + goatfemale+ " ");
        System.out.println("Total number of snakes males: " + snakemale+ " ");
        System.out.print( "Total number of snakes females: " + snakefemale+ " ");
        System.out.print("Total number of bear males: " + bearmale+ " ");
        System.out.print("Total number of bear females: " + bearfemale+ " ");
        System.out.print("Total number of boar males: " + boarmale+ " ");
        System.out.println("Total number of boar females: " + boarfemale+ " ");
        System.out.print("Total number of buffalo males: " + buffalomale+ " ");
        System.out.print( "Total number of buffalo females: " + buffalofemale+ " ");
        System.out.print("Total number of  caterpillar: " + caterpillar+ " ");
        System.out.print("Total number of deer females: " + deermale+ " ");
        System.out.println("Total number of deer males: " + deerfemale+ " ");
        System.out.print("Total number of duck females: " + duckmale+ " ");
        System.out.print("Total number of duck males: " + duckfemale+ " ");
        System.out.print( "Total number of eagle females: " + eaglemale+ " ");
        System.out.print("Total number of eagle males: " + eaglefemale+ " ");
        System.out.println("Total number of fox females: " + foxmale+ " ");
        System.out.print("Total number of fox males: " + foxfemale+ " ");
        System.out.print("Total number of horse females: " + horsemale+ " ");
        System.out.print("Total number of horse males: " + horsefemale+ " ");
        System.out.print( "Total number of mouse females: " + mousemale+ " ");
        System.out.println("Total number of mouse males: " + mousefemale+ " ");
        System.out.print("Total number of rabbit females: " + rabbitmale+ " ");
        System.out.print("Total number of rabbit males: " + rabbitfemale+ " ");
        System.out.print("Total number of sheep females: " + sheepmale+ " ");
        System.out.print("Total number of sheep males: " + sheepfemale+ " ");
        System.out.print("Total number of plants: " + quantityOfPlants + " ");
        System.out.println();

    }

}
