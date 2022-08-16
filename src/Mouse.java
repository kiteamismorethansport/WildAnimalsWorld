public class Mouse extends Herbivores{
    public static String unicodeOfAnimal = "\uD83D\uDC01";
    public static int eatIndex =8;
    public static int beEatenIndex = 8;
    public static String nameOfAnimal = "mouse";
    public static int weight = 1;
    public static int speed = 1;
    public static int canEat = 1;
    public static int bornWeight = 1;
    public Mouse(String unicodeOfAnimal, String nameOfAnimal, String sex, int bornWeight, int weight, int speed, int x, int y, boolean isVeg, int eatIndex, int beEatenIndex, int canEat, boolean eatable) {
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
