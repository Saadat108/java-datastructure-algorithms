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
public class Node {
    Node left;
    Node right;
    int value;
    public  Node(int value, Node left, Node right){
        this.value= value;
        this.left=left;
        this.right=right;
    }
    
}
