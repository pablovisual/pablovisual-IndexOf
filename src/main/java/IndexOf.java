
//

public class IndexOf {
    /**
     * Find the position of a number in an array.
     * For example, the position of 7 in {0,1,7,3,4} is 2.
     *
     * @param arr an int array.
     * @param n a possible value of arr.
     * @return the first index (position) of n in arr. if n does not exist in arr, return -1.
     */
    public int getIndex(int[] arr, int n) {
        return search(arr, n, 0);
    }

    public int search(int[] arr, int n, int target) {
        if(target > arr.length - 1) {
            System.out.println(target);
            return -1;
        }

        else {
            if (arr[target] == n) {
                return target;
            }
    
            return search(arr, n, target + 1);
        }   
    }
}
