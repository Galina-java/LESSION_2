public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        // Пример вызова метода и вывод результата
        int num1 = 8;
        int num2 = 5;
        boolean result = isSumInRange(num1, num2);
        System.out.println(result);
        isSumInRange(num1, num2);

// Пример вызова метода checkNumber и вывод результата
        int num = -3;
        checkNumber(num);

// Пример вызова метода isNegativeNumber и вывод результата
        int num7 = -3;
        boolean isNegative = isNegativeNumber(num7);
        System.out.println(isNegative);

        // Пример вызова метода printString
        String text = "Привет, мир!";
        int count = 1;
        printString(text, count);

        // Пример вызова метода isLeapYear и вывод результата
        int year = 2024;
        boolean isLeap = isLeapYear(year);
        System.out.println(year + " является високосным: " + isLeap);

        // Заданный printArray массив
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив: ");
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        System.out.println("Изменённый массив: ");
        printArray(array);

        // Создание пустого массива длиной 100 printArray1
        int[] array1 = new int[100];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }
        printArray1(array1);

        // Заданный массив  printArray2
        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив: ");
        printArray2(array2);
        for (int i = 0; i < array.length; i++) {
            if (array2[i] < 6) {
                array2[i] *= 2;
            }
        }
        System.out.println("Изменённый массив: ");
        printArray2(array2);
        // Задаём размер квадратного массива printArray3
        int size = 5;
        int[][] array3 = new int[size][size];

        for (int i = 0; i < size; i++) {
            array3[i][i] = 1;
        }
        printArray3(array3);
        // Пример вызова метода printArray4
        int len = 5;
        int initialValue = 3;
        int[] resultArray = createArray(len, initialValue);

        // Вывод результата
        printArray4(resultArray);
    }


    // Метод для печати трёх слов в столбец
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Метод для проверки суммы двух переменных
    public static void checkSumSign() {
        int a = 5;
        int b = 3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Метод для печати цвета в зависимости от значения переменной value
    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 3;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a < b");
        }
    }

    // Метод для проверки, лежит ли сумма двух чисел в пределах от 10 до 20 (включительно)
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // Метод для проверки, положительное ли число или отрицательное
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    // Метод для проверки, является ли число отрицательным
    public static boolean isNegativeNumber(int number) {
        return number < 0;
    }

    //Метод для печати строки указанное количество раз
    public static void printString(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    // Метод для определения, является ли год високосным
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Метод для печати массива
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Метод для печати массива
    public static void printArray1(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
    }

    // Метод для печати массива
    public static void printArray2(int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
    }

    // Метод для печати двумерного массива
    public static void printArray3(int[][] array3) {
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Метод, создающий массив заданной длины и заполняющий его заданным значением
    public static int[] createArray(int len, int initialValue) {
        int[] array4 = new int[len];
        for (int i = 0; i < len; i++) {
            array4[i] = initialValue;
        }
        return array4;
    }

    public static void printArray4(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

