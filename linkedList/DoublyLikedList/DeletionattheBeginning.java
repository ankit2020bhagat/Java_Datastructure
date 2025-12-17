
class Node {
    int data;
    Node next, pre;

    public Node(int data) {
        this.data = data;
        next = pre = null;
    }

}

public class DeletionattheBeginning {

    public static Node deleteFromBegining(Node head) {
        if (head == null) {
            return null;
        }

        return head.next;

    }

    public static void deleteLastNode(Node head) {
        if (head == null) {
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.pre.next = null;
    }

    public static void deleteNode(Node head, int key) {
        if (head == null) {
            return;
        }
        int count = 0;
        Node curr = head;
        while (curr != null && count != key) {
            count += 1;
            curr = curr.next;
        }
        try {
            curr.pre.next = curr.next;
            curr.next.pre = curr.pre;
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(23);
        head.next = new Node(54);
        head.next.pre = head;
        head.next.next = new Node(23);
        head.next.next.pre = head.next;
        head.next.next.next = new Node(78);
        head.next.next.next.pre = head.next.next;

        print(head);
        // System.out.println(head);
        // head = deleteFromBegining(head);
        // System.out.println(head);
        // deleteNode(head, 2);
        deleteLastNode(head);
        print(head);

    }
}
