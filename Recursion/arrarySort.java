
public class arrarySort {

    public static Boolean arrarySort(int n, int arr[], int i) {
        if (i == n - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return arrarySort(n, arr, i);

    }

    public static void main(String[] args) {
        int arr[] = {5, 9, 1, 6, 2, 8, 3};
        System.out.println(arrarySort(7, arr, 1));
    }
}
