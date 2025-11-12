public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length() ){
            System.out.println("testing testing");
            return false;
        }

        //brute force -> sort the strings and make sure they are equal
        // char[] a = s.toCharArray();
        // char[] b = t.toCharArray();

        // Arrays.sort(a);
        // Arrays.sort(b);

        // System.out.println(a);
        // System.out.println(b);

        // return Arrays.equals(a, b);

        HashMap<Character, Integer> counter = new HashMap<>();

        // stores in counter the amount of times each letter appears in string s
        for( char ptr : s.toCharArray()){
            counter.put(ptr, counter.getOrDefault(ptr,0) + 1);
        }

        for( char ptr : t.toCharArray()){
            if(!counter.containsKey(ptr)){ //if theres a char in t that is not in string s then its automatically false
                return false;
            }
            counter.put(ptr, counter.get(ptr) - 1);
            if(counter.get(ptr) < 0){ //if this is less than 0 then that means this char appears more times in t than s
                return false;
            }
        }

        //all values in counter for all the keys need to be zero or else they are not exactly the same
        for(int count : counter.values()){
            if(count != 0) return false;
        }

        return true;

    }
}
