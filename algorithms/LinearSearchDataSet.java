/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author Lubna
 */
public class LinearSearchDataSet {
    int[] data;
     int numberTry=0;
    public LinearSearchDataSet(int size){
        data = new int[size];
        for(int i=0; i<size; i++){
            data[i]=i+1;
        }
        
    }
}
