// https://leetcode.com/problems/counting-bits/

// optimal 
   public int[] countBits(int num) {
        int[] res = new int[num+1];
        for (int i = 0; i <= num; i++)
            res[i] = res[i >> 1] + (i & 1);
        return res;
    }

// personal
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        res[0] = 0;
        if (num >=1) res[1] = 1;
        int rem = 2;
        for (int i = 2; i <= num; i++) {
            if (i > rem*2) rem *= 2;
            res[i] = res[i%rem] + 1;
        }
        return res;
    }
