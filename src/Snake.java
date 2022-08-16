public class Snake extends Predator {
    public static String unicodeOfAnimal = "\uD83D\uDC0D";
    public static int eatIndex = 1;
    public static int beEatenIndex = 1;
    public static String nameOfAnimal = "snake";
    public static int weight = 15;
    public static int speed = 1;
    public static int canEat = 3;
    public static int bornWeight = 15;
    public Snake(String unicodeOfAnimal, String nameOfAnimal, String sex, int bornWeight, int weight, int speed, int x, int y, boolean isVeg, int eatIndex, int beEatenIndex, int canEat, boolean eatable) {
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
