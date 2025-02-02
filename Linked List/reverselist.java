public class reverselist {
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
    
        
        public void reverse(){ // O(n)  
            Node prev = null;
            Node curr = tail = head;
            Node next;

            while(curr != null){
                next  = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            head = prev;
        }
    
        public static void main(String args[]){
            reverselist ll = new reverselist();
    
            ll.addLast(1);
            ll.addLast(2);
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);
            ll.print();
            ll.reverse();
            ll.print();
        }
    
}


