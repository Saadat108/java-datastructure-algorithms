/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph.DFS;

import java.util.Stack;

/**
 *
 * @author Saadat
 */
public class DFS_graph {
    int size;
    AdjList[]array;
    public DFS_graph(int size){ // to create graph an arguement of the size is required
        this.size= size;
        array= new AdjList[this.size];
        for(int i=0; i<size; i++){
            array[i]= new AdjList();
            array[i].head= null;
        }
    }
    public void add(int src, int dest){
        Node temp= new Node(dest, null);
        temp.next= array[src].head;
        array[src].head=temp; 
    }
    
    public void DFS_explore(int startVertex){
        /** this traverses through the graph but need to 
        specify from which node we're  traversing
        **/
         Boolean[] visited= new Boolean[size];
         for(int i=0; i<size; i++){
             // initiate each array element with false since none have been visited
             visited[i]= false;
         }
         Stack<Integer> stk= new Stack<>();
         stk.push(startVertex);
         while(!stk.isEmpty()){
             int n= stk.pop();
             stk.push(n);
             visited[n]= true;
             
         }
    }
}
