package ProjectTwo;

public class StoreEvenOddNumbers {
    public static void main(String[] args) {

        int[][] numbers = {
                {10, 15, 22},
                {33, 40, 55},
                {60, 75, 88}
        };

        System.out.println("Even numbers in the 2D array:");


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j] + " ");
                }
            }
        }
    }
}
