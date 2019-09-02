/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// I have not done anything to check for -ve numbers, so if number<0 then it'll fo into infinite loop
package practice_Collections;
import java.util.Scanner;
/**
 *
 * @author Saadat
 */
public class recursion_factorial {
    public static void main(String[] args){
        System.out.print("enter number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(factorial(number));
    }
    public static int factorial(int num){
        
        if(num==1){
            return 1;
        }
        else if(num==0){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
        
    }
}

