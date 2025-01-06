package animals;

public abstract class Animal {
    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;
    private static int animalCount = 0;

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalCount++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public static int getAnimalCount() {
        return animalCount;
    }
}
