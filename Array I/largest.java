
public class largest {

    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE; 

        for(int i =0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }

        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,6,4,9,3};
        System.out.print(largest(arr));
    }

}
