
public class fistOccers {

    public static int fistOccers(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return fistOccers(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {5, 9, 1, 5, 2, 5, 3};
        System.out.println(fistOccers(arr, 9, 0));
    }
}
