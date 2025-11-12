public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        //optimal solution with HASHMAPS -> allows O(1) lookups to check if number exists
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int numNeeded = target - nums[i];

            System.out.println("numNeeded: " + numNeeded + " current number: " + nums[i] + " i: " + i + " target: " + target);

            if(map.containsKey(numNeeded)){
                return new int[]{map.get(numNeeded), i};
            }

            map.put(nums[i], i);

        }

        return new int[]{};
    }
}
