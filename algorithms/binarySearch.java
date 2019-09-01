/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
binary search needs an array or any other data structure that already has it's nontent/elements sorted out in a particular order, 
I have implemented this biary search in an array arranged in ascending order, the array is in the class LinearSearchDataSet.java
*/
package algorithms;


public class binarySearch {

public static void main(String [] args){
    
    LinearSearchDataSet data = new LinearSearchDataSet(10);
    int search = -1;
    Boolean isFound = false;
    
    int low = 0;
    int high = data.data.length-1;
    int mid = 0;
    
    while(!isFound){
        if(low>high){
            System.out.println("your number not found");
            break;
        }
        data.numberTry++;
        
        mid =(low+high)/2;
//        System.out.println("low: "+low);
//        System.out.println("mid: "+mid);
//        System.out.println("high: "+high);
        if(data.data[mid]==search){
            isFound = true;
            System.out.print("number "+search+" found after "+data.numberTry+" tries");
            break;
        }
        else if(search>data.data[mid]){
            low = mid+1;
        }
        else{
            high = mid-1; 
        }
    }
}    
}
