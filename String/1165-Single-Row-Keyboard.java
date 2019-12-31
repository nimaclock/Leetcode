class Solution {
    public int calculateTime(String keyboard, String word) {
        int[] order = new int[128];
        int res = 0;
        for (int i = 0; i < 26; i++)
            order[keyboard.charAt(i)] = i;
        for (int i = 1; i < word.length(); i++)
            res += Math.abs(order[word.charAt(i)] - order[word.charAt(i-1)]);
        return res+order[word.charAt(0)];
    }
}
