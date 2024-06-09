public class Exercise {
    public boolean isPalindrome(int x) {
    
    if(x < 0) return false;
    if(x != 0 && x % 10 == 0) return false;
    
    int rev = 0;
    while(x > rev) {
        int temp = x % 10;
        rev = rev * 10 + temp;
        x /= 10;
    }
    return (x == rev || x == rev / 10);
    }
}
