package hw4;

public class KthLargest {
	
	public int findKthLargest(int[] nums, int k) {
	       int max = Integer.MIN_VALUE;
	       int min = Integer.MAX_VALUE;
	       for(int num : nums){
	           max = Math.max(max, num);
	           min = Math.min(min, num);
	       }
	        int[] bucket = new int[max-min+1];
	       for(int i=0; i<nums.length; i++){
	           bucket[nums[i] - min]++;
	       }
	        int count = 0; 
	        for(int j=bucket.length-1; j>=0; j--){                       
	            count += bucket[j];
	            if(count >= k) return j+min;
	            
	        }

	        return -1;
	}

	public static void main(String[] args) {
	int [] nums= {4,2,8,78,6,9,5,6,2,22,5,7};
	int k= 3;
	KthLargest test = new KthLargest();
	System.out.println("K= "+k);
    System.out.println("Output: "+test.findKthLargest(nums, k));
	

	}

}
