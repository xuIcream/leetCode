public class LengthOfLongestSubstring  {
	
	public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if (length <= 1) {
            return length;
        }
        char[] chars = new char[length];
        s.getChars(0, length, chars, 0);
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int start = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            Integer integer = map.get(c);
            start = Math.max(integer != null ? integer + 1 : start, start);
            max = Math.max(max, i - start + 1);
            map.put(c, i);
        }
        return max;

    } 
}