package ExtraQuestions;

class leetCode33 {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        // = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 3;
        // = 0; // output = 4
        System.out.print("Output : " + search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int pivot = findpivot(nums);
        // pivot == -1 means it is not rotated array
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if (target == nums[pivot]) {
            return pivot;
        }
        if (target < nums[0]) {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }

        return binarySearch(nums, target, 0, pivot - 1);
    }

    /**
     * Find pivote without duplicate elements
     * 
     * @param nums
     * @return
     */
    public static int findpivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (start < mid && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // This case is beacause the array do not contain duplicate numbers
            if (nums[start] >= nums[mid]) {
                end = mid - 1;
            } else if (nums[start] < nums[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    /**
     * find the pivot in array containing duplicate elements
     * 
     * @param nums
     * @return
     */
    public static int findpivotWithDuplicateElements(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (start < mid && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[start] == nums[mid] && nums[end] == nums[mid]) {
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                if (end > start && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}