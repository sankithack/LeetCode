class Solution:
    def minMoves(self, target: int, maxDoubles: int) -> int:
        n=target
        res=0
        while(n>1 and maxDoubles>0):
            res += 1 + n % 2
            maxDoubles -= 1
            n>>=1
        return n - 1 + res            
        