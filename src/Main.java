public class Main {
    public static void main(String[] args) {
        int[] testArray = {-1, 0, 3, 5, 9, 12};
        int target = 12;
        System.out.println(new Solution().search(testArray, target));
    }
}

class Solution {
    public int search(int[] nums, int target) {
        int left = 0; // initialize left pointer to 0
        int right = nums.length - 1; // initialize right pointer to the last index of the array

        while (left <= right) { // continue the loop till left pointer is less than or equal to right pointer
            int mid = left + (right - left) / 2; // calculate the middle index of the array

            if (nums[mid] == target) { // check if the middle element is equal to target
                return mid; // return the middle index
            } else if (nums[mid] < target) { // check if the middle element is less than target
                left = mid + 1; // move the left pointer to the right of middle element
            } else { // if the middle element is greater than target
                right = mid - 1; // move the right pointer to the left of middle element
            }
        }

        return -1; // target not found in the array
    }
}



// AS ALWAYS, RIGHT GENERAL IDEA, BUT NOT QUITE
//class Solution {
//    public int search(int[] nums, int target) {
//        int arrayIndex = nums.length / 2;
//        while (nums[arrayIndex] != target) {
//            if (nums[arrayIndex] > target) {
//                arrayIndex /= 2;
//            } else if (nums[arrayIndex] < target) { // this is too much dicking around where if i want index 5 but its at
//                // 4 then i multipy to get 6 but that's too much so i go back to 3 then multipy to get 4.5 which rounds to
//                //5. thre is a better way, lets find out what it is.
//                if ((arrayIndex *= 1.5) > nums.length - 1) {
//                    arrayIndex = nums.length - 1;
//                } else {
//                    arrayIndex *= 1.5;
//                }
//            }
//        }
//        return arrayIndex;
//    }
//}