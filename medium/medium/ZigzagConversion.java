class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;
        StringBuilder ans = new StringBuilder (s.length());
        int cycle = 2 * numRows - 2;
        
        for (int row = 0; row < numRows; row++) {
            for (int k = 0; k + row < s.length(); k += cycle) {
                ans.append(s.charAt(k + row));
                if (row != 0 && row != numRows -1) {
                    int j = k + cycle - row; 
                    if (j < s.length()) ans.append(s.charAt(j));
                }
            }
        }
        return ans.toString();
    }
}
