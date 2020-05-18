class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq= new int[26];
        for(int i=0;i<s1.length();i++)
        {
            ++freq[s1.charAt(i)-'a'];
        }
        for(int i=0;i<=s2.length()-s1.length();i++)
        {
            if(freqCheck(s2,freq,i,s1.length()))
                return true;
        }
        return false;
    }
    boolean freqCheck(String s,int[] ar,int start,int len)
    {
        int[] freq= new int[26];
        for(int i=0;i<ar.length;i++)
            freq[i]=ar[i];
        
        for(int i=start;i<start+len;i++)
        {
            if(freq[s.charAt(i)-'a']==0)
                return false;
            else 
                --freq[s.charAt(i)-'a'];
        }
        return true;
    }
}
