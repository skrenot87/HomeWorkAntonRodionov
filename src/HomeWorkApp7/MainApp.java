package HomeWorkApp7;

public class MainApp {
    public static void main(String[] args) {
        Cat[] cat = {
                new Cat("Дымок"),
                new Cat("Мурзик"),
                new Cat("Барсик"),
                new Cat("Декстер"),
                new Cat("Рыжик"),
                new Cat("Рыжик"),
                new Cat("Рыжик"),
        };

        Plate plate = new Plate(20);
        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            cat[i].info();
            plate.info();
        }
    }
}
