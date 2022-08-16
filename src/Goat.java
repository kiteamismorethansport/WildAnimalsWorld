public class Goat extends Herbivores{
    public static String unicodeOfAnimal = "\uD83D\uDC11";
    public static int eatIndex = 9;
    public static int beEatenIndex =9;
    public static String nameOfAnimal = "goat";
    public static int weight = 60;
    public static int speed = 3;
    public static int canEat = 10;
    public static int bornWeight = 60;
    public Goat(String unicodeOfAnimal, String nameOfAnimal, String sex, int bornWeight, int weight, int speed, int x, int y, boolean isVeg, int eatIndex, int beEatenIndex, int canEat, boolean eatable) {
        super(unicodeOfAnimal, nameOfAnimal, sex, bornWeight, weight, speed, x, y, isVeg, eatIndex, beEatenIndex, canEat, eatable);
        this.unicodeOfAnimal = unicodeOfAnimal;
        this.nameOfAnimal = nameOfAnimal;
        this.eatIndex = eatIndex;
        this.beEatenIndex = beEatenIndex;
        this.weight = weight;
        this.speed = speed;
        this.canEat = canEat;
        this.bornWeight = bornWeight;
    }
}
