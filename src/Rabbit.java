public class Rabbit extends Herbivores{
    public static String unicodeOfAnimal = "\uD83D\uDC07";
    public static int eatIndex = 7;
    public static int beEatenIndex = 7;
    public static String nameOfAnimal = "rabbit";
    public static int weight = 2;
    public static int speed = 2;
    public static int canEat = 1;
    public static int bornWeight = 2;
    public Rabbit(String unicodeOfAnimal, String nameOfAnimal, String sex, int bornWeight, int weight, int speed, int x, int y, boolean isVeg, int eatIndex, int beEatenIndex, int canEat, boolean eatable) {
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
