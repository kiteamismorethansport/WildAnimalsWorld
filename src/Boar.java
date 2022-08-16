public class Boar extends Herbivores{
    public static String unicodeOfAnimal = "\uD83D\uDC17";
    public static int eatIndex = 11;
    public static int beEatenIndex =11;
    public static String nameOfAnimal = "boar";
    public static int weight = 400;
    public static int speed = 2;
    public static int canEat = 50;
    public static int bornWeight = 400;
    public Boar(String unicodeOfAnimal, String nameOfAnimal, String sex, int bornWeight, int weight, int speed, int x, int y, boolean isVeg, int eatIndex, int beEatenIndex, int canEat, boolean eatable) {
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
