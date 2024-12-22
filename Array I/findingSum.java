public class findingSum {

    public static void subarrrays(int arr[]) {
        int ts=0,sum;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= 2; k++) {
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(ts);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        subarrrays(arr);
    }
}
