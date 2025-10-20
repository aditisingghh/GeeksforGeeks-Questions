class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int ceven=0;
        int codd=0;
        
        int[]count=new int[2];
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                ceven++;
            }
            else{
                codd++;
            }
        }
        count[1]=ceven;
        count[0]=codd;
        return count;
    }
}