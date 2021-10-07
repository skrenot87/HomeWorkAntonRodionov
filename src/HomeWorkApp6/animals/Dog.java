package HomeWorkApp6.animals;

public class Dog extends Animal {
    static int dogCounter = 0;

    public Dog(String name) {
        super(name);
        dogCounter++;
    }

    int MAX_DISTANCE = 500;
    int MAX_LENGTH = 10;

    @Override
    public void run(int distance) {
        if (distance <= MAX_DISTANCE) {
            System.out.println(name + " пробежал " + distance + "m");
        } else {
            System.out.println(name + " не может пробежать расстояние " + distance + "ь");
        }
    }

    @Override
    public void swimming(int length) {
        if (length <= MAX_LENGTH) {
            System.out.println(name + "" + length + "m");
        } else {
            System.out.println(name + " не может проплыть " + length + "m");
        }
    }

    public static void numberDog() {
        System.out.println("Количество собак = " + dogCounter);
    }
}
