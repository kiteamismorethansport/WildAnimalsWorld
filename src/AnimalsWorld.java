import java.io.IOException;
import java.text.RuleBasedCollator;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AnimalsWorld {

    public static ArrayList<Animal> animals = new ArrayList<>();
    public static ArrayList<Plants> plants = new ArrayList<>();



    public static void main(String[] args) throws ExecutionException, InterruptedException, IOException {
        System.out.println("!!!WELCOME TO THE ANIMALSWORLD SIMULATION!!!");
        System.out.println();
        System.out.println("CHOOSE, HOW MANY ANIMALS SHOULD BE IN SIMULATION?");
        System.out.println();
        System.out.println("ENTER THE NUMBER FROM 1 to 100: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("YOUR NUMBER OF ANIMALS IS: " + a);
        System.out.println("THANK YOU, SIMULATION STARTED!");
        System.out.println("_______________________________________________________________________________________________________________________________________________________________________________");
           Runnable task1 = () -> {
               for (int i = 0; i < a; i++) {
                   animals.add(new Wolf(Wolf.unicodeOfAnimal, Wolf.nameOfAnimal, Animal.sex(), Wolf.bornWeight, Wolf.weight, Wolf.speed, (int) (Math.random() * 20), (int) (Math.random() * 100), Predator.isVeg, Wolf.eatIndex, Wolf.beEatenIndex, Wolf.canEat, Animal.eatable));
                   animals.add(new Sheep(Sheep.unicodeOfAnimal, Sheep.nameOfAnimal, Animal.sex(), Sheep.bornWeight, Sheep.weight, Sheep.speed, (int) (Math.random() * 20), (int) (Math.random() * 100), Herbivores.isVeg, Sheep.eatIndex, Sheep.beEatenIndex, Sheep.canEat, Animal.eatable));
                   animals.add(new Snake(Snake.unicodeOfAnimal, Snake.nameOfAnimal, Animal.sex(), Snake.bornWeight, Snake.weight, Snake.speed, (int) (Math.random() * 20), (int) (Math.random() * 100), Predator.isVeg, Snake.eatIndex, Snake.beEatenIndex, Snake.canEat, Animal.eatable));
                   animals.add(new Bear(Bear.unicodeOfAnimal, Bear.nameOfAnimal, Animal.sex(), Bear.bornWeight, Bear.weight, Bear.speed, (int) (Math.random() * 20), (int) (Math.random() * 100), Predator.isVeg, Bear.eatIndex, Bear.beEatenIndex, Bear.canEat, Animal.eatable));
                   animals.add(new Boar(Boar.unicodeOfAnimal, Boar.nameOfAnimal, Animal.sex(), Boar.bornWeight, Boar.weight, Boar.speed, (int) (Math.random() * 20), (int) (Math.random() * 100), Herbivores.isVeg, Boar.eatIndex, Boar.beEatenIndex, Boar.canEat, Animal.eatable));
                   animals.add(new Buffalo(Buffalo.unicodeOfAnimal, Buffalo.nameOfAnimal, Animal.sex(), Buffalo.bornWeight, Buffalo.weight, Buffalo.speed, (int) (Math.random() * 20), (int) (Math.random() * 100), Herbivores.isVeg, Buffalo.eatIndex, Buffalo.beEatenIndex, Buffalo.canEat, Animal.eatable));
                   animals.add(new CaterPillar(CaterPillar.unicodeOfAnimal, CaterPillar.nameOfAnimal, Animal.sex(), CaterPillar.bornWeight, CaterPillar.weight, CaterPillar.speed, (int) (Math.random() * 20), (int) (Math.random() * 100), Herbivores.isVeg, CaterPillar.eatIndex, CaterPillar.beEatenIndex, CaterPillar.canEat, Animal.eatable));
                   animals.add(new Deer(Deer.unicodeOfAnimal, Deer.nameOfAnimal, Animal.sex(), Deer.bornWeight, Deer.weight, Deer.speed, (int) (Math.random() * 20), (int) (Math.random() * 100), Herbivores.isVeg, Deer.eatIndex, Deer.beEatenIndex, Deer.canEat, Animal.eatable));
                   animals.add(new Duck(Duck.unicodeOfAnimal, Duck.nameOfAnimal, Animal.sex(), Duck.bornWeight, Duck.weight, Duck.speed, (int) (Math.random() * 20), (int) (Math.random() * 100), Herbivores.isVeg, Duck.eatIndex, Duck.beEatenIndex, Duck.canEat, Animal.eatable));
                   animals.add(new Fox(Fox.unicodeOfAnimal, Fox.nameOfAnimal, Animal.sex(), Fox.bornWeight, Fox.weight, Fox.speed, (int) (Math.random() * 20), (int) (Math.random() * 100), Predator.isVeg, Fox.eatIndex, Fox.beEatenIndex, Fox.canEat, Animal.eatable));
                   animals.add(new Eagle(Eagle.unicodeOfAnimal, Eagle.nameOfAnimal, Animal.sex(), Eagle.bornWeight, Eagle.weight, Eagle.speed, (int) (Math.random() * 20), (int) (Math.random() * 100), Predator.isVeg, Eagle.eatIndex, Eagle.beEatenIndex, Eagle.canEat, Animal.eatable));
                   animals.add(new Horse(Horse.unicodeOfAnimal, Horse.nameOfAnimal, Animal.sex(), Horse.bornWeight, Horse.weight, Horse.speed, (int) (Math.random() * 20), (int) (Math.random() * 100), Herbivores.isVeg, Horse.eatIndex, Horse.beEatenIndex, Horse.canEat, Animal.eatable));
                   animals.add(new Mouse(Mouse.unicodeOfAnimal, Mouse.nameOfAnimal, Animal.sex(), Mouse.bornWeight, Mouse.weight, Mouse.speed, (int) (Math.random() * 20), (int) (Math.random() * 100), Herbivores.isVeg, Mouse.eatIndex, Mouse.beEatenIndex, Mouse.canEat, Animal.eatable));
                   animals.add(new Rabbit(Rabbit.unicodeOfAnimal, Rabbit.nameOfAnimal, Rabbit.sex(), Rabbit.bornWeight, Rabbit.weight, Rabbit.speed, (int) (Math.random() * 20), (int) (Math.random() * 100), Herbivores.isVeg, Rabbit.eatIndex, Rabbit.beEatenIndex, Rabbit.canEat, Animal.eatable));
                   animals.add(new Sheep(Sheep.unicodeOfAnimal, Sheep.nameOfAnimal, Animal.sex(), Sheep.bornWeight, Sheep.weight, Sheep.speed, (int) (Math.random() * 20), (int) (Math.random() * 100), Herbivores.isVeg, Sheep.eatIndex, Sheep.beEatenIndex, Sheep.canEat, Animal.eatable));
                   plants.add(new Plants(Plants.bornWeight, Plants.weight, (int) (Math.random() * 20), (int) (Math.random() * 100), true));
               }
           };

           Runnable task2 = () -> {
               Animal.move(animals);
               System.out.println("ANIMALS MOVE");
           };


           Runnable task3 = () -> {
               Animal.eat(animals, plants);
               Animal.multiply(animals);
               Animal.die(animals);

               System.out.println("ANIMALS EAT");
               System.out.println("ANIMALS MULTIPLY");
               System.out.println("ANIMALS DIE");

           };
           Runnable task4 = () -> {
               Plants.plantsMultiply(plants);
               Plants.beEaten(plants);
               System.out.println("PLANTS MULTIPLY");
           };

           Runnable task5 = () -> {
               System.out.println("_____________________________________________________________________________________________________________________________________________________________________");
               System.out.println("STATISTICS: ");
               Statistics.statistics(animals, plants);

           };
           Runnable task6 = () -> {
               System.out.println("STATISTICS: ");
               Statistics.statistics(animals, plants);
               System.out.println("THANK YOU, SIMULTATION HAS FINISHED!");
           };


           ScheduledExecutorService exec = Executors.newScheduledThreadPool(50);
           exec.execute(task1);
           exec.scheduleAtFixedRate(task2, 1, 4, TimeUnit.SECONDS);
           exec.scheduleAtFixedRate(task3, 3, 6, TimeUnit.SECONDS);
           exec.scheduleAtFixedRate(task4, 3, 6, TimeUnit.SECONDS);
           Thread.sleep(10000);
           exec.scheduleAtFixedRate(task5, 7, 12, TimeUnit.SECONDS);

           Thread.sleep(50000);
           exec.execute(task6);
           exec.shutdown();
       }

    }

