/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph.DFS;

/**
 *
 * @author Saadat
 */
public class Node {
    int value;
    Node next;
    public Node(int value, Node next){
        this.next= next;
        this.value= value;
    }
    
}
