// https://leetcode.com/problems/perfect-squares/ 
   public int numSquares(int n) {
        int[] res = new int[n+1];
        res[1] = 1;
        for (int i = 2; i <= n; i++) {
            res[i] = i;
            for (int j = 1; j <= Math.sqrt(i); j++)
                if (j*j==i)
                    res[i] = 1;
            else
                res[i] = Math.min(res[i], res[j*j]+res[i-j*j]);
        }
        return res[n];
    }
