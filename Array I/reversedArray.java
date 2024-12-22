public class reversedArray {
    public static void reversedArray(int arr[]) {
        int start = 0, last = arr.length-1;

        while(start < last){
            int temp = arr[last];
            arr[last] = arr[start];
            arr[start] = temp;

            start++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,9,10,15,19};
        reversedArray(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
