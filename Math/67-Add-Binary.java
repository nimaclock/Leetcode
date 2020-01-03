// https://leetcode.com/problems/add-binary/
class Solution {
    public String addBinary(String a, String b) {
        char[] achar = a.toCharArray();
        char[] bchar = b.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        int ptr1 = a.length() - 1, ptr2 = b.length() - 1;
        int rem = 0;
        while (ptr1 >= 0 || ptr2 >= 0 || rem > 0) {
            int num1 = 0, num2 = 0;
            if (ptr1 >= 0) {
                num1 = achar[ptr1] - '0';
                ptr1--;
            }
            if (ptr2 >= 0) {
                num2 = bchar[ptr2] - '0';
                ptr2--;
            }
            int sum = num1 + num2 + rem;
            rem = sum / 2;
            sb.append(sum % 2);
        }
        return sb.reverse().toString();
    }
}
