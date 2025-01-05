
public class Main {
    public static void main(String[] args) {
        // Создание массива сотрудников
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван", "Инженер", "ivanov@mail.com", "892312312", 50000, 30);
        employees[1] = new Employee("Петров Петр", "Менеджер", "petrov@mail.com", "892345678", 60000, 45);
        employees[2] = new Employee("Сидоров Алексей", "Аналитик", "sidorov@mail.com", "891234567", 55000, 50);
        employees[3] = new Employee("Кузнецова Анна", "Программист", "kuznetsova@mail.com", "898765432", 70000, 25);
        employees[4] = new Employee("Михайлова Мария", "Дизайнер", "mikhailova@mail.com", "891276543", 65000, 42);

        // Вывод информации о сотрудниках старше 40 лет
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }
}



