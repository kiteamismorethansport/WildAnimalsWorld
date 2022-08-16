public class Eagle extends Predator{
    public static String unicodeOfAnimal = "\uD83E\uDD85";
    public static int eatIndex = 4;
    public static int beEatenIndex = 4;
    public static String nameOfAnimal = "eagle";
    public static int weight = 6;
    public static int speed = 3;
    public static int canEat = 1;
    public static int bornWeight = 6;
    public Eagle(String unicodeOfAnimal, String nameOfAnimal, String sex, int bornWeight, int weight, int speed, int x, int y, boolean isVeg, int eatIndex, int beEatenIndex, int canEat, boolean eatable) {
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
