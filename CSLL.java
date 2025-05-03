// Circular Singly Linked List

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class CSLL{
    Node head;
    
    // Add element to End of the Linked List
    public void addEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            head.next = head;
        }
        else if(head.next == head){

            head.next = newNode;
            newNode.next = head;
        }
        else{
            Node temp = head;
            do{
                temp = temp.next;
            }while(temp.next != head);
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Creates a Linked List with the given numbers in array
    public void create(int[] nums){
        for(int num: nums){
            addEnd(num);
        }
    }

    // Add element to the start of the list
    public void addstart(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            do{
                temp=temp.next;
            }while(temp.next != head);
            newNode.next = head;
            head = newNode;
            temp.next = head;
        }
    }

    // update the elements in the linked list with new element
    public void update(int prev, int curr){
        if(head == null){
            System.out.println("Empty List");
        }
        else if(head.next == head){
            if(head.data == prev){
                head.data = curr;
            }else{
                System.out.println("Data Not Found");
            }
        }
        else{
            boolean flag = true;
            Node temp = head;
            do{
                if(temp.data == prev){
                    flag = false;
                    temp.data = curr;
                }else{
                    temp = temp.next;
                }
            }while(temp.next != head);

            if(flag){
                System.out.println("Data Not Found");
            }
        }

        read();
    }

    // display element from linked list
    public void read(){
        Node temp = head;
        if(head == null){
            System.out.println("null");
        }
        else if(head.next == head){
            System.out.println(head.data);
        }
        else{

            do{
                System.out.print(" -> " + temp.data);
                temp = temp.next;
            }while(temp != head);
            System.out.println(" ->");
        }
    }

    //  Delete element from linked list
    public void delete(int data){
        if(head == null){
            System.out.println("Empty List");
        }
        else if(head.next == head){
            head = head.data == data ? null : head;
        }
        else{
            boolean flag =true;
            Node temp = head.next;
            Node tempPrev = head;
            do{
                if(head.data == data && temp.next == head){
                    flag = false;
                    temp.next = head.next;
                    head = temp.next;
                }
                if(temp.data == data){
                    flag = false;
                    tempPrev.next = temp.next;
                }
                temp = temp.next;
                tempPrev = tempPrev.next;
            }while(temp != head);
            if(flag){
                System.out.println("Data Not Found");
            }
            read();
        }
    }
    public static void main(String[] args) {
        CSLL csll = new CSLL();
        int[] nums = {1,2,3,4,5,6,10,11,7,8,9};

        // Create and Read
        System.out.println("New Linked List");
        csll.create(nums);
        csll.read();
        System.out.println();

        // Add Start and Read
        System.out.println("Adding -1 at start");
        csll.addstart(-1);
        csll.read();
        System.out.println();

        // Add End and Read
        System.out.println("Adding 13 to the end");
        csll.addEnd(13);
        csll.read();
        System.out.println();

        // Update
        System.out.println("Updating 2 with 3");
        csll.update(2, 3);
        System.out.println();

        // Delete
        System.out.println("Deleting element 10 from list");
        csll.delete(-1); // head
        csll.delete(10);
        csll.delete(13);
    }
}

