class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
         if(arr==null||arr.length<2)
         {
             return -1;
         }
         
         int largest=Integer.MIN_VALUE;
         int slargest=Integer.MIN_VALUE;
         for(int num:arr)
         {
             if(num>largest)
             {
                 slargest=largest;
                 largest=num;
             }
             else if(num>slargest&&num!=largest)
             {
                 slargest=num;
             }
         }
         if(slargest==Integer.MIN_VALUE)
         {
             return -1;
         }
         
         return slargest; 
    }
}