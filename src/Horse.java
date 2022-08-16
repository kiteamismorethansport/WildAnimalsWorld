public class Horse extends Herbivores{
    public static String unicodeOfAnimal = "\uD83D\uDC0E";
    public static int eatIndex = 5;
    public static int beEatenIndex =5;
    public static String nameOfAnimal = "horse";
    public static int weight = 400;
    public static int speed = 4;
    public static int canEat = 60;
    public static int bornWeight = 400;
    public Horse(String unicodeOfAnimal, String nameOfAnimal, String sex, int bornWeight, int weight, int speed, int x, int y, boolean isVeg, int eatIndex, int beEatenIndex, int canEat, boolean eatable) {
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
