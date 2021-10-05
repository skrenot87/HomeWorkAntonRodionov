package HomeWorkApp6;

import HomeWorkApp6.animals.Animal;
import HomeWorkApp6.animals.Cat;
import HomeWorkApp6.animals.Dog;

public class MainApp {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Тузик"),
                new Cat("Рыжик"),
                new Cat("Дымок"),
                new Dog("Честер"),
                new Cat("Декстер"),
                new Dog("Бобик"),
                new Dog("Энзо"),
        };
        for (Animal a : animals) {
            a.run(130);
            a.swimming(260);
        }
        Cat.numberCat();
        Dog.numberDog();
        Animal.numberAnimals();
    }
}
