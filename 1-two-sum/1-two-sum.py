class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict={}
        for i,ele in enumerate(nums):
            k=target-ele
            if k in dict:
                return [dict[k],i]
            else:
                dict[ele]=i
        return []
        