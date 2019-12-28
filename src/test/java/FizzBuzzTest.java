import FizzBuzz.FizzBuzz;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_fizz(){
        int number = 3;

        String result = FizzBuzz.calc(number);

        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void should_return_buzz(){
        int number = 5;

        String result = FizzBuzz.calc(number);

        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void should_return_fizz_buzz(){
        int number = 15;

        String result = FizzBuzz.calc(number);

        assertThat(result).isEqualTo("FizzBuzz");
    }
}
