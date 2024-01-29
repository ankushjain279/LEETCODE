class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        String s1="--X";
        String s2="++X";
        String s3="X++";
        String s4="X--";
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals(s1)){
                --x; 
            }
            else if(operations[i].equals(s2)){
                ++x; 
            }
            else if(operations[i].equals(s3)){
                 x++; 
            }
            else{
               x--; 
            }
        }
        return x;
    }
}