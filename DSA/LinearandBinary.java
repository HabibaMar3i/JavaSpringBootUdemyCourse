public class LinearandBinary {
    public static void main(String[] args) {
        int nums[] = {5,7,9,11,13};
        int target = 13;
        int result = LinearSearch(nums, target);
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
}
