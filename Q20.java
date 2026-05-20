class Solution {
    public int subarraySum(int[] nums, int k) {
        int postfixsum = 0;
int count = 0;

HashMap<Integer, Integer> map = new HashMap<>();

map.put(0, 1);

for (int n : nums) {

    postfixsum += n;

    if (map.containsKey(postfixsum - k)) {

        count += map.get(postfixsum - k);
    }

    map.put(postfixsum,
            map.getOrDefault(postfixsum, 0) + 1);
}

return count;
    }
}
