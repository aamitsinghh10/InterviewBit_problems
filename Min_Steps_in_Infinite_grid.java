public class Solution {
    public int coverPoints(int[] A, int[] B) 
    {
        int count = 0;
        
        for(int i=1;i<A.length;i++)
        {   
            int a1 = Math.abs(A[i]-A[i-1]);
            int a2 = Math.abs(B[i]-B[i-1]);
            
            count+=Math.max(a1,a2);
            
        }
        return count;
    }
}


