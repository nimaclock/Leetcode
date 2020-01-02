// https://leetcode.com/problems/roman-to-integer/
class Solution {
    public int romanToInt(String s) {
        char[] c = s.toCharArray();
        int m = s.length();
        int res = 0;
        Map<Character, Integer> mmp = new HashMap<>();
        mmp.put('I', 1);
        mmp.put('V', 5);
        mmp.put('X', 10);
        mmp.put('L', 50);
        mmp.put('C', 100);
        mmp.put('D', 500);
        mmp.put('M', 1000);
        for (int i = 0; i < m; i++) {
            int value = mmp.get(c[i]);
            int next_value = 0;
            if (i+1 < m)
                next_value = mmp.get(c[i+1]);
            if (next_value > value)
                res -= value;
            else
                res += value;
        }
        return res;
    }
}
