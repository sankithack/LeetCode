class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        inp=s.split(" ")
        if(len(pattern)!=len(inp)):
            return False
        m={}
        for i in range(len(inp)):
            if pattern[i] in m:
                if (m[pattern[i]]!=inp[i]):
                    return False
            else:
                if(inp[i] in m.values()):
                    return False
                m[pattern[i]]=inp[i]
        return True