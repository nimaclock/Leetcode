class Solution {
    public String defangIPaddr(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '.') {
                res += "[.]";
            } else {
                res += s.charAt(i);
            }
        }
        return res;
    }
}
