// using bitwise operator

public class Exercise {
    public int findSingleNumber(int[] nums) {
        int temp = 0;
        for(int i : nums) {
            temp = temp ^ i;
        }
        return temp;
    }
}
