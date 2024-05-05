
public class maximumSubarray {

    // public static int maxSubArray(int[] nums) {
    //     int maxSubArrayNum = nums[0];
    //     for (int i = 0; i < nums.length - 1; i++){
    //         if (nums[i] < 1){
    //             continue;
    //         }
    //         else {
    //             int sum = nums[i];
    //             for (int j = i + 1; j < nums.length; j++){
    //                sum += nums[j];
    //                if (sum > maxSubArrayNum){
    //                 maxSubArrayNum = sum;
    //                }
    //             }
    //         }
    //     }

    //     return maxSubArrayNum;
    // }
// Kadane's algo
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = 0;

        for (int i = 0; i < nums.length; i++){
            curSum += nums[i];

            if (curSum > maxSum){
                maxSum = curSum;
            }

            if (curSum < 0){
                curSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSubArrSum = maxSubArray(nums);
        System.out.print(maxSubArrSum);
    }
}