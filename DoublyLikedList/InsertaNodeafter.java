
class Node {
    int data;
    Node next, pre;

    Node(int newdata) {
        data = newdata;
        next = pre = null;
    }
}

public class InsertaNodeafter {

    static void insertAfterNode(Node head, int key, int data) {
        Node curr = head;
        Node newNode = new Node(data);
        while (curr != null) {
            if (curr.data == key) {
                break;
            }
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next.pre = newNode;
        curr.next = newNode;
        newNode.pre = curr;

    }

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

    static void insertBeforeNode(Node head, int key, int data) {

        Node curr = head;
        Node newNode = new Node(data);
        while (curr != null) {
            curr = curr.next;
            if (curr.data == key) {
                break;
            }
        }
        newNode.pre = curr.pre;
        newNode.next = curr;
        curr.pre = newNode;
        curr.pre.next = newNode;

    }

    static void insertAtEnd(Node head, int data) {

        Node curr = head;
        Node newNode = new Node(data);
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.pre = curr;
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
        // print(head);
        insertAfterNode(head, 89, 46);
        insertBeforeNode(head, 67, 81);
        insertAtEnd(head, 100);

        print(head);

    }

}
