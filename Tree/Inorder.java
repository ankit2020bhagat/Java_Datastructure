package java_datastructure.Tree;

class Node{
    int data;
    Node left,right;

    public Node(int value){
        this.data = value;
    }
}

public class Inorder {

    public void inOrder(Node node){
      if(node ==null){
        return;
      }
      inOrder(node.left);
      System.out.println(node.data);
      inOrder(node.right);
    }

    public void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node node){
          if(node == null){
            return ;
          }
          postOrder(node.left);
          postOrder(node.right);
          System.out.println(node.data);
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
       int lheight= height(node.left);
       int rheight =height(node.right);
        return Math.max(lheight, rheight)+1;
    }
    public static void main(String[] args) {
        Node root;
        root =new Node(32);
        root.left = new Node(12);
        root.right = new Node(25);
        root.right.right = new Node(20);
        root.left.left = new Node(9);
        root.left.right = new Node(10);
        
        Inorder obj = new Inorder();
        System.out.println("Inroder traversal");
        obj.inOrder(root);
        System.out.println("Pre Order traversal");
        obj.preOrder(root);
        System.out.println("Post order traversal");
        obj.postOrder(root);
        int height = obj.height(root);
        System.out.println("Height of tree "+height);

    }
    
}
