/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.BST_int;

/**
 *
 * @author Lubna
 */
public class BST_Demo {
    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(bst.root,new Node(2, null, null));
        for(int i=1; i<10; i++){
            bst.add(bst.root,new Node(i, null, null));
        }
        bst.search(0, bst.root);
    }
    
}
