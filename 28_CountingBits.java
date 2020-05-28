class Solution {
    public int[] countBits(int num) {
        if(num==0) return new int[]{0};
        else if(num==1) return new int[]{0,1};
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(0);
        arr.add(1);
        for(int i=2;i<=num;i++)
        {
            arr.add(1+arr.get(i-(int)Math.pow(2,Math.floor(Math.log(i)/Math.log(2)))));
        }
        int[] ret=new int[arr.size()];
        for(int i=0;i<ret.length;i++)
            ret[i]=arr.get(i);
        return ret;
    }
}
