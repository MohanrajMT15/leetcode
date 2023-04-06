
class Solution {
    public int reverse(int x) {
     long reverse=0;
       for( ;x != 0; x = x/10){
		      int i = x % 10;
		      reverse = reverse * 10 + i; 
            }  
                if(reverse<-2147483648||reverse>2147483647){
                return 0;
            }
                return (int) reverse;
    }
}