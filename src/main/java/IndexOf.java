
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
        /*check first if target is not out of bounds
        (meaning the value in the arr was not found or 
        if arr is empty*/
        if(target > arr.length - 1 || arr.length == 0) {
            return -1;
        }

        //otherwise check if target is found and return target
        else {
            if (arr[target] == n) {
                return target;
            }
    
            return search(arr, n, target + 1);
        }   
    }
}
