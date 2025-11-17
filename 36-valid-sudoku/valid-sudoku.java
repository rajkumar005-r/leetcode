class Solution {

    public boolean isValidSudoku(char[][] board) {
        Set<String> seen=new HashSet();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char curval=board[i][j];
                if(curval=='.')
                {
                    continue;
                }
                String rowcheck=curval+"in row"+i;
                String colcheck=curval+"in column"+j;
                String boxcheck=curval+"in box"+i/3+"-"+j/3;
                if(!seen.add(rowcheck)||!seen.add(colcheck)||!seen.add(boxcheck))
                {
                     return false;
                }   
            }
        }
        return true;
    }
}