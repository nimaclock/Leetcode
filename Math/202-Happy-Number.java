// https://leetcode.com/problems/happy-number/
class Solution {

    public boolean isHappy(int n) {
        int fast = n, slow = n;
        while(true) {
            slow = ssum(slow);
            fast = ssum(fast);
            fast = ssum(fast);
            if (slow == 1) return true;
            if (slow == fast) return false;
        }
    }

    public boolean isHappy_dumb(int n) {
        Set<Integer> seen = new HashSet<>();
        while(true) {
            int sum = 0;
            while (n > 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            if (sum == 1) return true;
            if (seen.contains(sum)) return false;
            seen.add(sum);
            n = sum;
        }
    }

    public int ssum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return sum;
    }
}
