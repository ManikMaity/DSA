package Concepts;

public class mergeSort {
   
    public static int[] merge(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
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

       return result;
    }

    public static int[] mergeSortHelper(int[] arr, int start, int end){
        if (start == end){
            int[] result = new int[1];
            result [0] = arr[start];
            return result;
        }

        int mid = (start + end) / 2;
        int[] left = mergeSortHelper(arr, start, mid);
        int [] right = mergeSortHelper(arr, mid + 1, end);
        return merge(left, right);
    }

    public static int[] mergesort (int[] array){
      return  mergeSortHelper(array, 0, array.length - 1);
    }

    public static void printArr  (int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int [] arr = {5, 0, 2, 9, 4};
        printArr(mergesort(arr)); // 0 2 4 5 9 
    }
}
