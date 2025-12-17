
class Node {
    int data;
    Node pre, next;

    Node(int newData) {
        data = newData;
        pre = next = null;
    }
}

public class InsertaNodeatFront {

    static Node insertAtbegging(Node head, int data) {

        Node newnode = new Node(data);

        if (head == null) {

            return newnode;
        }

        Node temp = head;
        Node pre = null;

        while (temp != null) {
            pre = temp;
            temp = temp.next;
        }

        newnode.pre = pre;
        pre.next = newnode;

        return head;

    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertAtbegging(head, 34);
        head = insertAtbegging(head, 67);
        head = insertAtbegging(head, 89);
        head = insertAtbegging(head, 12);
        print(head);
    }

}
