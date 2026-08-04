public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = { 2, 1, 9, 5, 3, 0 };
        int temp = 0;
        System.out.print("Before sort: ");
        for (int n : nums) {
            System.out.print(n);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        System.out.println();

        System.out.print("After sort: ");
        for (int n : nums) {
            System.out.print(n);
        }
    }
}