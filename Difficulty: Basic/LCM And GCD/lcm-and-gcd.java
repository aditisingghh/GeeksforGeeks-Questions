class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int tem=a;
        int te=b;
        int[]lg=new int[2];
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        
        int lcm=(tem*te)/a;
        lg[0]=lcm;
        lg[1]=a;
        return lg;
    }
    
}