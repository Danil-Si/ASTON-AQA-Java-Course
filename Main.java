package animals;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        Cat[] cats = {
                new Cat("Барсик"),
                new Cat("Мурзик"),
                new Cat("Васька")
        };

        Plate plate = new Plate(20);

        dog.run(400);
        dog.swim(5);

        System.out.println();

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        System.out.println();
        System.out.println(plate);

        System.out.println("\nОбщее количество животных: " + Animal.getAnimalCount());
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());
    }
}
