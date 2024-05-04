package leetcode;

import java.util.Arrays;

class containDuplicate {

    // This works but in one case lime limit excede -
    // public static boolean containsDuplicate(int[] nums) {
    //     for (int i = 0; i < nums.length - 1; i++){
    //         for(int j = i +1; j < nums.length; j++){
    //             if (nums[i] == nums[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    public static void printArray (int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    // Another way - 
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if (nums[i] == nums[i +1]){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean haveDuplicate = containsDuplicate(nums);
        System.out.print(haveDuplicate); //true
    }
}
