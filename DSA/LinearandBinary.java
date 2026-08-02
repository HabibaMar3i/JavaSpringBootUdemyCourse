public class LinearandBinary {
    public static void main(String[] args) {
        // random array
        int nums[] = new int[1000];
        int target = 13;
        int result = linearSearch(nums, target);
        System.out.println("(Linear search) Found target at index " + result);
        result = binarySearch(nums, target);
        System.out.println("(Binary search) Found target at index " + result);

    }
    // Linear Search
    public static int linearSearch(int[] nums, int target){
        int steps = 0;
        for(int i=0; i<nums.length; i++){
            steps++;
            if(target == nums[i]){
                System.out.println("Linear search ended at: " + steps + " steps");
                return i;          
            }
        }
        System.out.println("Linear search ended at: " + steps + " steps");
        return -1;
    }

    // Binary Search
    public static int binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int steps = 0;
        while(left<=right){
            steps++;
            int mid = (left+right) /2;

            if(nums[mid] == target){
                System.out.println("Binary search ended at: " + steps + " steps");
                return mid;
            }
            else if(target<nums[mid]){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        System.out.println("Binary search ended at: " + steps + " steps");
        return -1;
    }
}
