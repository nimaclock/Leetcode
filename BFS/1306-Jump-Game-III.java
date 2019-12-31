class Solution {
    public boolean canReach(int[] arr, int idx) {
        if (idx < 0 || idx >= arr.length || arr[idx] == -1) return false;
        if (arr[idx] == 0) return true;
        int tmp = arr[idx];
        arr[idx] = -1;
        return canReach(arr, idx-tmp) || canReach(arr, idx+tmp);
    }
}
