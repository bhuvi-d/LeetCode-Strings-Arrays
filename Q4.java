class Solution {
    public int maxSubArray(int[] sample) {
    int currentsum= sample[0];
    int maxsum = sample[0];
    ArrayList<Integer> nums = new ArrayList<>();
    for (int i =1;i<sample.length;i++) {
        currentsum = Math.max(sample[i], sample[i] + currentsum);
        maxsum = Math.max(maxsum, currentsum);
    }
    return maxsum;

}
    }
