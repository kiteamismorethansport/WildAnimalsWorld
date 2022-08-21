import java.io.IOException;
import java.text.RuleBasedCollator;
import java.time.Duration;
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

        System.out.println();
        System.out.println("          !!!WELCOME TO THE ANIMALSWORLD SIMULATION!!!");
        System.out.println();
        System.out.println("IN THIS SIMULATION YOU HAVE 15 TYPES OF ANIMALS AND 1 TYPE OF PLANTS,\nALL OF THEM INTERACT WITH EACH OTHER, MOVE, EAT, MULTIPLY AND DIE.");
        System.out.println();
        System.out.println("CHOOSE, HOW MANY ANIMALS OF EACH TYPE, SHOULD BE IN SIMULATION?");
        System.out.println();
        System.out.println("ENTER THE NUMBER FROM 1 to 100: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("YOUR TOTAL NUMBER OF ANIMALS IS: " + (a *16));
        System.out.println();
        System.out.println("ENTER TIME IN SECONDS, FOR HOW LONG YOU WANT SIMULATION TO LAST: ");
        int b = scan.nextInt();
        System.out.println("");
        System.out.println("THANK YOU, SIMULATION STARTED!");
        System.out.println("_______________________________________________________________________________________________________________________________________________________________________________");
           Runnable task1 = () -> {
               for (int i = 0; i < a; i++) {
                   animals.add(new Wolf(Wolf.unicodeOfAnimal, Wolf.nameOfAnimal, Animal.sex(), Wolf.bornWeight, Wolf.weight, Wolf.speed, (int) (Math.random() * 100), (int) (Math.random() * 20), Predator.isVeg, Wolf.eatIndex, Wolf.beEatenIndex, Wolf.canEat, Animal.eatable));
                   animals.add(new Sheep(Sheep.unicodeOfAnimal, Sheep.nameOfAnimal, Animal.sex(), Sheep.bornWeight, Sheep.weight, Sheep.speed, (int) (Math.random() * 100), (int) (Math.random() * 20), Herbivores.isVeg, Sheep.eatIndex, Sheep.beEatenIndex, Sheep.canEat, Animal.eatable));
                   animals.add(new Snake(Snake.unicodeOfAnimal, Snake.nameOfAnimal, Animal.sex(), Snake.bornWeight, Snake.weight, Snake.speed, (int) (Math.random() * 100), (int) (Math.random() * 20), Predator.isVeg, Snake.eatIndex, Snake.beEatenIndex, Snake.canEat, Animal.eatable));
                   animals.add(new Bear(Bear.unicodeOfAnimal, Bear.nameOfAnimal, Animal.sex(), Bear.bornWeight, Bear.weight, Bear.speed, (int) (Math.random() * 100), (int) (Math.random() * 20), Predator.isVeg, Bear.eatIndex, Bear.beEatenIndex, Bear.canEat, Animal.eatable));
                   animals.add(new Boar(Boar.unicodeOfAnimal, Boar.nameOfAnimal, Animal.sex(), Boar.bornWeight, Boar.weight, Boar.speed, (int) (Math.random() * 100), (int) (Math.random() * 20), Herbivores.isVeg, Boar.eatIndex, Boar.beEatenIndex, Boar.canEat, Animal.eatable));
                   animals.add(new Buffalo(Buffalo.unicodeOfAnimal, Buffalo.nameOfAnimal, Animal.sex(), Buffalo.bornWeight, Buffalo.weight, Buffalo.speed, (int) (Math.random() * 100), (int) (Math.random() * 20), Herbivores.isVeg, Buffalo.eatIndex, Buffalo.beEatenIndex, Buffalo.canEat, Animal.eatable));
                   animals.add(new CaterPillar(CaterPillar.unicodeOfAnimal, CaterPillar.nameOfAnimal, Animal.sex(), CaterPillar.bornWeight, CaterPillar.weight, CaterPillar.speed, (int) (Math.random() * 100), (int) (Math.random() * 20), Herbivores.isVeg, CaterPillar.eatIndex, CaterPillar.beEatenIndex, CaterPillar.canEat, Animal.eatable));
                   animals.add(new Deer(Deer.unicodeOfAnimal, Deer.nameOfAnimal, Animal.sex(), Deer.bornWeight, Deer.weight, Deer.speed, (int) (Math.random() * 100), (int) (Math.random() * 20), Herbivores.isVeg, Deer.eatIndex, Deer.beEatenIndex, Deer.canEat, Animal.eatable));
                   animals.add(new Duck(Duck.unicodeOfAnimal, Duck.nameOfAnimal, Animal.sex(), Duck.bornWeight, Duck.weight, Duck.speed, (int) (Math.random() * 100), (int) (Math.random() * 20), Herbivores.isVeg, Duck.eatIndex, Duck.beEatenIndex, Duck.canEat, Animal.eatable));
                   animals.add(new Fox(Fox.unicodeOfAnimal, Fox.nameOfAnimal, Animal.sex(), Fox.bornWeight, Fox.weight, Fox.speed, (int) (Math.random() * 100), (int) (Math.random() * 20), Predator.isVeg, Fox.eatIndex, Fox.beEatenIndex, Fox.canEat, Animal.eatable));
                   animals.add(new Eagle(Eagle.unicodeOfAnimal, Eagle.nameOfAnimal, Animal.sex(), Eagle.bornWeight, Eagle.weight, Eagle.speed, (int) (Math.random() * 100), (int) (Math.random() * 20), Predator.isVeg, Eagle.eatIndex, Eagle.beEatenIndex, Eagle.canEat, Animal.eatable));
                   animals.add(new Horse(Horse.unicodeOfAnimal, Horse.nameOfAnimal, Animal.sex(), Horse.bornWeight, Horse.weight, Horse.speed, (int) (Math.random() * 100), (int) (Math.random() * 20), Herbivores.isVeg, Horse.eatIndex, Horse.beEatenIndex, Horse.canEat, Animal.eatable));
                   animals.add(new Mouse(Mouse.unicodeOfAnimal, Mouse.nameOfAnimal, Animal.sex(), Mouse.bornWeight, Mouse.weight, Mouse.speed, (int) (Math.random() * 100), (int) (Math.random() * 20), Herbivores.isVeg, Mouse.eatIndex, Mouse.beEatenIndex, Mouse.canEat, Animal.eatable));
                   animals.add(new Rabbit(Rabbit.unicodeOfAnimal, Rabbit.nameOfAnimal, Rabbit.sex(), Rabbit.bornWeight, Rabbit.weight, Rabbit.speed, (int) (Math.random() * 100), (int) (Math.random() * 20), Herbivores.isVeg, Rabbit.eatIndex, Rabbit.beEatenIndex, Rabbit.canEat, Animal.eatable));
                   animals.add(new Sheep(Sheep.unicodeOfAnimal, Sheep.nameOfAnimal, Animal.sex(), Sheep.bornWeight, Sheep.weight, Sheep.speed, (int) (Math.random() * 100), (int) (Math.random() * 20), Herbivores.isVeg, Sheep.eatIndex, Sheep.beEatenIndex, Sheep.canEat, Animal.eatable));
                   plants.add(new Plants(Plants.unicodeOfPlants, Plants.bornWeight, Plants.weight, (int) (Math.random() * 100), (int) (Math.random() * 20), true));
                   Plants.plantsMultiply(plants);
               }
           };

           Runnable task2 = () -> {
               Animal.move(animals);
           };


           Runnable task3 = () -> {
               Animal.eat(animals, plants);
               Plants.beEaten(plants);
               Animal.multiply(animals);
               Animal.die(animals);
           };

           Runnable task4 = () -> {
               Plants.plantsMultiply(plants);
               Graphics.graphicsErase();
           };

           Runnable task5 = () -> {

               System.out.println("_____________________________________________________________________________________________________________________________________________________________________");
               System.out.println("STATISTICS: ");
               Statistics.statistics(animals, plants);
               System.out.println("_____________________________________________________________________________________________________________________________________________________________________");
           };
        Runnable task6 = () -> {
            Graphics.graphics(animals, plants);
        };
           Runnable task7 = () -> {
               System.out.println("_____________________________________________________________________________________________________________________________________________________________________");
               System.out.println("STATISTICS: ");
               Statistics.statistics(animals, plants);
               Graphics.graphics(animals, plants);
               System.out.println("_____________________________________________________________________________________________________________________________________________________________________");
               System.out.println("THANK YOU, SIMULTATION HAS FINISHED!");
           };


           ScheduledExecutorService exec = Executors.newScheduledThreadPool(1000);
          exec.execute(task1);
          exec.scheduleWithFixedDelay(task2, 1, 6, TimeUnit.SECONDS);
          exec.scheduleWithFixedDelay(task3, 2, 6, TimeUnit.SECONDS);
          exec.scheduleWithFixedDelay(task4, 3, 6, TimeUnit.SECONDS);
          exec.scheduleWithFixedDelay(task5,4 ,6 , TimeUnit.SECONDS);
          exec.scheduleWithFixedDelay(task6,5,6, TimeUnit.SECONDS);
           TimeUnit.SECONDS.sleep(b);
           exec.execute(task7);
           exec.shutdown();
       }

    }

