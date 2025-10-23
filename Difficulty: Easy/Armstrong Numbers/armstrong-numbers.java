// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
  // int prod=0;
 int sum=0;
  int x=n;
  while(n>0)
  {
      int rem=0;
      
      rem=n%10;
      sum+=rem*rem*rem;
      n=n/10;
  }
  return x==sum;
    }
}