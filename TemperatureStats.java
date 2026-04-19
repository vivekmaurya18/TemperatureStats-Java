public class TemperatureStats {
    public static void main(String[] args) {
        int[] temperatures = { 18, 21, 19, 25, 22, 20, 17 };

        int highest = temperatures[0];
        int lowest = temperatures[0];
        int sum = 0;

        // Loop through array
        for (int temp : temperatures) {
            if (temp > highest) {
                highest = temp;
            }
            if (temp < lowest) {
                lowest = temp;
            }
            sum += temp;
        }

        // Calculate average
        double average = (double) sum / temperatures.length;

        // Print results
        System.out.println("Highest temperature: " + highest);
        System.out.println("Lowest temperature: " + lowest);
        System.out.printf("Average temperature: %.2f", average);
    }
}
