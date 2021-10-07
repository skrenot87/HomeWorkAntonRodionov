package HomeWorkApp6.animals;

public class Cat extends Animal {
    static int catCounter = 0;
    public Cat(String name) {
        super(name);
        catCounter++;
    }
    static int MAX_DISTANCE = 200;

    @Override
    public void run(int distance) {
        if (distance <= MAX_DISTANCE) {
            System.out.println(name + " пробежал " + distance + "m");
        } else {
            System.out.println(name + " не может стлько пробежать");
        }
    }

    @Override
    public void swimming(int length) {
        System.out.println(name + " не умеет плавать, он же кот");
    }
    public static void numberCat(){
        System.out.println("Количество котов = " + catCounter);
    }
}
