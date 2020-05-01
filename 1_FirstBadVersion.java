/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int key=0;
        int front=1;
        int back=n;
        if(isBadVersion(1))
            return 1;
        if(isBadVersion(n)==false)
            return n;
        int count=(int)(Math.log(n)/Math.log(2));
        for(int i=0;i<=count;i++)
        {
            key=front+(back-front)/2;
            if(isBadVersion(key))
            {
                back=key; 
            }
            else
            {
                front=key+1;
            }
        }
        if(isBadVersion(key))
        {
            if(isBadVersion(key-1)==false)
                return key;
        }
            return key+1;
    }
}
