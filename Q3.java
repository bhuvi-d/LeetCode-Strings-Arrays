//rev 1 len of set can also be used 
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for(int i =0 ; i< nums.length ;i++){
            if (map.contains(nums[i])){
                return true;
            }
            else{
                map.add(nums[i]);
            }
        }
        return false;
    }
}
