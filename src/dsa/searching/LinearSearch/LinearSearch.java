package DataStructures.BigO.LinearSearch;

public class LinearSearch {

    public static int search(int arr[], int N, int x){
        //iterate over the array in order to find the key -> x
        for(int i = 0; i < N; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        //linear search -> iterate over the array in order to find the key
        //                 iterate through a collection one at a time
        //                 runtime complexity O(n)
        //                 disadvantages:
        //                 slow for large data sets
        //                 advantages:
        //                 fast for searches of small to medium data sets
        //                 does not need to be sorted
        //                 useful for data structures that do not have random access (Linked List)?

        int arr[] = { 2,3,4,10,40};
        int x = 4;

        int result = search(arr, arr.length, x);
        int result2 = linearSearch(arr, 1);
        if(result == -1){
            System.out.println("Element is not present in array");
        }else{
            System.out.println("Element is present at index " + result);
        }
    }

    private static int linearSearch(int[] array, int value){
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }

        return -1;
    }
}
