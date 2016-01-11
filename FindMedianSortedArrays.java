public class FindMedianSortedArrays {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int count = nums1.length + nums2.length;
        int index = count / 2;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] nums = new int[2];
        while (i < nums1.length && j < nums2.length) {
            int value;
            if (nums1[i] < nums2[j]) {
                value = nums1[i++];
            } else {
                value = nums2[j++];
            }
            if (k == index - 1) {
                nums[0] = value;
            }
            if (k == index) {
                nums[1] = value;
                break;
            }
            k++;
        }
        if (k <= index && nums[1] == 0) {
            while (i < nums1.length) {
                if (k == index) {
                    nums[1] = nums1[i];
                    break;
                }
                i++;
                k++;
            }
            while (j < nums2.length) {
                if (k == index) {
                    nums[1] = nums2[j];
                    break;
                }
                j++;
                k++;
            }
        }

        if (count % 2 == 0) {
            return (nums[0] + nums[1]) / 2d;
        } else {
            return nums[1];
        }
    }
}