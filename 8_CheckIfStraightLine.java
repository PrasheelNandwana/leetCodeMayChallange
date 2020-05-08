class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        float slope=(float)(coordinates[0][1]-coordinates[1][1])/(float)(coordinates[0][0]-coordinates[1][0]);
        
        float temp=0;
        
        for(int i=2;i<coordinates.length;i++)
        {
            temp=(float)(coordinates[0][1]-coordinates[i][1])/(float)(coordinates[0][0]-coordinates[i][0]);
            System.out.println(temp);
            
            if(slope!=temp)
                return false;
        }
        return true;
    }
}
