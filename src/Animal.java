import java.util.ArrayList;
import java.util.Random;

public class Animal {
    public String unicodeOfAnimal;
    public String nameOfAnimal;
    public int weight;
    public int speed;
    public int x;
    public int y;
    public boolean isVeg;
    public static int[][] eatOrBeEatenProbabilityTable = new int[15][16];
    public int eatIndex;
    public int beEatenIndex;
    public String sex;
    public int canEat;
    public static boolean eatable = true;
    public static int bornWeight;
    public static int[][] animalsWorld = new int[20][100];

    public Animal(String unicodeOfAnimal, String nameOfAnimal, String sex, int bornWeight, int weight, int speed, int x, int y, boolean isVeg, int eatIndex, int beEatenIndex, int canEat, boolean eatable) {
        this.unicodeOfAnimal = unicodeOfAnimal;
        this.nameOfAnimal = nameOfAnimal;
        this.sex = sex;
        this.weight = weight;
        this.speed = speed;
        this.x = x;
        this.y = y;
        this.isVeg = isVeg;
        this.eatIndex = eatIndex;
        this.beEatenIndex = beEatenIndex;
        this.canEat = canEat;
        this.eatable = eatable;
        this.bornWeight = bornWeight;

    }

    public static String sex(){
        int i = (int)(Math.random()*10);
        String s = null;
        if (i>=5){
            s = "male";
        }
        else if (i<5){
            s = "female";

        }
        return s ;
    }
    // This method describes and realize the random movement of each Animal int animals ArrayList
    public static void move (ArrayList<Animal> animals){
       for (int k = 0; k<animals.size();k++) {
           double i = Math.random() * 10;
           if (i >= 0 && i <= 2.5) {
               animals.get(k).x += animals.get(k).speed;
               if (animals.get(k).x > animalsWorld[0].length) {
                   animals.get(k).x = animalsWorld[0].length;
               }
               animals.get(k).weight = animals.get(k).weight - animals.get(k).canEat;
           }
           if (i > 2.5 && i <= 5) {
               animals.get(k).x -= animals.get(k).speed;
               if (animals.get(k).x < 0) {
                   animals.get(k).x = 0;
               }
               animals.get(k).weight = animals.get(k).weight - animals.get(k).canEat;
           }
           if (i > 5 && i <= 7.5) {
               animals.get(k).y +=animals.get(k).speed;
               if (animals.get(k).y > animalsWorld.length) {
                   animals.get(k).y = animalsWorld.length;
               }
               animals.get(k).weight = animals.get(k).weight - animals.get(k).canEat;
           }
           if (i > 7.5 && i <= 10) {
               animals.get(k).y -= animals.get(k).speed;
               if (animals.get(k).y < 0) {
                   animals.get(k).y = 0;
               }
               animals.get(k).weight = animals.get(k).weight - animals.get(k).canEat;
           }
       }
    }


// This method realizes process of reproduction of Animals
    public static ArrayList <Animal> multiply (ArrayList<Animal> animals) {
        for (int i = 0; i < animals.size(); i++) {
            for (int k = i + 1; k < animals.size(); k++) {
                if (animals.get(i).getClass().equals(animals.get(k).getClass()) && animals.get(i).x == animals.get(k).x && animals.get(i).y == animals.get(k).y && !animals.get(i).sex.equals(animals.get(k).sex) && animals.get(i).eatIndex == animals.get(k).eatIndex && animals.get(i).beEatenIndex == animals.get(k).beEatenIndex) {

                    animals.add(new Animal(animals.get(i).unicodeOfAnimal, animals.get(i).nameOfAnimal, Animal.sex(), animals.get(i).bornWeight, animals.get(i).bornWeight, animals.get(i).speed, (int) (Math.random() * 100), (int) (Math.random() * 20), animals.get(i).isVeg, animals.get(i).eatIndex, animals.get(i).beEatenIndex, animals.get(i).canEat, Animal.eatable));
                }
            }
        }
        return animals;
    }
// This method realizes process of taking food by animals predators, and herbivorous
    public static void eat(ArrayList<Animal> animals, ArrayList<Plants> plants) {
        for (int i = 0; i < animals.size(); i++) {
            for (int k = i + 1; k < animals.size(); k++) {
                if (animals.get(k).isVeg && !animals.get(i).isVeg && animals.get(i).x == animals.get(k).x && animals.get(i).y == animals.get(k).y && animals.get(k).eatable) {
                    Random eatProbability = new Random();
                    int a = eatProbability.nextInt(100);
                    if (a < eatOrBeEatenProbability(animals.get(i), animals.get(k)) && animals.get(k).weight >= animals.get(i).canEat) {
                        animals.get(i).weight = animals.get(i).weight + animals.get(i).canEat;
                        animals.get(k).weight = animals.get(k).weight - animals.get(i).canEat;

                        if (animals.get(k).weight <= 0) {
                            animals.get(k).eatable = false;
                        }

                    } else if (a < eatOrBeEatenProbability(animals.get(i), animals.get(k)) && animals.get(k).weight < animals.get(i).canEat) {
                        animals.get(i).weight = animals.get(i).weight + animals.get(k).weight;
                        animals.get(k).weight = animals.get(k).weight - animals.get(k).weight;
                        animals.get(k).eatable = false;

                    }
                }
            }

        }

        for(int i =0;i< animals.size(); i++){
            for (int k =i+1; k<plants.size(); k++){
                if (plants.get(k).green && animals.get(i).isVeg && animals.get(i).x == plants.get(k).x && animals.get(i).y == plants.get(k).y && plants.get(k).weight>=animals.get(i).canEat) {
                    animals.get(i).weight = animals.get(i).weight + animals.get(i).canEat;
                    plants.get(k).weight = plants.get(k).weight - animals.get(i).canEat;
                    if (plants.get(k).weight<=0){
                        plants.get(k).green = false;
                    }

                }
                else if (plants.get(k).green && animals.get(i).isVeg && animals.get(i).x == plants.get(k).x && animals.get(i).y == plants.get(k).y && plants.get(k).weight<animals.get(i).canEat){
                    animals.get(i).weight = animals.get(i).weight + plants.get(k).weight;
                    plants.get(k).weight = plants.get(k).weight - plants.get(k).weight;
                    plants.get(k).green = false;

                }
            }
        }
    }
    public static int eatOrBeEatenProbability(Animal one, Animal two){
        for( int i = 0; i<14;i++) {
            for (int k = 0; k < 15; k++) {
                eatOrBeEatenProbabilityTable [i][k] = 0;
            }
        }
        eatOrBeEatenProbabilityTable [0][5] = 10;
        eatOrBeEatenProbabilityTable [0][6] = 15;
        eatOrBeEatenProbabilityTable [0] [7] = 60;
        eatOrBeEatenProbabilityTable [0] [8] = 80;
        eatOrBeEatenProbabilityTable [0] [9] = 60;
        eatOrBeEatenProbabilityTable [0] [10] = 70;
        eatOrBeEatenProbabilityTable [0] [11] = 15;
        eatOrBeEatenProbabilityTable [0] [12] = 10;
        eatOrBeEatenProbabilityTable [0] [13] = 40;
        eatOrBeEatenProbabilityTable [1] [2] = 15;
        eatOrBeEatenProbabilityTable [1] [7] = 20;
        eatOrBeEatenProbabilityTable [1] [8] = 40;
        eatOrBeEatenProbabilityTable [1] [13] = 10;
        eatOrBeEatenProbabilityTable [2] [7] = 70;
        eatOrBeEatenProbabilityTable [2] [8] = 90;
        eatOrBeEatenProbabilityTable [2] [13] = 60;
        eatOrBeEatenProbabilityTable [2] [14] = 40;
        eatOrBeEatenProbabilityTable [3] [1] = 80;
        eatOrBeEatenProbabilityTable [3] [5] = 40;
        eatOrBeEatenProbabilityTable [3] [6] = 80;
        eatOrBeEatenProbabilityTable [3] [7] = 80;
        eatOrBeEatenProbabilityTable [3] [8] = 90;
        eatOrBeEatenProbabilityTable [3] [9] = 70;
        eatOrBeEatenProbabilityTable [3] [10] = 70;
        eatOrBeEatenProbabilityTable [3] [11] = 50;
        eatOrBeEatenProbabilityTable [3] [12] = 20;
        eatOrBeEatenProbabilityTable [3] [13] = 10;
        eatOrBeEatenProbabilityTable [4] [2] = 10;
        eatOrBeEatenProbabilityTable [4] [7] = 90;
        eatOrBeEatenProbabilityTable [4] [8] = 90;
        eatOrBeEatenProbabilityTable [4] [13] = 80;
        eatOrBeEatenProbabilityTable [5] [15] = 100;
        eatOrBeEatenProbabilityTable [6] [15] = 100;
        eatOrBeEatenProbabilityTable [7] [15] = 100;
        eatOrBeEatenProbabilityTable [8] [14] = 90;
        eatOrBeEatenProbabilityTable [8] [15] =100;
        eatOrBeEatenProbabilityTable [9] [15] = 100;
        eatOrBeEatenProbabilityTable [10] [15] = 100;
        eatOrBeEatenProbabilityTable [11] [8] = 50;
        eatOrBeEatenProbabilityTable [11] [14] = 90;
        eatOrBeEatenProbabilityTable [11] [15] = 100;
        eatOrBeEatenProbabilityTable [12] [15] = 100;
        eatOrBeEatenProbabilityTable [13] [14] = 90;
        eatOrBeEatenProbabilityTable [13] [15] = 100;
        eatOrBeEatenProbabilityTable [14] [15] = 100;

        if (eatOrBeEatenProbabilityTable[one.eatIndex][two.beEatenIndex]>0 ){
            return eatOrBeEatenProbabilityTable[one.eatIndex][two.beEatenIndex];
        }
        else return 0;
    }
    public static ArrayList <Animal> die (ArrayList<Animal> animals) {
        for (int i = 0; i<animals.size(); i++){
            if (animals.get(i).weight <= 0) {

                animals.remove(i);
            }
        }
        return animals;
        }
    }

