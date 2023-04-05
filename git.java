
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		int[] ans=new int[10];
		int[] nums = {2,7,11,15}; 
// 		int[] nums1 = {2,7,11,15}; 
		int target = 9;
		    for(int i=0; i<nums.length; i++){
		      for(int j=i+1; j<nums.length; j++){
		            if(nums[i]+nums[j]==target){
		                ans[0]=i;
		                ans[1]=j;
		               System.out.println(i);
		                 System.out.println(j);
		            }
		      }        
		    }
	            	       
	}
}