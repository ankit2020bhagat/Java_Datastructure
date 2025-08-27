package java_datastructure.Tree;

public class AVLTree {
     class  Node {
        int key,height;
        Node left,right;

        public Node(int d){
            key = d;
            height =1;
        }
    }

        private Node root;

        public int height(Node node){
            return (node == null)?0:node.height;
        }

        int getBalance(Node node){
            return (node==null) ? 0 : height(node.left) -height(node.right);
        }

        Node rightRotate(Node y){
            Node x = y.left;
            Node T2 = x.right;

            x.right = y;
            y.left = T2;

            y.height = Math.max(height(y.left), height(y.right)+1);
            x.height = Math.max(height(x.left), height(x.right)+1);

            return x;
        }
        Node leftRotate(Node x) {
            Node y = x.right;
            Node T2 = y.left;

            // Rotation
            y.left = x;
            x.right = T2;

            // Update heights
            x.height = Math.max(height(x.left), height(x.right)) + 1;
            y.height = Math.max(height(y.left), height(y.right)) + 1;

            return y;
    }

        Node insert(Node node,int key){
            if(node == null){
                return new Node(key);
            }

            if(key<node.key){
                node.left = insert(node.left, key);
            }
            else if(key>node.key){
                node.right = insert(node.right, key);
            }
            else{
                return node;
            }

            node.height =1+Math.max(height(node.left),height(node.right));

            int balance = getBalance(node);

            if(balance > 1 && key < node.left.key){
                return rightRotate(node);
            }

            if(balance <-1 && key > node.right.key){
                return leftRotate(node);
            }

            if(balance >1 &&key> node.left.key){
              node.left = leftRotate(node.left);
              return rightRotate(node);
            }

           if( balance <-1 && key<node.right.key){
            node.left = rightRotate(node.left);
            return leftRotate(node);
           }
           return  node;

        }

        public void insert(int key){
            root = insert(root, key);
        }

        void inOrder(Node node){
            if(node == null){
                return;
            }
            inOrder(node.left);
            System.out.println("node key "+node.key+"height "+node.height);
            inOrder(node.right);
        }

        public void printInorder(){
            inOrder(root);
            System.out.println();
        }

        public static void main(String[] args) {
            AVLTree tree = new AVLTree();
            int[] keys = {10,20,30,40,50,123};

            for(int key:keys){
                tree.insert(key);
            }
            tree.printInorder();
        }

         


        
    
    
    
   

       
    
    

}
