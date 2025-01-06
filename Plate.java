package animals;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        food += amount;
        System.out.println("В тарелку добавлено " + amount + " единиц еды.");
    }

    public int getFood() {
        return food;
    }

    @Override
    public String toString() {
        return "В тарелке осталось " + food + " единиц еды.";
    }
}
