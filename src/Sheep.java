public class Sheep extends Herbivores{
    public static String unicodeOfAnimal = "\uD83D\uDC11";
    public static int eatIndex = 10;
    public static int beEatenIndex =10;
    public static String nameOfAnimal = "sheep";
    public static int weight = 70;
    public static int speed = 3;
    public static int canEat = 15;
    public static int bornWeight = 70;

    public Sheep (String unicodeOfAnimal, String nameOfAnimal, String sex, int bornWeight, int weight, int speed, int x, int y, boolean isVegeterian, int eatIndex, int beEatenIndex, int canEat, boolean eatable) {
        super(unicodeOfAnimal, nameOfAnimal,sex, bornWeight, weight, speed, x, y, isVegeterian, eatIndex, beEatenIndex, canEat, eatable);
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
