package leetcode;

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.


public class moveZero {

    public static int[] moveZeroes(int[] nums) {
        int i = 0, j = 1;
        while (j < nums.length) {

            if (nums[i] == 0){
                if (nums[j] == 0){
                    j++;
                }
                else{
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    i++;
                }
                
            }
            else{
                i++;
                j++;
            }
        }
        return nums;
    }

    public static void print(int[] arr){

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int[] arr2 = moveZeroes(arr);
        print(arr2);
    }
}
