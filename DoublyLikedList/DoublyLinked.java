
class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

public class DoublyLinked {

    public static void main(String[] args) {
        Node head = new Node(23);
        head.next = new Node(65);
        head.next.prev = head;
        head.next.next = new Node(89);
        head.next.next.prev = head.next;

        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
    }

}
