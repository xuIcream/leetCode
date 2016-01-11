public class LongestPalindromicSubString {

	private String longestPalindromicSubString(String string) {
        if (string == null) {
            return null;
        }
        int length = string.length();
        if (length == 1) {
            return string;
        }
        int[] index = new int[]{0, 1};
        for (int i = 0; i < length; i++) {
            int[] help = help(string, i, i + 1);
            if (help[1] - help[0] > index[1] - index[0]) {
                index[1] = help[1];
                index[0] = help[0];
            }
            help = help(string, i - 1, i + 1);
            if (help[1] - help[0] > index[1] - index[0]) {
                index[1] = help[1];
                index[0] = help[0];
            }
        }
        return string.substring(index[0], index[1]);
    }

    private int[] help(String string, int left, int right) {
        int length = string.length();
        while (left >= 0 && right < length) {
            if (string.charAt(left) == string.charAt(right)) {
                left--;
                right++;
            } else {
                break;
            }
        }
        return new int[]{left + 1, right};
    }
}