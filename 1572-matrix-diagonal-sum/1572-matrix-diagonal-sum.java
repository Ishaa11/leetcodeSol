class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int len=mat.length;
        
        for(int i=0;i<len;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j){
                    sum+=mat[i][j];
                }
            }
        }
        
        for(int i=0,j=len-1;i<len && j>=0;i++){
            sum+=mat[i][j];
            j--;
        }
        
        if(len%2!=0){
            sum=sum-mat[len/2][len/2];
        }
        
        return sum;
    }
}