class Solution {
    public int maxOperations(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String t = sb.toString();
        
        int firstZeroIndex = -1;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '0') {
                firstZeroIndex = i;
                break;
            }
        }
        
        if (firstZeroIndex == -1) {
            // No '0' found, all characters are '1', no operations needed
            return 0;
        }
        
        int power = 1;
        int ans = 0;
        
        for (int i = firstZeroIndex; i < t.length(); i++) {
            if (t.charAt(i) == '1') {
                int count = 0;
                while (i < t.length() && t.charAt(i) == '1') {
                    count++;
                    i++;
                }
                ans += power * count;
                power++;
            }
        }
        
        return ans;
    }
}
