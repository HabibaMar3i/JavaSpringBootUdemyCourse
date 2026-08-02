public class LinearandBinary {
    public static void main(String[] args) {
        // random array
        int nums[] = {1, 2, 3, 5, 9, 13, 15, 18};
        int target = 13;
        int result = linearSearch(nums, target);
        System.out.println("(Linear search) Found target at index " + result);
        int result2 = binarySearch(nums, target);
        System.out.println("(Binary search) Found target at index " + result2);
        int left = 0;
        int right = nums.length - 1;
        int result3 = binaryRecusriveSearch(nums, target, left, right);
        System.out.println("(Recursive Binary search) Found target at index " + result3);
    }

    // Linear Search
    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (target == nums[i]) {
                System.out.println("Linear search ended at: " + steps + " steps");
                return i;
            }
        }
        System.out.println("Linear search ended at: " + steps + " steps");
        return -1;
    }

    // Binary Search
    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int steps = 0;
        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                System.out.println("Binary search ended at: " + steps + " steps");
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Binary search ended at: " + steps + " steps");
        return -1;
    }

    // Binary Recursive Search
    public static int binaryRecusriveSearch(int[] nums, int target, int left, int right) {
        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (target < nums[mid]) {
            return binaryRecusriveSearch(nums, target, left, mid-1);
        } else {
            return binaryRecusriveSearch(nums, target, mid+1, right);
        }
    }
}
