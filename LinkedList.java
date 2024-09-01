

class Node{
    public int value;
    public Node next;

    public Node(int value){
        this.value = value;
    }

    public Node(int value, Node next){
        this.value = value;
        this.next = next;
    }

        


}

class SetLinkedList{
    Node head;
    Node tail;

    public void deleteFirst(){
        head = head.next;
        if(head==null){
            head = tail;
        }
    }

    public void deleteLast(){
        Node temp = head;
        Node temp1 = head;
        while(temp!=null){
            temp1 = temp;
            temp = temp.next;
        }
        System.out.println(" hello" + tail.next);
        tail = temp1;
        temp1.next = null;
        
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail==null) {
            tail = head;
        }
    }
    public void insertPosition(int val, int pos){
        if(pos==1){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        
        for(int i=0;i<pos-1;i++){
            temp = temp.next;
            if(temp==null && i==pos-2){
                insertLast(val);
                return;
            }else if(temp==null){
                System.out.println("Invalid");
                return;
            }
        }
        node.next = temp.next;
        temp.next = node;
    }
    public void insertLast(int val){

        Node node = new Node(val);
        if(tail!=null){
            tail.next = node;
        }
        tail = node;
        node.next = null;
        if(head==null){
            head = tail;
        }
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.print("END");
    }
}
public class LinkedList {

    public static void main(String[] args) {
        SetLinkedList link = new SetLinkedList();
        link.insertFirst(0);
        link.insertFirst(1);
        link.insertFirst(2);
        link.insertFirst(3);
        link.insertFirst(4); 
        link.insertLast(1);
        link.insertLast(2);
        link.insertLast(3);
        link.insertLast(4);
        // link.insertPosition(0, 9);
        link.display();
        link.deleteLast();
        link.display();

    }

    
}
