class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int max = 0;
        int i = 0;
        int j = 0;
        int window = 0;
        int maxwin = 0;
        int freq[] = new int[26];
        
        while (j < n) {
            char c = s.charAt(j);
            freq[c - 'A']++;
            max = Math.max(max, freq[c - 'A']);
            
            window = j - i + 1;
            
            if (window - max > k) {
                freq[s.charAt(i) - 'A']--; 
                i++;
                window = j - i + 1; 
            }
            
            maxwin = Math.max(maxwin, window);
            j++;
        }
        return maxwin;
    }
}