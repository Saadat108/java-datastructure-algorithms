/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_Collections;

import java.util.Iterator;
import java.util.LinkedList;
/**
 *
 * @author Saadat
 */
public class myLinkedList {
    public static void main(String[] args){
        LinkedList<String> ls= new LinkedList<String>();
        ls.add("hussain");
        ls.add("selena");
        ls.add("mammu");
        Iterator<String> itr = ls.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
}
    
}