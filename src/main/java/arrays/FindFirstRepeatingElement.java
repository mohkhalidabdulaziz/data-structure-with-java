package arrays;

public class FindFirstRepeatingElement {

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

    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        int n = arr.length;
        System.out.println(getFirstRepeatingElement(arr,n));
    }


}
