public class Exercise {
    public static void main(String[] args) {

        // TODO: Declare and initialize an integer array with the values 45, 22, 89, 16,
        // 90, and 33

        // TODO: Initialize min and max with the first element

        // TODO: Use an enhanced for loop to find min and max

        // TODO: Print the smallest and largest numbers
        int[] numbers = { 45, 22, 89, 16, 90, 33 };
        int min = numbers[0];
        int max = numbers[0];

        for (int n : numbers) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}
