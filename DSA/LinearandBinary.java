public class LinearandBinary {
    public static void main(String[] args) {
        int nums[] = {5,7,9,11,13};
        int target = 7;
        int result = BinarySearch(nums, target);
        System.out.println("Found target at index " + result);

    }
    // Linear Search
    public static int LinearSearch(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            if(target == nums[i]){
                return i;          
            }
        }
        return -1;
    }

    // Binary Search
    public static int BinarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length;
        
        while(left<=right){
            int mid = (left+right) /2;

            if(nums[mid] == target){
                return mid;
            }
            else if(target<nums[mid]){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return -1;
    }
}
