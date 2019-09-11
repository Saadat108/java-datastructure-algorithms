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
    AdjList[]adjList_Array;
    public DFS_graph(int size){ // to create graph an arguement of the size is required
        this.size= size;
        adjList_Array= new AdjList[this.size];
        for(int i=0; i<size; i++){
            adjList_Array[i]= new AdjList();
            adjList_Array[i].head= null;
        }
    }
    public void add(int src, int dest){
        Node temp= new Node(dest, null);
        temp.next= adjList_Array[src].head;
        adjList_Array[src].head=temp; 
    }
    
    public void DFS_explore(int startVertex){
        /** this traverses through the graph but need to 
        specify from which node we're traversing as argument
        **/
         Boolean[] visited= new Boolean[size];
         for(int i=0; i<size; i++){
             // initiate each adjList_Array element with false since none have been visited
             visited[i]= false;
         }
         
         Stack<Integer> stk= new Stack<>();
         stk.push(startVertex);
         
         while(!stk.isEmpty()){
             /*
             if stack not empty, take the element on top an visit it's child
             element on top is named currentValue
             */
             int currentValue= stk.pop();
             stk.push(currentValue);
             visited[currentValue]= true; 
             
             Node current_Node_Child= adjList_Array[currentValue].head;
             Boolean isDone= true; // whether current node's children are all visited or not
             while(current_Node_Child != null){
                 /*
                 the current node night be already visited
                 but the next child element might not be visited
                 so we while loop it to until the current node is null
                 to check if there is a child that has not been visited
                 */
                 if(visited[current_Node_Child.value]== false){
                     /* if node's child not visited push into stack
                     and make it's visited adjList_Array element true
                     and break the while loop
                     If a child is unvisited we change the node's status to not Done
                     else it remains Done
                     */
                     stk.push(current_Node_Child.value);
                     visited[current_Node_Child.value]= true;
                     isDone= false;
                     break;
                 }else{
                     /* if current node is visited go 
                     to the next node
                     */
                     current_Node_Child= current_Node_Child.next;
                 }
             }
             if(isDone== true){
                 /*
                 we check to see if all children of node 
                 has been visited
                 */
                 int out= stk.pop();
                 System.out.println("Visited node: "+ out);
             }
         }
    }
}
