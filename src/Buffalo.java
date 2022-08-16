public class Buffalo extends Herbivores{
    public static String unicodeOfAnimal = "\uD83D\uDC03";
    public static int eatIndex = 12;
    public static int beEatenIndex =12;
    public static String nameOfAnimal = "buffalo";
    public static int weight = 700;
    public static int speed = 3;
    public static int canEat = 100;
    public static int bornWeight = 700;
    public Buffalo(String unicodeOfAnimal, String nameOfAnimal, String sex, int bornWeight, int weight, int speed, int x, int y, boolean isVeg, int eatIndex, int beEatenIndex, int canEat, boolean eatable) {
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
