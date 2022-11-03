class Solution {
    public int longestPalindrome(String[] words) {
         int[][] counting = new int[26][26];
        int ans = 0;
        for (String word : words) {
            int a = word.charAt(0) - 'a';
            int b = word.charAt(1) - 'a';
            if (counting[b][a] > 0) {
                ans += 4;
                counting[b][a]--;
            } else {
                counting[a][b]++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (counting[i][i] > 0) {
                ans += 2;
                break;
            }
        }
        return ans;
    }
}