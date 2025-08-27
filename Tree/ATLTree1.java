package java_datastructure.Tree;

public class ATLTree1 {
    class Node {
        int key;
        int height;
        Node left,right;
        
        public Node(int d){
            key = d;
            height = 1;
        }
    }
    private Node  root;

    public ATLTree1(){

    }

    int height(Node node){
        return node==null ? 0 : node.height;    
    }

    int getBalance(Node node){
        return node == null ? 0 :height(node.left) - height(node.right);
    }

   

    public void printInOrder(){
        inOrder(root);
    }

    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println("data "+node.key+" height "+node.height);
        inOrder(node.right);
    }

    public void insert(int data){
        this.root = insert(this.root,data);
        // Ssystem.out.println("root "+ root);
    }

    private Node insert(Node node,int data){

        if(node == null){
            node = new Node(data);
            return node;
        }
        if(data>node.key){
            node.right = insert(node.right, data);
        }
        else if(data < node.key){
            node.left = insert(node.left, data);
        }
        node.height =1+Math.max(height(node.left),height(node.right));

        return node;

    }
    public static void main(String[] args) {
        int[] data ={34,56,89,2,321,132};
        ATLTree1  tree = new ATLTree1();

        for(int key:data){
            tree.insert(key);
        }

        tree.printInOrder();
    }




}
