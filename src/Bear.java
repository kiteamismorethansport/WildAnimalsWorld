public class Bear extends Predator{
    public static String unicodeOfAnimal = "\uD83D\uDC3B";
    public static int eatIndex = 3;
    public static int beEatenIndex = 3;
    public static String nameOfAnimal = "bear";
    public static int weight = 500;
    public static int speed = 2;
    public static int canEat = 80;
    public static int bornWeight = 500;
    public Bear(String unicodeOfAnimal, String nameOfAnimal, String sex, int bornWeight, int weight, int speed, int x, int y, boolean isVeg, int eatIndex, int beEatenIndex, int canEat, boolean eatable) {
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
