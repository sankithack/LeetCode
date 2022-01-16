class Solution:
    def minMoves(self, target: int, maxDoubles: int) -> int:
        n=target
        res=0
        while(n>1):
            if(maxDoubles==0):
                res+=(n-1)
                break                
            if(n%2==0 and maxDoubles>0):
                n=n/2
                maxDoubles-=1
                res+=1
            else:
                n=n-1
                res+=1
        return int(res)