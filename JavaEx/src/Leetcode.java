import java.util.Arrays;

public class Leetcode {
	public int threeSumClosest(int[] nums, int target) {
        int res = target > 0 ? Integer.MAX_VALUE-1: Integer.MIN_VALUE+1;
	    	Arrays.sort(nums);
			for (int i = 0; i+2 < nums.length; i++) {
				int subsum = target-nums[i];
				int k=i+1,j=nums.length-1;
				while(k<j){
					int sum = nums[k]+nums[j];
					if(Math.abs(subsum-sum)<Math.abs(res-target))
						res = nums[i] + sum;
					if(sum<subsum )
						k++;
					if(sum>subsum )
						j--;
					if(sum==subsum)
						return res;
				}
			}
	        return res;
    }
}
