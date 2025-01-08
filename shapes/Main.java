package shapes;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Красный", "Черный");
        Shape rectangle = new Rectangle(4, 6, "Синий", "Зеленый");
        Shape triangle = new Triangle(3, 4, 5, "Желтый", "Фиолетовый");

        System.out.println("Информация о круге:");
        circle.printInfo();

        System.out.println("\nИнформация о прямоугольнике:");
        rectangle.printInfo();

        System.out.println("\nИнформация о треугольнике:");
        triangle.printInfo();
    }
}
