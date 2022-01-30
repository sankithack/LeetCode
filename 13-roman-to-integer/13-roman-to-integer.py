class Solution:
    def romanToInt(self, s: str) -> int:
        dict= {'M':1000 ,  'CM':900,  'D':500, 'CD': 400, 'C': 100, 'XC': 90, 'L':50, 'XL':40,  'X':10, 'IX':9, 'V':5,  'IV':4,  'I':1}
        result=0
        n=len(s)
        k=0
        while(k<n):
            if k<n-1:                
                if s[k:k+2] in dict:
                    result+=dict[s[k:k+2]]
                    k+=2
                    continue
            result+=dict[s[k]]
            k+=1
        return result