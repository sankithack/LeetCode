class Solution:   
    def mostPoints(self, questions: List[List[int]]) -> int:
        m={}
        def getpoints(idx,questions,n):
            if idx in m:
                return m[idx]
            if(idx>=n):
                return 0;
            if(idx==n-1):
                return questions[idx][0];
            s=questions[idx][0]+getpoints(idx+ 1 + questions[idx][1],questions,n)
            i=0+getpoints(idx+1,questions,n)
            m[idx]=max(s,i)
            return m[idx]
        n=len(questions)
        return getpoints(0,questions,n)        
        

        
        