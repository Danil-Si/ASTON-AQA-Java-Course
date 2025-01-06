package animals;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean isSatiated = false;

    public Cat(String name) {
        super(name, 200, 0);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public boolean eat(Plate plate) {
        if (plate.decreaseFood(10)) {
            isSatiated = true;
            System.out.println(name + " покушал и теперь сыт.");
        } else {
            System.out.println(name + " не смог покушать — в тарелке недостаточно еды.");
        }
        return isSatiated;
    }

    public boolean isSatiated() {
        return isSatiated;
    }

    public static int getCatCount() {
        return catCount;
    }
}
