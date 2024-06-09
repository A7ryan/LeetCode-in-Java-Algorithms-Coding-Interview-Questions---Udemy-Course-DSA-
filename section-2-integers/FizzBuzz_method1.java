// Without using ArrayList

public class Exercise {
    public String[] fizzBuzz(int n) {
        String[] number = new String[n];
        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                number[i-1] = "FizzBuzz";
            } else if(i % 3 == 0) {
                number[i-1] = "Fizz";
            } else if(i % 5 == 0) {
                number[i-1] = "Buzz";
            } else {
                number[i-1] = Integer.toString(i);
            }
        }
        return number;
    }
}
