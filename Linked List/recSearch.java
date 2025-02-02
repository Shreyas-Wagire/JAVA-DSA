public class recSearch {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add Last 
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // print
    public void print(){
        if(head == null){
            System.out.println("List is empty!!");
        }
        Node temp = head;
        while(temp != null){ 
            System.out.print(" "+ temp.data +" "+"->");
            temp = temp.next;
        }
        System.out.println(" null");
    }

    
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }

    public int recursiveSearch(int key){
        return helper(head, key);
    }

    public static void main(String args[]){
        recSearch ll = new recSearch();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        System.out.println(ll.recursiveSearch(3));
    }
}
