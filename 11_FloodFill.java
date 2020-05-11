class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor)
            return image;
        return fill(image,image[sr][sc],sr,sc,newColor);
    }
    
    public int[][] fill(int[][] image,int key, int sr, int sc, int newColor)
    {
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length)
            return image;
        if(image[sr][sc]!=key)
            return image;
        
        image[sr][sc]=newColor;
        image=fill(image,key,sr-1,sc,newColor);
        image=fill(image,key,sr+1,sc,newColor);
        image=fill(image,key,sr,sc-1,newColor);
        image=fill(image,key,sr,sc+1,newColor);
        return image;
    }
}
