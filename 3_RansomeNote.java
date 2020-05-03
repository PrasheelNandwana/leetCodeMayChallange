class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[256];
        for(int i=0;i<magazine.length();i++)
        {
            ++freq[magazine.charAt(i)];
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            if(freq[ransomNote.charAt(i)]==0)
                return false;
            else
                --freq[ransomNote.charAt(i)];
        }
        return true;
    }
}
