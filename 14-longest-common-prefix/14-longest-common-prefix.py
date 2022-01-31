class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        def check(str1,str2):
            res=""
            n1=len(str1)
            n2=len(str2)
            if n2==0 or n2==0:
                return ""
            for i in range(0,min(n1,n2)):
                if(str1[i]==str2[i]):
                    res+=str1[i]
                else:
                    return res
            return res 
        res=strs[0]
        for i in strs:
            res=check(res,i)
        return res
            
        