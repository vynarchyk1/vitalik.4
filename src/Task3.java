public class Task3 {
    public static void main(String[] args) {
        double[] array = {4.5, 8.2, 10.8, 3.1, 11.4}; // Приклад масиву

        // Обчислення суми елементів масиву
        double sum = 0;
        for (double value : array) {
            sum += value;
        }

        System.out.println("Сума елементів масиву: " + sum);
    }
}
