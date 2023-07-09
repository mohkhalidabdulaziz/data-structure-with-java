package arrays;

public class ArraysTestRuner {
    public static void main(String[] args) {
            int[] arr = {10, 5, 4, 3, 5, 6};
            int n = arr.length;
        ArraysImpl findFirstRepeatingNumber = new ArraysImpl();
        findFirstRepeatingNumber.findFirstRepeatingElementByBruteforce(arr,n);
        findFirstRepeatingNumber.findFirstRepeatingElementByHMap(arr,n);
        findFirstRepeatingNumber.findFirstRepeatingElementBySorting(arr,n);

    }

}
