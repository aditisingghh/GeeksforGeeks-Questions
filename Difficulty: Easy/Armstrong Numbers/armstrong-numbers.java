// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp=n;
        int sum=0;
        while(temp>0)
        {
            int rem=temp%10;
            temp=temp/10;
            int remm=rem*rem*rem;
            sum=sum+remm;
        }
        if(sum==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}