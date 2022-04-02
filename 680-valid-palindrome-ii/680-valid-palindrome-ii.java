class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        
        while(i<j){
            //Found a Mismatched pair - try both deletions
            if (s.charAt(i)!=s.charAt(j)){
                return (checkPalindrome(s,i,j-1) || checkPalindrome(s,i+1,j));
            }
            i++;
            j--;
        }
        return true;
               
    }
    public boolean checkPalindrome(String s,int l,int r){
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
    // Time Complexity - O(N)
    // Space Complexity - O(1)
}