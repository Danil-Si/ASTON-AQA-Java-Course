public class L3 {

    public static void main(String[] args) {
        // Пример вызова методов:
        System.out.println(isSumInRange(10, 5)); // true
        checkPositiveOrNegative(-5); // "Число отрицательное"
        System.out.println(isNegative(-5)); // true
        printStringMultipleTimes("Hello", 3); // "Hello" три раза
        System.out.println(isLeapYear(2024)); // true

        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertBinaryArray(binaryArray);
        System.out.println(java.util.Arrays.toString(binaryArray)); // Инвертированный массив

        int[] sequentialArray = fillSequentialArray(100);
        System.out.println(java.util.Arrays.toString(sequentialArray));

        int[] modifyArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyIfLessThanSix(modifyArray);
        System.out.println(java.util.Arrays.toString(modifyArray));

        int[][] squareArray = fillDiagonalsWithOnes(5);
        for (int[] row : squareArray) {
            System.out.println(java.util.Arrays.toString(row));
        }

        int[] initializedArray = createArray(5, 7);
        System.out.println(java.util.Arrays.toString(initializedArray));
    }

    // 1. Проверка суммы в диапазоне
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 2. Проверка числа положительное или отрицательное
    public static void checkPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // 3. Возврат true, если число отрицательное
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // 4. Печать строки указанное количество раз
    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    // 5. Проверка високосного года
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 6. Инверсия массива 0 и 1
    public static void invertBinaryArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 0 ? 1 : 0;
        }
    }

    // 7. Заполнение массива числами от 1 до 100
    public static int[] fillSequentialArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    // 8. Умножение чисел меньше 6 на 2
    public static void multiplyIfLessThanSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    // 9. Заполнение диагоналей единицами
    public static int[][] fillDiagonalsWithOnes(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i][i] = 1; // Главная диагональ
            array[i][size - i - 1] = 1; // Побочная диагональ
        }
        return array;
    }

    // 10. Создание массива с заданным значением
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
