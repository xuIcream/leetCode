public class ThreeSumClosest {

	public int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3) {
            return Integer.MAX_VALUE;
        }
        Arrays.sort(nums);
        int midDiff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int diff = nums[i] + nums[left] + nums[right] - target;
                if (Math.abs(midDiff) > Math.abs(diff)) {
                    midDiff =  diff;
                }
                if (diff == 0) {
                    break;
                } else if (diff > 0) {
                    right--;
                } else {
                    left++;
                }
            }

        }
        return target + midDiff;
    }
}