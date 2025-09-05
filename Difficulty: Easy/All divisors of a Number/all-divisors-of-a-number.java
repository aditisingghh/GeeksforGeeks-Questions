class Solution {
    public static void print_divisors(int n) {
        // code here
        List<Integer>div=new ArrayList<>();
        List<Integer>divv=new ArrayList<>();
        //int d=0;
        for(int d=1;d*d<=n;d++)
        {
            if(n%d==0)
            {
                div.add(d);
            
             if(d!=n/d)
            {
                divv.add(n/d);
            }
            }
        }
        Collections.reverse(divv);
        div.addAll(divv);
        
        for(int i:div)
        {
            System.out.print(i+" ");
        }
    }
}
