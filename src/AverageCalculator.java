
    public class AverageCalculator {
        public static void main(String args[]) {
            int[] numbers = {10, 20, 30, 40, 50};
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            double average = (double) sum / numbers.length;
            System.out.println("The average is: " + average);
        }
    }


