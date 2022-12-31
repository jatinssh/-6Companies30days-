class Solution {
    public int[] shuffle(int[] nums, int n) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i]= nums[i] + nums[j];
            }
        }
    }
}