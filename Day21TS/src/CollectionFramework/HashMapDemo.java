

package CollectionFramework;

import java.util.*;
public class HashMapDemo {
 public static void main(String args[]) {
	 
 
	HashMap<String,Integer> map =new HashMap<String,Integer>();
	map.put("Akashay",23);
	map.put("Ragnar",24);
    map.put("Beon",23);
    map.put("Ivar",23);
    map.put("Vistarg",23);
    map.put("Rollo",23);
    map.put("Helga",23);
    map.put("floky",23);
    map.put("Athelstan",23);
    System.out.println("Name of student and his Age::"+"\n"+map);
 
     for(Map.Entry m:map.entrySet()) {
    	 System.out.println("Student Age");
    	 System.out.println(m);
    
     }

}
}

