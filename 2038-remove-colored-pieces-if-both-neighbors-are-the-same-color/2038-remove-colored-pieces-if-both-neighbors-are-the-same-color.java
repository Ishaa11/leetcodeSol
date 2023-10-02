class Solution {
    public boolean winnerOfGame(String colors) {
        int countA = 0;
        int countB = 0;
        
        for (int i = 0; i < colors.length(); i++) {
            char x = colors.charAt(i);
            int count = 0;
            
            while (i < colors.length() && colors.charAt(i) == x) {
                i++;
                count++;
            }
            
            if (x == 'A') {
                countA += Math.max(count - 2, 0);
            } else if (x == 'B') {
                countB += Math.max(count - 2, 0);
            }
            
            i--;
        }

        return countA > countB;
    }
}