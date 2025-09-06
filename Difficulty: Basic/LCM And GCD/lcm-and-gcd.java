class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int x=a;
        int y=b;
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        int gcd=a;
        
        int lcm=Math.abs(x/gcd*y);
        
        return new int[]{lcm,gcd};
    }
    
}