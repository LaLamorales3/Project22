package ProjectTwo;

public class maxMinNumberArray {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 2, 67, 34, 89, 23, 1, 90};

        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}

