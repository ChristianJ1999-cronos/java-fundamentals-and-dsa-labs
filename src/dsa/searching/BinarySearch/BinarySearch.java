package DataStructures.BigO.BinarySearch;

public class BinarySearch {
    static int binarySearch(int arr[], int low, int high, int x){
        if(high >= low){
            int mid = low + (high - low) / 2;

            if(arr[mid] == x){
                return mid;
            }

            if(arr[mid] > x){
                return binarySearch(arr, low, mid - 1, x);
            }else{
                return binarySearch(arr, mid + 1, high, x);
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int arr[] = {2,3,4,10,40};
        int n = arr.length;
        int x = 10;
        int result = binarySearch(arr, 0, n - 1, x);

        if(result == -1){
            System.out.println("Element was not present in the array");
        }else{
            System.out.println("Element is present at the index: " + result);
        }
    }
}
