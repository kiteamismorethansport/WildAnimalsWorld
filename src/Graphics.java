
public class Graphics {
    public static String[][] graphics = new String[20][100];
    public static void graphics() {

        for (int i = 0; i < 20; i++) {
            for (int k = 0; k < 100; k++) {
                graphics [i][k] = "-";
            }
        }
        for (int i = 0; i<AnimalsWorld.animals.size(); i ++){
            graphics [AnimalsWorld.animals.get(i).x][AnimalsWorld.animals.get(i).y] = AnimalsWorld.animals.get(i).unicodeOfAnimal;
        }
        for (int i = 0; i < 20; i++) {
            for (int k = 0; k < 100; k++) {
                System.out.print(graphics [i][k]);
            }
            System.out.println();
        }
    }


}

