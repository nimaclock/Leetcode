// https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int rev = 0;
        int temp = x;
        while(x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev == temp;
    }
    
    // Convert to string
    public boolean isPalindrome1(int x) {
        String s = String.valueOf(x);
        char[] c = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while(i < j) {
            if (c[i] != c[j]) return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}
