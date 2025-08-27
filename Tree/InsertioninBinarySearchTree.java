package java_datastructure.Tree;

public class InsertioninBinarySearchTree {
    class Node{
        int data;
        Node left,right;

        public Node(int value){
            this.data = value;
        }
    }

    private Node root;

    public void insert(int data){
       this.root = insert(root,data);
    }

    private Node insert(Node node,int data){
        
        if(node ==null){
            node = new Node(data);
            return node;
        }

        if (data<node.data){
            node.left = insert(node.left, data);
        }
        else if(data > node.data){
            node.right = insert(node.right, data);
        }

      
        return node;
       


    }

    public boolean serach(int key){
       boolean res = serach(root,key);
    return res;
    }

    private boolean serach(Node node,int key){
        if(node == null){
            return false;
        }
        if(node.data == key){
            return true;
        }
        
        if(key > node.data){
           return serach(node.right,key);
        }
        else{
           return serach(node.left,key);
        }
    }

   public void printInOrder(){
        inOrder(root);
    }

    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println("data "+node.data);
        inOrder(node.right);
    }

    public void  deletion(int key){
        deletion(root,key);
    }

    private Node deletion(Node node ,int key){
        if(node == null){
            return null;
        }

        if(node.data == key){
            return null;
        }
        if(key < node.data){
            node.left = deletion(node.left,key);
        }
        else if(key > node.data){
            node.right = deletion(node.right, key);
        }
        return node;
    }

    public void deletion1(int data){
          deletion1(root,data);;
    }

    private Node deletion1(Node node,int key){
        if(node ==  null){
            return null;
        }
        if (node.data == key){
            if(node.right!=null){
                int temp = node.data;
                node.data = node.right.data;
                node.right.data = temp;
                node.right=deletion(node.right,key);
            }else{
                int temp = node.data;
                node.data = node.left.data;
                node.left.data = temp;
                node.left=deletion(node.left,key);
            }
        }
          if(key < node.data){
            node.left = deletion1(node.left,key);
        }
        else if(key > node.data){
            node.right = deletion1(node.right, key);
        }
        return node;

    }

    public int findMin(){
        return findMin(root);
    }

    private int findMin(Node node){
        if(node.left==null){
            return node.data;
        }
        return findMin(node.left);
    }

    public int findMax(){
        return findMax(root);
    }

    private int findMax(Node node){
        if(node.right==null){
            return node.data;
        }
        return findMax(node.right);
    }

    public int floor(int key){
         return floor(root,key);
    }

    private int floor(Node root,int x){

        if (root == null) {
            return -1;
        }

      
        if (root.data == x) {
            return root.data;
        }

        
        if (root.data > x) {
            return floor(root.left, x);
        }

       
        int floorValue = floor(root.right, x);

        
        return (floorValue <= x && floorValue != -1)
                                ? floorValue : root.data;
    }

    public int findCiel(int key){
        return findCiel(root,key);
    }

    private int findCiel(Node root,int key){
         
        if(root==null){
            return -1;
        }
        if(root.data == key){
            return root.data;
        }
        if(root.data < key){
           return findCiel(root.right,key);
        }
        int cielElement = findCiel(root.left, key);

        return (cielElement >= key ? cielElement : root.data);
    }

    public int inOrderSuccesor(int key){
       return inOrderSuccesor(root,key);
    }

    private int inOrderSuccesor(Node node,int key){
        if(node == null){
            return -1;
        }
        if (node.data == key){
            return node.data;
        }

        if(node.data < key){
            return inOrderSuccesor(node.right, key);
        }
        int res = inOrderSuccesor(node.left, key);

        return res >= key && res!=-1 ? res : node.data;
    }

    public int inorderPredecessor(int key){
        return inorderPredecessor(root,key);
    }

    private int inorderPredecessor(Node node,int key){
        if(node == null){
            return -1;
        }
        if(node.data == key){
            return node.data;
        }
        if(node.data> key){
            return inorderPredecessor(node.left, key);
        }
        int res= inorderPredecessor(node.right, key);
        return (res<= key && res!=-1) ? res : node.data;
    }


    public static void main(String[] args) {
        int [] array = {50,30,70,20,40,60,80};
        InsertioninBinarySearchTree tree = new InsertioninBinarySearchTree();

        for(int key:array){
              tree.insert(key);
        }

        // tree.deletion1(70);
        tree.printInOrder();
        // // System.out.println(tree.serach(89));
        // System.out.println("Minium element "+ tree.findMin());
        // System.out.println("Max element "+ tree.findMax());

        System.out.println("Floor node is "+tree.floor(23));
        System.out.println("Ciel element is " +tree.findCiel(90));
        System.out.println("inOrder succesor element is " +tree.inOrderSuccesor(90));
        System.out.println("inOrder predecessor element is " +tree.inorderPredecessor(90));
    }
}
