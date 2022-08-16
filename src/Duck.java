public class Duck extends Herbivores{
    public static String unicodeOfAnimal = "\uD83E\uDD86";
    public static int eatIndex = 13;
    public static int beEatenIndex =13;
    public static String nameOfAnimal = "duck";
    public static int weight = 1;
    public static int speed = 4;
    public static int canEat = 1;
    public static int bornWeight = 1;
    public Duck(String unicodeOfAnimal, String nameOfAnimal, String sex, int bornWeight, int weight, int speed, int x, int y, boolean isVeg, int eatIndex, int beEatenIndex, int canEat, boolean eatable) {
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
