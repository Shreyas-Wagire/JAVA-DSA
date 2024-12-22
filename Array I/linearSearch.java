public class linearSearch {

    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 8;

        int result = linearSearch(arr, key);

        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found in the array.");
        }
    }
}
