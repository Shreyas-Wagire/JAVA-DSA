public class lastOccers {

    public static int lastOccers(int arr[], int key, int i){
        if(i < 0){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return lastOccers(arr, key, i-1);
    }

    public static void main(String[] args) {
        int arr[] = {5, 9, 1, 5, 2, 5, 3};
        int key = 5;
        System.out.println(lastOccers(arr, key, arr.length-1));
    }
}
