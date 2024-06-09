import java.util.*;

public class Exercise {
    public int findSingleNumber(int[] nums) {
        // write your code here
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i <= nums.length - 1; i++) {
            if(set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }
}
