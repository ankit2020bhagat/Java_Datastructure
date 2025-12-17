
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinked {

    public static void main(String[] args) {
        Node head = new Node(23);
        head.next = new Node(45);
        head.next.next = new Node(67);
        head.next.next.next = head;
        Node temp = head;
        do {
            System.out.print(temp.data + "->");
            // System.out.println(head);
            temp = temp.next;
            // System.out.println(head);
        } while (temp != head);
    }
}
