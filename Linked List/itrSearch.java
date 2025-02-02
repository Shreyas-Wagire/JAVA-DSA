public class itrSearch {
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

    public int search(int key){
        Node temp = head;
        int i = 0;

        while(temp!=null){
            if(temp.data == key){
                return i;
            }

            temp = temp.next;
            i++;
        }

        return -1;
    }


    public static void main(String args[]){
        itrSearch ll = new itrSearch();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        System.out.println(ll.search(3));
    }
}
