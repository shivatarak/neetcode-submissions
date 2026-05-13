class Solution {
    public boolean checkInclusion(String s1, String s2) {
      int a[]=new int[26];
      int b[]=new int[26];
      int n1=s1.length();
      int n2=s2.length();
      if(n1>n2){
        return false;
      } 
      for(char c:s1.toCharArray()){
        a[c-'a']++;
      }
      int i=0;
      int j=0;
      while(j<n2){
        b[s2.charAt(j)-'a']++;
        if((j-i+1)>n1){
          b[s2.charAt(i)-'a']--;
          i++;
        }
        if((j-i+1)==n1){
          if(matches(a,b)) {
            return true;
          }
        }
        j++;
      }
      return false;
    }
    private boolean matches(int[] a,int[] b){
      for(int i=0;i<26;i++){
        if(a[i]!=b[i]){
          return false;
        }
      }
      return true;
    }
}
