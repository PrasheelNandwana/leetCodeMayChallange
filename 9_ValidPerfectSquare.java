//Brute Force(I used Initilly)
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        for(int i=1;i<=num/2;i++)
        {
            if(i*i==num)
                return true;
                
        }
        return false;
    }
}


//Binary Search (I found later)
class Solution {
    public boolean isPerfectSquare(int num) {
        long left=1;
        long right=num;
        long key=0;
        long sq=0;
        while(right>=left)
        {
            key=left+(right-left)/2;
            sq=key*key;
            if(sq==num)
                return true;
            else if(sq>num)
                right=key-1;
            else
                left=key+1;
            System.out.println(key);
        }
        return false;
    }
}
