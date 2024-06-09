// using ArrayList
import java.util.ArrayList;

public class Exercise {
    public String[] fizzBuzz(int n) {
        ArrayList<String> number = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                number.add("FizzBuzz");
            } else if(i % 3 == 0) {
                number.add("Fizz");
            } else if(i % 5 == 0) {
                number.add("Buzz");
            } else {
                number.add(Integer.toString(i));
            }
        }
        // https://stackoverflow.com/questions/4042434/converting-arrayliststring-to-string-in-java
        return number.toArray(new String[0]);
    }
}
