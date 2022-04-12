class Solution {
    public boolean isAnagram(String s, String t) {
        //Using Array for HashMap
        
        if(s.length()!=t.length())
            return false;
        
        int[] count_s=new int[256];
        int[] count_t=new int[256];        
        
        for(int i=0;i<s.length();i++)
            count_s[s.charAt(i)]++;
        
        for(int i=0;i<t.length();i++)
            count_t[t.charAt(i)]++;
        
        for(int i=0;i<255;i++)
            if(count_s[i]!=count_t[i])
                return false;
        
        return true;
        //Time Complexity - O(len(string))
        //Space Complexity - O(1)
    }
}