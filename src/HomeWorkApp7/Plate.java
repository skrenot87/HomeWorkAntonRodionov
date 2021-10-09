package HomeWorkApp7;

public class Plate {
    private int food;
    private int maxPlateVolume = 20;

    public int getMaxPlateVolume() {
        return maxPlateVolume;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }


    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        }else {
            fill();
        }
    }

    public void fill() {
        food = maxPlateVolume;
    }

    public Plate(int food) {
        this.food = food;
    }


    public void info() {

        System.out.printf("Plate [Food : %d ]\n", food);
    }


}
