import java.util.*;

public class RemoveDuplicates {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public static Node head;

    public static void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        RemoveDuplicates ll = new RemoveDuplicates();
        HashSet<Integer> hs = new HashSet<>();
        System.out.print("Enter Elements for LinkedList: ");
        for(int i=0;i<n;i++) {
            int val = sc.nextInt();
            ll.insert(val);
        }
        
        Node temp  = head; 
        Node prev = null;
        while(temp != null) {
            if(!hs.add(temp.data)) {
                prev.next = temp.next;
            } else {
                prev = temp;
            }
            temp = temp.next;
        }

        Node temp1 = head;
        while(temp1!=null) {
            if(temp1.next!=null)
                System.out.print(temp1.data+"->");
            else
                System.out.println(temp1.data);
            temp1 = temp1.next;
        }
        System.out.println();

    }
}
