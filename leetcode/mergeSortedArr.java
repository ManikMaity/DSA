package leetcode;

public class mergeSortedArr {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
        printArr(nums1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;

        int [] result = new int[m + n];

        // Merge the two arrays
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                result[k] = nums1[i];
                i++;
            } else {
                result[k] = nums2[j];
                j++;
            }
            k++;
        }

        // If nums1 is completed and nums2 still has elements
        while (j < n) {
            result[k] = nums2[j];
            j++;
            k++;
        }

        // If nums2 is completed and nums1 still has elements
        while (i < m) {
            result[k] = nums1[i];
            i++;
            k++;
        }

        // Copy elements from result back to nums1
        for (k = 0; k < m + n; k++) {
            nums1[k] = result[k];
        }
    }

    public static void printArr  (int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}