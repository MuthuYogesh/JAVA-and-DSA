class Node{
    int data;
    int prev;
    int next;
    node(int val){
        this.data = val;
        this.prev = null;
        this.next = null;
    }
}

public class DlinkedList {
    Node head;
    Node tail;

    public boolean isEmpty(){
        return head==null;
    }

    public void addStart(int val){
        Node newNode = new Node();
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void addEnd(int val){
        Node newNode = new Node();
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void traverseStart(){
        if(isEmpty()){
            System.out.println("DLL is Empty");
        }
        else{
            Node temp = head;
            System.out.print("null<---->");
            while(temp.next!=null){
                System.out.print(temp.data + "<---->");
                temp = temp.next;
            }
            System.out.println("null");   
        } 
    }

    public void traverseEnd(){
        if(isEmpty()){
            System.out.println("DLL is Empty");
        }
        else{
            Node temp = tail;
            System.out.print("null<---->");
            while(temp.prev!=null){
                System.out.print(temp.data + "<---->");
                temp = temp.prev;
            }
            System.out.println("null");   
        } 
    }

    public void delete (int val){
        if(isEmpty()){
            System.out.println("DLL is Empty");
        }
        else{
            Node temp = head;
            while (temp != null && temp.data != val) {
                temp = temp.next;
            }
            if(temp == null){
                System.out.println("Data is not found");
            }
            else if(temp.next == null && temp.prev == null){
                head=null;
                tail=null;
            }
            else if(temp.prev == null){
                head = head.next;
                head.prev = null;
            }
            else if(temp.next==null){
                tail = tail.prev;
                tail.next = null;
            }
            else{
                temp.next.prev = temp.prev;
                temp.prev.next = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        DlinkedList dlist = new DlinkedList();
        dlist.addEnd(3);
        dlist.addEnd(2);
        dlist.addStart(1);
        dlist.traverseStart();
        dlist.traverseEnd();
        dlist.delete(2);
        dlist.delete(1);
        dlist.delete(3);
    }
}
