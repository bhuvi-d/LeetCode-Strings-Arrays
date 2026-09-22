# Minimum size subarray sum 
# updated as part of revision 1 

class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        min_length= float('inf')

        left=0
        sum_current=nums[left]
        right=0
        while (right<len(nums)):
        
            if sum_current>=target:
                if (right-left+1)<min_length:
                    min_length=right-left+1
                sum_current=sum_current-nums[left]
                left=left+1
                
                
            
            elif sum_current<target:
                if right>=len(nums)-1:
                    break
                sum_current=sum_current+nums[right+1]
                right=right+1

        if min_length==float('inf'):
            return (0)
        else:
            return (min_length) 

                        

