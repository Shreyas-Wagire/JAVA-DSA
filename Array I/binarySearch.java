
public class binarySearch {

    public static int binarySearch(int arr[], int key) {
        int mid, low = 0, high = arr.length, flag = 0;

        while(low<=high){
            mid = (low+high) /2;
            if(key == arr[mid]){
                flag = 1;
                break;
            }
            else if(key > arr[mid]){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 7, 9, 13, 16, 19, 25, 80};
        int key = 54;
        int result = binarySearch(arr, key);

        if(result == 1){
            System.out.println("Successful!");
        }
        else{
            System.out.println("Unsuccesfull!");
        }
    }
}
