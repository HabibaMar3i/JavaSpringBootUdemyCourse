public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = { 2, 1, 9, 5, 3, 0 };
        int temp = 0;
        int minIndex = -1;
        System.out.print("Before sort: ");
        for (int n : nums) {
            System.out.print(n);
        }

        for (int i = 0; i < nums.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        System.out.println();

        System.out.print("After sort: ");
        for (int n : nums) {
            System.out.print(n);
        }
    }
}