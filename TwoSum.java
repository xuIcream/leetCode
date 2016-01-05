public class TwoSum {

	private int[] twoSum(int[] nums, int target) {
		//暴力　但也通过了
        /*for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return null;*/
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int j = target - nums[i];
            Integer integer = map.get(j);
            if (integer != null && integer != i) {
                return new int[]{i + 1, integer + 1};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}