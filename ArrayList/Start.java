
import java.util.*;

class Start {

    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();
        //Class-Name <Datatype> list-name = new Class-Name

        // Add Operation - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        // new type of add 
        list.add(3, 50);
        System.out.println(list);


        // Get Operation - O(1)
        int newEle = list.get(2);

        //Delete Operation - O(n)
        list.remove(1);
        
        // Set 
        list.add(2,20);
        System.out.println(list);

        //Contain Element
        System.out.println(list.contains(10));
        System.out.println(list.contains(20));

        //Size
        System.err.println(list.size());
    }
}
