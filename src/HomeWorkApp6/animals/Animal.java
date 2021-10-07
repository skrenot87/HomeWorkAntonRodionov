package HomeWorkApp6.animals;

public class Animal {
    String name;
    static int animalsCounter = 0;


    public Animal(String name) {
        this.name = name;
        animalsCounter++;

    }

    public void run(int distance) {
    }

    public void swimming(int length) {
    }

    public static void numberAnimals() {
        System.out.println("Количесвто животных = " + animalsCounter);
    }
}


