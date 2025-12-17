public class DeletionfromaCircular {

    public static void print(Node head) {
        Node temp = head;
        do {
            System.out.println(temp.data + "->");
            temp = temp.next;
        } while (temp != head);
    }

    public static Node deleteFromBegning(Node head) {
        if (head == null) {
            return null;
        }
        Node last = head;
        do {
            last = last.next;
        } while (last.next != head);
        last.next = head.next;
        return head.next;

    }

    public static void deleteFromLast(Node head) {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }
        temp.next = head;
    }

    public static void main(String[] args) {
        Node head = new Node(12);
        head.next = new Node(32);
        head.next.next = new Node(34);
        head.next.next.next = new Node(45);
        head.next.next.next.next = new Node(56);
        head.next.next.next.next.next = head;
        // print(head);
        head = deleteFromBegning(head);
        print(head);
        deleteFromLast(head);
        print(head);

    }
}
