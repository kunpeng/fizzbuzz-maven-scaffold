package FizzBuzz;

public class FizzBuzz {
    public static String calc(int number){
        if(number %3 == 0){
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
