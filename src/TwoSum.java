import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Time Complexity: O(n) Single traverse through array.
// Space Complexity: O(n) Map contains almost n elements.
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {1,2,4,5,9};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment), i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("Two Sum not found!!");
    }
}




