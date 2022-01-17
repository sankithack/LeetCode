class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        m={}
        result=""
        k=0
        ss=s.split(" ")
        for i in ss:
            if i in m:
                result+=m[i]
            else:
                m[i]=str(k)+""
                result+=str(k)
                k+=1 
        m={}
        p_res=""
        k=0
        for i in pattern:
            if i in m:
                p_res+=m[i]
            else:
                m[i]=str(k)+""
                p_res+=str(k)
                k+=1
        if(result==p_res):
            return True
        else:
            return False
