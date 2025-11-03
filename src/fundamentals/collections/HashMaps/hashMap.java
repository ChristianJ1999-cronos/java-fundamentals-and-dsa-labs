import java.util.HashMap;

public class ValidAnagramDemo {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        // 1. Build frequency map for s
        HashMap<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // 2. Subtract frequencies using t
        for (char c : t.toCharArray()) {
            if (!count.containsKey(c)) return false;
            count.put(c, count.get(c) - 1);

            if (count.get(c) == 0) {
                count.remove(c);
            }
        }

        // 3. If map is empty → anagram
        return count.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("rat", "car"));         // false
    }
}
