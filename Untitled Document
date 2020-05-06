//Using Array
class Solution {
    public int firstUniqChar(String s) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++)
        {
       
            arr[(int)(s.charAt(i)-'a')]++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(arr[(int)(s.charAt(i)-'a')]==1)
                return i;
        }
        return -1;
    }
}


// OR Using HashMap
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hmap= new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            Character c = s.charAt(i);
            if(hmap.containsKey(c))
            {
                hmap.put(c,1+hmap.get(c));
            }
            else
                hmap.put(c,1);
            
        }
        for(int i=0;i<s.length();i++)
        {
            if(hmap.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
}
