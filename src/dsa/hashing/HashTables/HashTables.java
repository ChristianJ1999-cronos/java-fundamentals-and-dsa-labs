package DataStructures.BigO.HashTables;

import java.util.Hashtable;

public class HashTables {
    public static void main(String[] args){

        // HashTable = a data structure that stores unique keys to values ex.<Integer, String>
        //             Each key/value pair is known as an Entry
        //             FAST insertion, look up, deletion of key/value pairs
        //             Not ideal for small data sets, great with large data sets

        // Hashing = takes a key and computes an Integer (formula will vary based on key & data type)
        //           In a Hashtable, we use the hash % capacity to calculate an index number

        //           key.hashCode() % capacity = index

        // bucket = an indexed storage location for one or more entries
        //          can store multiple entries in case of a collision (linked similarly as a linkedList)

        // collision = hash function generates the same index for more than one key
        //             less collisions = more efficiency

        // Runtime complexity: Best Case O(1)
        //                     Worst Case O(n)

        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        System.out.println(table.get(777));

        table.remove(777);

        for(Integer key : table.keySet()){
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }


        //using strings instead of integer

        Hashtable<String, String> tables = new Hashtable<>(21);

        tables.put("100", "Spongebob");
        tables.put("123", "Patrick");
        tables.put("321", "Sandy");
        tables.put("555", "Squidward");
        tables.put("777", "Gary");

        System.out.println(tables.get("777"));

        tables.remove(777);

        for(String key : tables.keySet()){
            System.out.println(key.hashCode() % 21 + "\t" + key + "\t" + tables.get(key));
        }
    }
}
