package DataStructures.BigO.DynamicArrays;

public class DynamicArrays {
    public static void main(String[] args){

        //advantages:
        //1. Random access of elements O(1)
        //2. Good locality of reference and data cache utilization
        //3. Easy to insert/delete at the end

        //disadvantages:
        //1. waste more memory
        //2. shifting of elements is time consuming O(n)
        //3. expanding/shrinking the array is time consuming -> O(n)

        //ArrayList<String> arrayList = new ArrayList<>();

        DynamicArray dynamicArray = new DynamicArray(5);

//        System.out.println(dynamicArray.capacity);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");

//        dynamicArray.insert(0, "X");
//        dynamicArray.delete("A");
//        System.out.println("found: " + dynamicArray.search("C"));



        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("empty: " + dynamicArray.isEmpty());


    }
}
