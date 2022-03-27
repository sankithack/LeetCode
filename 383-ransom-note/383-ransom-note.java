class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //Using Array as HashMap
        int[] count_magazine=new int[256];
        int[] count_ransomNote=new int[256];
        
        for(int i=0;i<magazine.length();i++)
            count_magazine[magazine.charAt(i)]++;
        
        for(int i=0;i<ransomNote.length();i++)
            count_ransomNote[ransomNote.charAt(i)]++;
        
        for(int i=0;i<ransomNote.length();i++){
            if(count_magazine[ransomNote.charAt(i)]<count_ransomNote[ransomNote.charAt(i)])
                return false;
        }
        return true;
        //Time Complexity - O(Max(len(ransomNote),len(magazine)))
        //Space Complexity - O(1)
    }
}