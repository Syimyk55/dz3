public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.2, -2.3, 3.4, -4.5, 5.6, -6.7, 7.8, -8.9, 9.0, -1.6, 4.9, -9.2, 7.6, -3.1, 0.5};
        double sum = 0;
        if (numbers.length > 0) {
            double sam = 0;

            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
                System.out.println(sum);
            }
            System.out.println("Среднее арифматическое число равно "+ sum/numbers.length);
            sum = sam / numbers.length;
        }
    }
}