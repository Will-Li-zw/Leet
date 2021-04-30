//brute force
class Solution {
    public String longestPalindrome(String s) {
        int length=s.length();
        String answer;
        for (int i=0;i<length;i++){
            for (int j=0; j<=i;j++){
                int start=j;
                int end=length-i+start-1;
                while (true){
                    if (s.charAt(start)!=s.charAt(end)){
                        break;
                    }
                    if (end-start<=1){
                        answer=s.substring(j,length-i+j);
                        return answer;
                    }
                    start=start+1;
                    end=end-1;
                }
            }
        }
        
        return null;
    }
}
