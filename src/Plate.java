public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void takeFood(int food) {
        this.food -= food;
    }

    public void addFood(int food) {
        this.food += food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}