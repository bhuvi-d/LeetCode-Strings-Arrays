class Solution {
    public int[] twoSum(int[] nums, int target) {
     int[] pop = new int[2];
      for (int i =0 ; i<nums.length ; i++){
            for (int j=(nums.length-1);j>=i+1;j--){
                if ((target - nums[i])==nums[j]){
                    pop[0]=i;
                    pop[1]=j;
                    return pop;
                }
            }
      }
     return pop;
    }
}
