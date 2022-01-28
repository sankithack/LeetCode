class Solution:
    def isValid(self, s: str) -> bool:
        m=[]
        for i in s:
            if i in ['(', '{', '[']:
                m.append(i)
            elif(i==')' and len(m)!=0 and m[-1]=='('):
                m.pop()
            elif(i=='}' and len(m)!=0 and m[-1]=='{'):
                m.pop()
            elif(i==']' and len(m)!=0 and m[-1]=='['):
                m.pop()
            else:
                return False
        return m==[]

        