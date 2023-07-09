package arrays;

import java.util.Arrays;

public class FindFirstRepeatingElement {

    //Bruteforce approach
    public static int getFirstRepeatingElement(int[] arr, int n) {
        // step 1: compare each element to the rest of the array
        // step 2: If found, return index of that element
        for (int i = 0; i< n; i++) {
            for (int j = i+1; j< n; j++) {
                if (arr[i] == arr[j]) {
                    return i;
                }
            }
        }
        return -1;
    }

    //Sorting approach using Binary Search

   /*Copy the given array to an auxiliary array temp[] and sort temp array.
   Traverse the input array arr[] from 0 to N – 1.
    For every element, count its occurrences in temp[] using binary search.
    If the count of occurrence of current element is more than one, then return the current element.
    If no repeating element is found print “No Repeating Number Found”.
   */

    public static int getFirstRepeatedElementByBinarySearch(int[] arr, int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[i+1]) {
                return i;
            }
        }
        return -1;
    }





    public static void main(String[] args) {
        int[] arr = {10, 5, 4, 3, 5, 6};
        int n = arr.length;
        //System.out.println(getFirstRepeatingElement(arr,n));
        System.out.println(getFirstRepeatedElementByBinarySearch(arr,n));
    }


}
