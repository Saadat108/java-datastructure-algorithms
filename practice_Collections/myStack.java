/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_Collections;
import java.util.Stack;
/**
 *
 * @author Saadat
 */
public class myStack {
    public static void main(String[] args){
        Stack<String> stk = new Stack<String>();
        stk.push("this");
        stk.push("is");
        stk.push("a");
        stk.push("stack");
        System.out.println(stk.pop());
    }
}
