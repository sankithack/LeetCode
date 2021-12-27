class Solution:
    def isSameAfterReversals(self, num: int) -> bool:
        if(num==0):
            return True
        if(num==((int)(num/10))*10):
            return False
        return True
            
