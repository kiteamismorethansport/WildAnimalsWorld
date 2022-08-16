public class Wolf extends Predator{
    public static String unicodeOfAnimal = "\uD83D\uDC3A";
    public static int eatIndex = 0;
    public static int beEatenIndex = 0;
    public static String nameOfAnimal = "wolf";
    public static int weight = 50;
    public static int speed = 3;
    public static int canEat = 8;
    public static int bornWeight = 50;
    public Wolf (String unicodeOfAnimal, String nameOfAnimal, String sex, int bornWeight, int weight, int speed, int x, int y, boolean isVeg, int eatIndex, int beEatenIndex, int canEat, boolean eatable) {
        super(unicodeOfAnimal, nameOfAnimal, sex,bornWeight, weight, speed, x, y, isVeg, eatIndex, beEatenIndex, canEat, eatable);
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
