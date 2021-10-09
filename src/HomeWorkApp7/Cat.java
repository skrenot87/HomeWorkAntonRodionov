package HomeWorkApp7;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public int getAppetite() {

        return appetite;
    }

    public Cat(String name) {
        this.name = name;
        this.appetite = 5;
        this.hungry = false;
    }

    public void eat(Plate plate) {
        if (appetite <= plate.getFood()) {
            plate.decreaseFood(appetite);
            hungry = true;
        } else {
            hungry = false;
            plate.decreaseFood(appetite);
            System.out.println(name + " остался голодным");
        }

    }

    public void info() {
        System.out.println(name + " " + hungry);
    }
}
