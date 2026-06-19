class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int i=0;
        int j=0;
        int max=0;
        int ans=0;
        HashMap<Character,Integer>map=new HashMap<>();
        while(j<n){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            max=Math.max(max,map.get(ch));
            if((j-i+1)-max>k){
                char ch1=s.charAt(i);
                map.put(ch1,map.get(ch1)-1);
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}