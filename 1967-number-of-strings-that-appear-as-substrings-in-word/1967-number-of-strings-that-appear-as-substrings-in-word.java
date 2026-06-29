class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ans=0;

        for(String ch:patterns){
            if(word.contains(ch)){
                ans++;
            }
        }
        return ans;
    }
}