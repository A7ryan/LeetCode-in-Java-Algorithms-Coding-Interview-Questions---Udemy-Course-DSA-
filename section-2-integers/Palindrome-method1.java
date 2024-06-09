public class Exercise {
    public boolean isPalindrome(int x) {
    int t = x;
    int rev = 0;
    
    while(x > 0) {
        int temp = x % 10;
        rev = rev * 10 + temp;
        x /= 10;
    }
    return (t == rev);
    }
}
