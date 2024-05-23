public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {2, 17, 6, 13, 22, 31, 66, 45, 100, -19};

        // Перебираємо масив циклом while
        System.out.println("Перебираємо масив циклом while:");
        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();

        // Перебираємо масив циклом for
        System.out.println("Перебираємо масив циклом for:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Перебираємо масив циклом while і виводимо числа з непарним індексом
        System.out.println("Виводимо числа з непарним індексом циклом while:");
        i = 1;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i += 2;
        }
        System.out.println();

        // Перебираємо масив циклом for і виводимо числа з парним індексом
        System.out.println("Виводимо числа з парним індексом циклом for:");
        for (int j = 0; j < numbers.length; j += 2) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println();

        // Виводимо масив в зворотньому порядку
        System.out.println("Масив в зворотньому порядку:");
        for (int k = numbers.length - 1; k >= 0; k--) {
            System.out.print(numbers[k] + " ");
        }
        System.out.println();
    }
}