class Solution {
    public String frequencySort(String s) {
        Duo[] arr= new Duo[256];
         for(int i=0;i<256;i++)
         {
             arr[i]=new Duo();
             arr[i].c=(char)(i);
         }
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)].count+=1;
        }
        Arrays.sort(arr);
        StringBuilder str= new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].count;j++)
                str.append(arr[i].c);
        }
         return str.toString();
    }
    
    class Duo implements Comparable<Duo>
    {
        char c;
        int count;
        public int compareTo(Duo ob)
        {
            return ob.count-this.count;
        }
    }
    
}
