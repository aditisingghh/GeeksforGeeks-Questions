class Solution {
    public int countDigits(int n) {
        // code here
        int rem=0;
        int num=n;
        int count=0;
        while(num>0)
        {
            rem=num%10;
            count++;
            num=num/10;
        }
        return count;
    }
}
