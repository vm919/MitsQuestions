class Solution {
    public int search(int[] nums, int target) {      
        int minEleIndex = findMin(nums);
        int start = 0;
        int end = nums.length-1;

        
        if(target >= nums[minEleIndex] && target <= nums[end]){
           return binarySearch(minEleIndex, end, target, nums);
        }
        
        else{
           return binarySearch(start, minEleIndex-1, target, nums);
        }
     
    }
        
    private int binarySearch(int start, int end, int target, int nums[]){
       
       while(start<=end){
         int mid = (start+end)/2;
         if(target == nums[mid])
             return mid;
         
         if(target > nums[mid]){
             start = mid+1;
         }
         else{
             end = mid-1;
         }
             
       }
       return -1;
   }     
   
    private int findMin(int[] nums) {
            int start = 0;
            int end = nums.length-1;

            if(nums[start] < nums[end])
                return start;

            while(start<=end){
                int mid = (start+end)/2;

                if(mid+1 < nums.length && nums[mid]>nums[mid+1])
                    return mid+1;

                if(mid-1 >= 0 && nums[mid]<nums[mid-1])
                    return mid;

                if (nums[start] < nums[mid]){
                    start = mid+1;
                }   
                else{
                    end = mid-1;    
                }    

            }
            return start;
    }
}