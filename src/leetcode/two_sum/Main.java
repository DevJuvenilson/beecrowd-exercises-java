void main() {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int i = 0;
            int j = nums.length - 1;

            int[] result = new int[2];

            while (i < j) {
                int sum = nums[i] + nums[j];

                if (sum == target) {
                    result[0] = nums[i];
                    result[1] = nums[j];
                    return result;
                }

                if (sum > target) {
                    j-=1;
                }
                if (sum < target) {
                    i+=1;
                }

            }
            return result;
        }
    }
}