package HashMaps;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args){
        // HashMap = A data structure that stores key-value pairs
        //           Keys are unique, but values can be duplicated
        //           Does not maintain any order, but is memory efficient
        //           HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("Chips", 4.50);
        map.put("soda", 3.45);
        map.put("cookies", 5.50);
        map.put("Chips", 10.00);
        System.out.println(map);

        map.remove("cookies");
        System.out.println(map);

        System.out.println(map.get("soda"));

        System.out.println(map.containsKey("soda"));

        if(map.containsKey("choco")){
            System.out.println(map.get("soda"));
        }else{
            System.out.println("Key not found");
        }

        System.out.println(map.containsValue(10.00));

        System.out.println(map.size());

        System.out.println();
        System.out.println();

        for(String key : map.keySet()){
            System.out.println(key + ": $" + map.get(key));
        }
    }
}
