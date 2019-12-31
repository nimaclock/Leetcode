class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int temp = -1;
        for (int i = n-2; i >= 0; i--) {
            int max = Math.max(temp, arr[i]);
            arr[i] = Math.max(arr[i+1], temp);
            temp = max;
            }
        arr[n-1] = -1;
        return arr;
    }
}
