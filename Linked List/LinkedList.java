
public class LinkedList {
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

    // Add First
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

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

    //add in middle
    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    //delete start
    public int deleteFisrt(){
        if(size == 0){
            System.out.println("List is empty!");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // delete at last 
    public int deleteLast(){
        if(size == 0){
            System.out.println("List is empty!");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        
        Node prev = head;
        for(int i = 0; i<size-2;i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.deleteFisrt();
        ll.print();
        ll.deleteLast();
        ll.print();
    }
}
