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
public class Node<T> {
    Node left;
    Node right;
    T value;
    public  Node(T value, Node left, Node right){
        this.value= value;
        this.left=left;
        this.right=right;
    }
    
}
