/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_Collections;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Saadat
 */
public class myHashMap {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "This");
        map.put(2, "is");
        map.put(3, "a");
        map.put(4, "HashMap");
        System.out.println(map);
        map.put(3, "my");
        System.out.println(map.get(3));
        for(Map.Entry m: map.entrySet())
            System.out.println("Key: "+ m.getKey()+ " Value: "+ m.getValue()); 
    }
}
