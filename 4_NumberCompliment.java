class Solution {
    public int findComplement(int num) {
        int total = (int)(Math.floor(Math.log(num) / Math.log(2)));
        return (int)(Math.pow(2, total+1)-1) ^ num;
    }
}
