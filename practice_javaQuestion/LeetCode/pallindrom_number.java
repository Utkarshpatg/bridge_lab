package LeetCode;

public class pallindrom_number {
    public boolean isPalindrome(int x) {
        int rev =0;
        int num = x;
        while(num>0){
            int rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        if(rev == x ){
            return true;
        }
        else{
            return false;
        }
    }
}
