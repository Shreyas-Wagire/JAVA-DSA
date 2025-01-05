import java.util.*;

public class sortList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(9);
        arr.add(3);
        arr.add(6);

        Collections.sort(arr);
        System.out.println(arr);
    }
}
