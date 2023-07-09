package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraysImpl implements ArrayInterface {
   /* Time Complexity: O(N)

    Reason: Entire array is traversed to insert them in the map.
   */
    @Override
    public int findFirstRepeatingElementByHMap(int[] arr, int n) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (Integer element : arr) {
            if (!hashMap.containsKey(element)) {
                hashMap.put(element, 1);
            } else {
                hashMap.put(element, hashMap.get(element)+1);
            }
        }

        for (Map.Entry<Integer,Integer> mapOutPut:hashMap.entrySet()) {
            if (mapOutPut.getValue() > 1) {
                // returning value, you can return index by getValue();
                return mapOutPut.getKey();
            }
        }
        return -1;
    }
/*Time Complexity: O(NlogN)+O(N)

    Reason: O(NlogN) for sorting. O(N) for iterating again in the array for finding a loop.*/

    @Override
    public int findFirstRepeatingElementBySorting(int[] arr, int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n; i ++) {
            if (arr[i] == arr[i+1])
                return i;
        }
        return -1;
    }
/* Time Complexity: O(N2)+O(N)

    Reason: We are taking one element and searching its repeating element
    again in the array. Also, iterating through the dup array
     which contains repeating elements to find unique repeating elements.*/

    @Override
    public int findFirstRepeatingElementByBruteforce(int[] arr, int n) {
        for (int i = 0; i<n; i ++) {
            for (int j = i+1; j< n; j++) {
                if (arr[i] == arr[j])
                    return i;
            }
        }
        return -1;
    }
}
