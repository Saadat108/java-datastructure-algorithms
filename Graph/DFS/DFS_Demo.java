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
public class DFS_Demo {
        public static void main(String[] args){
            DFS_graph gr= new DFS_graph(6);
            gr.add(0, 2);
            gr.add(0, 1);
            gr.add(1, 4);
            gr.add(1, 3);
            gr.add(2, 5);
            
            gr.add(3, 1);
            gr.add(4, 1);
            gr.add(5, 2);
            gr.add(2, 0);
            gr.add(1, 0);
            
            gr.DFS_explore(0);
        }  
}
   