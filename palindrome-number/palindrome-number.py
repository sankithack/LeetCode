class Solution:
    def isPalindrome(self, x: int) -> bool:
        k=str(x)
        if(k==k[::-1]):
            return True
        else:
            return False
        
        