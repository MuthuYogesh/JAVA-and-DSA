// Circular Doubly Linked List

class Node {
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class CDLL{
    Node head;
    
    // Add element to End of the Linked List
    public void addEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            head.next = head;
            head.prev = head;
        }
        else if(head.next == head && head.prev == head){

            head.next = newNode;
            newNode.next = head;
            newNode.prev = head;
            head.prev = newNode;
        }
        else{
            Node temp = head;
            do{
                temp = temp.next;
            }while(temp.next != head);
            temp.next = newNode;
            newNode.next = head;
            newNode.prev = temp;
            head.prev = newNode;
        }
    }

    // Creates a Linked List with the given numbers in array
    public void create(int[] nums){
        for(int num: nums){
            addEnd(num);
        }
    }

    // update the elements in the linked list with new element
    public void update(int prev, int curr){
        if(head == null){
            System.out.println("Empty List");
        }
        else if(head.next == head && head.prev == head){
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
        else if(head.next == head && head.prev == head){
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
            return;
        }
        else{
            boolean flag =true;
            Node temp = head;
            do{
                if(temp.data == data){
                    if(temp.next == temp){
                        head = null;
                    }
                    else{
                        temp.prev.next = temp.next;
                        temp.next.prev = temp.prev;
                        if(temp == head){
                            head = temp.next;
                        }
                    }
                    flag = false;
                    return;
                }
                temp = temp.next;
            }while(temp != head);
            if(flag){
                System.out.println("Data Not Found");
            }
        }
    }
    public static void main(String[] args) {
        CDLL cdll = new CDLL();
        int[] nums = {1,2,3,4,5,6,10,11,7,8,9};

        // Create and Read
        System.out.println("New Linked List");
        cdll.create(nums);
        cdll.read();
        System.out.println();

        // Add End and Read
        System.out.println("Adding 13 to the end");
        cdll.addEnd(13);
        cdll.read();
        System.out.println();

        // Update
        System.out.println("Updating 2 with 3");
        cdll.update(2, 3);
        System.out.println();

        // Delete
        System.out.println("Deleting element 1, 10, 13 from list");
        cdll.delete(1); // head
        cdll.delete(10);
        cdll.delete(13);
        cdll.read();
    }
}