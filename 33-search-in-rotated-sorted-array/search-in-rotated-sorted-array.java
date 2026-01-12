class Solution {
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Step 1: Found target
            if (nums[mid] == target) {
                return mid;
            }

            // Step 2: Left half is sorted
            if (nums[low] <= nums[mid]) {

                // Check if target lies in left half
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            }
            // Step 3: Right half is sorted
            else {

                // Check if target lies in right half
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1; // Target not found
    }
}
