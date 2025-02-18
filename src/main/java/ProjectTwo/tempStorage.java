package ProjectTwo;

public class tempStorage {
    public static void main(String[] args) {

        int[] temperatures = {72, 75, 79, 83, 78, 74, 71};


        int highest = temperatures[0];
        int lowest = temperatures[0];


        for (int temp : temperatures) {
            if (temp > highest) {
                highest = temp;
            }
            if (temp < lowest) {
                lowest = temp;
            }
        }


        System.out.println("Highest Temperature of the Week: " + highest + "°F");
        System.out.println("Lowest Temperature of the Week: " + lowest + "°F");
    }
}

