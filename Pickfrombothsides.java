public class Solution {
    public int solve(int[] A, int B) 
    {
        int maxi_sum = 0;
        int res = Integer.MIN_VALUE;
        //calculated sum
        for(int i=0;i<B;i++){
            maxi_sum+=A[i];
        }
        int j = A.length-1;
        for(int i=B-1;i>=0;i--)
        {
            maxi_sum = maxi_sum - A[i]+A[j];
            res = Math.max(res, maxi_sum);
            j--;
        }
        return res;
    }
}




EXAMPLE
Input 1:

 A = [5, -2, 3 , 1, 2]
 B = 3
Input 2:

 A = [1, 2]
 B = 1
