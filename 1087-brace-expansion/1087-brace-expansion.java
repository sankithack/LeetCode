class Solution {
    public String[] expand(String s) {
        List<String> expandedWords=Arrays.asList("");
        
        int startPos=0;
        while(startPos<s.length()){
            List<String> firstOptions=new ArrayList();
            
            int remCharPos=findFirstOptionsWord(s,startPos,firstOptions);
            List<String> currWords=new ArrayList();
            
            for(String word:expandedWords){
                for(String frstOpt:firstOptions){
                    currWords.add(word+frstOpt);
                }
            }
            expandedWords=currWords;
            startPos=remCharPos;
            
        }
        return expandedWords.toArray(new String[0]);
        //Time Compexity - O(N * 3^(N/7))
        //Space Compexity - O(N * 3^(N/7))
    }
    
    private int findFirstOptionsWord(String s,int startPos,List<String> firstOptions){
        
        // if first character is not '{' then there is only one character
        if(s.charAt(startPos)!='{'){
            firstOptions.add(String.valueOf(s.charAt(startPos)));
        }
        else{
            while(s.charAt(startPos)!='}'){
                if(s.charAt(startPos)>='a' && s.charAt(startPos)<='z')
                firstOptions.add(String.valueOf(s.charAt(startPos)));
                startPos++;
            }
        }
        Collections.sort(firstOptions);
            
        return startPos+1;
    }
}