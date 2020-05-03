class Solution {
    public int numJewelsInStones(String J, String S) {
        int sum=0;
        int arr[]=new int [256];
        for(int i=0;i<S.length();i++)
        {
            ++arr[S.charAt(i)];
        }
        for(int i=0;i<J.length();i++)
        {
            sum+=arr[J.charAt(i)];
        }
        return sum;
    }
}
