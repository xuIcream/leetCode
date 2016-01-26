public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (nums.length < 3) {
            return list;
        }
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int pre = 1;
        for (int i = 0; i < nums.length - 2; i++) {
            final int current = nums[i];
            if (current > 0) {
                break;
            }
            if (current == pre) {
                continue;
            } else {
                pre = current;
            }
            int preNext= Integer.MAX_VALUE;
            for (int k = i + 1; k < nums.length - 1; k++) {

                final int next = nums[k];
                if (current + next + max < 0) {
                    continue;
                }
                if (preNext == next) {
                    continue;
                } else {
                    preNext = next;
                }
                for (int j = k + 1; j < nums.length; j++) {
                    if (current + next + nums[j] == 0) {
                        ArrayList<Integer> integers = new ArrayList<>();
                        integers.add(current);
                        integers.add(next);
                        integers.add(nums[j]);
                        list.add(integers);
                        break;
                    }
                }
            }
        }
        return list;
    }
}