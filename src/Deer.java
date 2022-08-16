public class Deer extends Herbivores{
    public static String unicodeOfAnimal = "\uD83E\uDD8C";
    public static int eatIndex = 6;
    public static int beEatenIndex = 6;
    public static String nameOfAnimal = "deer";
    public static int weight = 300;
    public static int speed = 4;
    public static int canEat = 50;
    public static int bornWeight = 300;
    public Deer(String unicodeOfAnimal, String nameOfAnimal, String sex, int bornWeight, int weight, int speed, int x, int y, boolean isVeg, int eatIndex, int beEatenIndex, int canEat, boolean eatable) {
        super(unicodeOfAnimal, nameOfAnimal, sex, bornWeight, weight, speed, x, y, isVeg, eatIndex, beEatenIndex, canEat, eatable);
        this.unicodeOfAnimal = unicodeOfAnimal;
        this.eatIndex = eatIndex;
        this.beEatenIndex = beEatenIndex;
        this.nameOfAnimal = nameOfAnimal;
        this.weight = weight;
        this.speed = speed ;
        this.canEat = canEat ;
        this.bornWeight = bornWeight;
    }
}
