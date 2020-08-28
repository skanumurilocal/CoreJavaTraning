package com.corejava.training.datastructures.binarysearch;

public class BinarySearchTree {

    class Node {
        int key;
        Node left,right;

        public Node(int key){
            this.key = key;
            left=right=null;
        }
    }

    //Root Parent
    Node root;

    //boolean
    boolean isKeyFound;

    public BinarySearchTree(){
        root = null;
        isKeyFound=false;
    }

    /**
     * Inserts Record into Tree
     * @param key
     */
    void insert(int key){
        root = insertRec(root,key);
    }

    /**
     * Finds Record inside tree
     * @param key
     * @return
     */
    Node search(int key){
        return search(root,key);
    }

    /**
     * Deletes Record based on key
     * @param key
     * @return
     */
    Node delete(int key){
       root= deleteRec(root,key);
       return root;
    }

    private Node deleteRec(Node root, int key) {
        if(root == null) return root;

        if(key<root.key){
            root.left = deleteRec(root.left,key);
        }else if(key>root.key){
            root.right=deleteRec(root.right,key);
        }else{
            isKeyFound=true;
            if(root.left==null)
                return root.right;
            else if (root.right==null)
                    return root.left;

            root.key = minValue(root.right);
            // Delete the inorder successor
            root.right = deleteRec(root.right, root.key);
        }

        return  root;
    }

    private int minValue(Node right) {
        int minVal = right.key;
        while (right.left !=null){
            minVal = right.left.key;
            right=right.left;
        }
        return minVal;
    }

    private Node search(Node root, int key) {

        if(root == null || root.key == key){
            return  root;
        }
        if(key<root.key){
            return search(root.left,key);
        }if(key>root.key){
            return search(root.right,key);
        }
        return null;
    }

    private Node insertRec(Node root, int key) {

        if(root == null ){
            root = new Node(key);
            return root;
        }

        if(key<root.key){
            root.left= insertRec(root.left,key);
        }else if(key>root.key)
            root.right = insertRec(root.right,key);

        return  root;
    }

    void printInorder(){
        printInorderRec(root);
        System.out.println();
    }

    private void printInorderRec(Node root) {
        if(root!=null){
            printInorderRec(root.left);
            System.out.print(root.key+"   ");
            printInorderRec(root.right);
        }
    }



    // Driver Program to test above functions
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        /* Let us create following BST
              100
           /     \
          30
         /  \
       20   40

        */

        tree.insert(100);
        tree.insert(30);
        tree.insert(25);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);

        tree.insert(28);
        tree.insert(50);
        tree.insert(300);
        tree.insert(28);


        // print inorder traversal of the BST
        tree.printInorder();
        int searchKey= 101;
        Node searchNode = tree.search(searchKey);
        System.out.println("Is Key Found: "+tree.isKeyFound);
        tree.delete(searchKey);
        if(tree.isKeyFound){
            System.out.println("Deletion of Node Successful");

        }else{
            System.out.println("Delete Operation is Not Successful, Hence no change in tree strucuture");
        }
        tree.printInorder();
    }

}
