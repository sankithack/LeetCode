class Solution:
    def romanToInt(self, s: str) -> int:
        dict= {'M':1000 ,   'D':500,  'C': 100,  'L':50,   'X':10, 'V':5,  'I':1}
        result=0
        n=len(s)
        for i in range(0,n):
            if i+1<n and dict[s[i]]<dict[s[i+1]]:
                result-=dict[s[i]]
            else:
                result+=dict[s[i]]
        return result