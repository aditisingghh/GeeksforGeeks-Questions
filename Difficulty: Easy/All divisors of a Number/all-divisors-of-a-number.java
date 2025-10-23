class Solution {
    public static void print_divisors(int n) {
        // code here
        
        ArrayList<Integer>div=new ArrayList<>();
        ArrayList<Integer>sechalf=new ArrayList<>();
       
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
              div.add(i);
              
              if(i*i!=n)
              {
                  sechalf.add(n/i);
              }
            }
        }
        for(int i:div)
        {
           System.out.print(i+" "); 
        }
        
        Collections.reverse(sechalf);
        for(int i:sechalf)
        {
            System.out.print(i+" ");
        }
    }
    }

