class Solution {
public:
    bool isPalindrome(int x) {
     int num=0,org_num=x;
     if(x<0){
         return false;}
     while(x!=0){
         if(num>INT_MAX/10 || x<INT_MIN/10){
             return false;
         }
          num= num*10+x%10;
          x=x/10;
     }   
     if(org_num==num){
         return true;
     }
     else{
         return false;
     }
    }
};