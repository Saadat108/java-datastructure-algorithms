/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author Saadat 
 */
public class BinarySearchTree<T> {
    Node root=null;
    
    public BinarySearchTree(){
        this.root = null;
    }
    
    public void add(T value){
        if(root==null){
            root= new Node(value, null, null);
            return;
        }
        
        Node temp = new Node(value, null, null);
    }
}
