class Solution {
    public void reverseString(char[] s) {
        for(int i=0,k=s.length-1;i<s.length/2;i++,k--){
            char tmp=s[i];
            s[i]=s[k];
            s[k]=tmp;
        } 
        //Time Complexity - O(N)
        //Space Complexity - O(1)
    }
}