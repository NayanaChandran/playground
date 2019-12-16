
/*
* Leetcode 153 - Find minimum in rotated sorted array

* This is a varitaion of Leetcode 33, where we find the pivot index
* The pivot index is essentially the index of the minimum element in the array
*/

public class FindMin {

public int findMin(int[] nums) {
        
        if(nums.length == 0 || nums == null) return -1;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.min(nums[0], nums[1]);

        int low = 0;
        int high = nums.length - 1;
        //if array is not pivoted, simply return the first element of the array
        if( nums[low] < nums[high]) return nums[low];
        while(low <= high) {
            int mid = low + (high - low)/2;
            /* At this point, we have two choices
			* either the mid element is the pivot index 
			* or the element before mid is the largest element in the array, which makes the next index the pivot index
            */
            if(nums[mid] > nums[mid+1]) return nums[mid + 1];

            if(nums[mid - 1] > nums[mid]) return nums[mid];
            //standard binary search code
            if( nums[mid] > nums[low]) low = mid +1;
            else high = mid - 1;
        }
        return -1;
    }

}