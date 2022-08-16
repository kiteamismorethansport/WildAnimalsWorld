public class CaterPillar extends Herbivores {
    public static String unicodeOfAnimal = "\uD83D\uDC1B";
    public static int eatIndex = 14;
    public static int beEatenIndex =14;
    public static String nameOfAnimal = "caterpillar";
    public static int weight = 1;
    public static int speed = 0;
    public static int canEat = 0;
    public static int bornWeight = 1;
    public CaterPillar(String unicodeOfAnimal, String nameOfAnimal, String sex, int bornWeight, int weight, int speed, int x, int y, boolean isVeg, int eatIndex, int beEatenIndex, int canEat, boolean eatable) {
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
