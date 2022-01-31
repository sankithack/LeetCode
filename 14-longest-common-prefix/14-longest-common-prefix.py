class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        sorted_array=sorted(strs)
        i=0
        res=""
        for i in range(0,len(sorted_array[0])):
            if sorted_array[0][i]==sorted_array[-1][i]:
                res+=sorted_array[0][i]
            else:
                return res
        return res
            
        
            
        