public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int counter = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public int maxNumberOfBalloons(String text) {
        int[] charCount = new int[26];

        for (char c : text.toCharArray()) {
            charCount[c - 'a']++;
        }

        int min = charCount['b' - 'a'];
        min = Math.min(min, charCount['a' - 'a']);
        min = Math.min(min, charCount['l' - 'a'] / 2);
        min = Math.min(min, charCount['o' - 'a'] / 2);
        min = Math.min(min, charCount['n' - 'a']);

        return min;
    }

    public int numIdenticalPairs(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    counter++;
                }
            }
        }
        return counter;
    }
}