/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author carlotapons
 */
public class Histogram<T> {
    private final Map<Object,Integer> map = new HashMap() ;

    public Integer get(Object key) {
        return map.get(key);  
    }

    
    
    public Set<T> keySet(){
        return (Set<T>) map.keySet();
    }
    
    public void increment(Object key){
       
            if(map.containsKey(key)){
                map.put(key, (map.get(key)+1));
            }else{
                map.put(key, 1);
            }
            
        
    }
    
}
