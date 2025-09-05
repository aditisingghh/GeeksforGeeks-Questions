class Solution {
    public int countDigits(int n) {
        int count=0;
        int rem=0;
        int x=n;
        while(x>0)
        {
            rem=x%10;
            count++;
            x=x/10;
        }
        return count;
        
    }
}
