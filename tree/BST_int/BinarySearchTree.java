/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.BST_int;

/**
 *
 * @author Saadat 
 */
public class BinarySearchTree<T> {
    Node root=null;
    
    public BinarySearchTree(){
        this.root = null;
    }
    
    public void add(Node start, Node newNode){
        if(root==null){
            root= newNode;
            return;
        }
        if(newNode.value > start.value){ // value larger than current so go right to add
            if(start.right == null){
                start.right= newNode;
            }
            else{
                add(start.right, newNode);
            }
        }
        if(newNode.value < start.value){ //value less than current so go left
            if(start.left == null){
                start.left= newNode;
            }
            else{
                add(start.left, newNode);
            }
        }
        
    }
    public void search(int value, Node start){
        if(start==null){
            System.out.println("not found");
            return;
        }
        if(start.value==value){
            System.out.println("Found");
            return;
        }
        if(value>start.value){ // value is larger so search right
            search(value, start.right);
        }
        if(value<start.value){ // value is larger so search right
            search(value, start.left);
        }
        
    }
    public Node createNode(int val){
        return new Node(val, null, null);
    }
}
