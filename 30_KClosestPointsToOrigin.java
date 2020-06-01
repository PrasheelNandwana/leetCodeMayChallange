class Solution {
    public int[][] kClosest(int[][] points, int K) {
        Point[] arr=new Point[points.length];
        for(int i=0;i<points.length;i++)
        {
            arr[i]=new Point();
            arr[i].x=points[i][0];
            arr[i].y=points[i][1];
            arr[i].dist=Math.pow(arr[i].x,2)+Math.pow(arr[i].y,2);
        }
        Arrays.sort(arr);
        int[][] ret=new int[K][2];
        for(int i=0;i<K;i++)
        {
            ret[i][0]=arr[i].x;
            ret[i][1]=arr[i].y;
        }
        return ret; 
    }
    class Point implements Comparable<Point>{
        int x=0;
        int y=0;
        double dist=0;
        public int compareTo(Point a)
        {
            if((this.dist-a.dist)>0)
                return 1;
            return -1;
        }
    }
}
