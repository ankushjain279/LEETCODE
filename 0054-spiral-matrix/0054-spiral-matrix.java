class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     List<Integer> integerList = new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;
        int start_row=0;
        int end_row = row-1;
        int start_col=0;
        int end_col=col-1;
        int total_element=row*col;
        int check=0;
        while(start_col<=end_col && start_row<=end_row){
            for(int i=start_row;i<=end_col;i++){
                integerList.add(matrix[start_row][i]);
                check++;
            }
            if(check>=total_element){
                break;
            }
            start_row++;
            for(int i=start_row;i<=end_row;i++){
                integerList.add(matrix[i][end_col]);
                check++;
            }
             if(check>=total_element){
                break;
            }
            end_col--;
            for(int i=end_col;i>=start_col;i--){
                integerList.add(matrix[end_row][i]);
                 check++;
            }
             if(check>=total_element){
                break;
            }
            end_row--;
            for(int i=end_row;i>=start_row;i--){
                 integerList.add(matrix[i][start_col]);
                  check++;
            }
             if(check>=total_element){
                break;
            }
            start_col++;
        }
        return integerList;
    }
}   