class Solution {
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        int j = nums.length - 1;
        int i = 0;
        if(nums.length == 1 && nums[0] == val){
            return 0;
        }
            while(i <= j) {
                if(nums[j] == val) {
                    j--;
                    counter++;
                }
                 else if(nums[i] == val) {
                    nums[i] = nums[j];
                    nums[j] = val;
                    j--;
                    counter++;
                }
                if(nums[i] != val){
                    i++;
                }
            }
        return nums.length - counter;
    }
}