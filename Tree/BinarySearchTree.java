package java_datastructure.Tree;

public class BinarySearchTree {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value  = value;
        }

        public int getValue(){
            return this.value;
        }
    }
    
    private Node root;
    public BinarySearchTree(){

    }
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
       return root== null;
    }

    public void insert(int value){
        root = insert(root,value);
    }

    private Node  insert(Node node,int value){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value<node.value){
            node.left = insert(node.left, value);
        }
        if(value>node.value){
            node.right = insert(node.right, value);
        }

        node.height = Math.max(height(node.left),height(node.right))+1;
        return node;

    }
    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.right);
    }

    public void display(){
        display(this.root,"Root Node");
    }
    private void display(Node node,String details){
         if(node == null){
            return;
         }
         System.out.println(details+node.value);
         display(node.left, "Left child of "+node.value+" ");
         display(node.right, "Right child of "+node.value+" ");
    }

    public void populatedSorted(int [] nums){
        populatedSorted(nums,0,nums.length);
    }

    private void populatedSorted(int[] nums,int start,int end){
        if(start == end){
            return;
        }
        int mid = (start+end)/2;
        this.insert(nums[mid]);
        populatedSorted(nums,start,mid);
        populatedSorted(nums,mid+1,end);
        
        

    }
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        // tree.insert(5);
        //  tree.insert(2);
        //   tree.insert(7);
        //    tree.insert(1);
        //     tree.insert(4);
        //      tree.insert(6);
        //       tree.insert(9);
        //        tree.insert(8);
        // tree.display();
        int[] arr ={1,2,3,4,5,6,7,8,9};
        tree.populatedSorted(arr);
        tree.display();
    }
}
