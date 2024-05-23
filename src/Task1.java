public class Task1 {
    public static void main(String[] args) {
        int[] evenNumbers = new int[50]; // Масив для парних чисел
        int[] oddNumbers = new int[50]; // Масив для непарних чисел

        // Заповнюємо масив парними числами
        for (int i = 0; i < 50; i++) {
            evenNumbers[i] = (i + 1) * 2;
        }

        // Заповнюємо масив непарними числами
        for (int i = 0; i < 50; i++) {
            oddNumbers[i] = (i * 2) + 1;
        }

        // Виводимо масив парних чисел
        System.out.println("Парні числа:");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }

        // Виводимо перехід на новий рядок
        System.out.println();

        // Виводимо масив непарних чисел
        System.out.println("Непарні числа:");
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
    }
}