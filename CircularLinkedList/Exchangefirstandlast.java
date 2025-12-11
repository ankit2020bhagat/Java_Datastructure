public class Exchangefirstandlast {

    public static void print(Node head) {
        Node temp = head;
        do {
            System.out.println(temp.data + "->");
            temp = temp.next;
        } while (temp != head);
    }

    public static Node excahngeNode(Node head) {

        Node last, pre;
        last = pre = head;
        do {
            pre = last;
            last = last.next;
        } while (last.next != head);

        last.next = head.next;
        head.next = last;
        pre.next = head;
        return last;
    }

    public static void main(String[] args) {

        Node head = new Node(12);
        head.next = new Node(32);
        head.next.next = new Node(34);
        head.next.next.next = new Node(45);
        head.next.next.next.next = new Node(56);
        head.next.next.next.next.next = head;
        print(head);
        head = excahngeNode(head);
        print(head);
    }
}
