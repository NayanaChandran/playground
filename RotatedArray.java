/**
* Leetcode 33 : Search in rotated sorted array
* Given an array that is rotated at some pivoted index, determine if an element exists in the array or not
*  @intput -  nums[] = [4,5,6,7,0,1,2], target = 0
*  @output - index fof the element id exits, -1 otherwise
*/

public class RotatedArray {

public int search(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if(nums[mid] == target) return mid;
           // Standard binary search template till here
           /*If we found our element in the middle at the first attempt, excellent.
           * In the first iteration, if the number in the middle is greater than the number at i = 0, then we know that 
           * the array is sorted from 0 to mid (atleast)
           */
            else if (nums[mid] >= nums[left]) {
            	//check if target exists in the array between 0 and mid to run binary search in that part of the array (left part this iteration)
                if( target >= nums[left] && nums[mid] > target) right = mid - 1;
                else left = mid +1;
            }
            else {
            	//if we are here, then we know that the element in the mid is less than the element at zero, which means we are past the pivot point
            	//look for target here, the normal binary search way
                if(target <= nums[right] && nums[mid] < target) left = mid + 1;
                else right = mid -1;
            }
        }
        return -1;
    }

}