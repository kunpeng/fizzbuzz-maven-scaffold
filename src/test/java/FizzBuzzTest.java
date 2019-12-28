import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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

    @Test
    public void should_return_fizz_whizz(){
        int number = 21;

        String result = FizzBuzz.calc(number);

        assertThat(result).isEqualTo("FizzWhizz");
    }

    @Test
    public void should_return_buzz_whizz(){
        int number = 35;

        String result = FizzBuzz.calc(number);

        assertThat(result).isEqualTo("BuzzWhizz");
    }

    @Test
    public void should_return_fizz_buzz_whizz(){
        int number = 105;

        String result = FizzBuzz.calc(number);

        assertThat(result).isEqualTo("FizzBuzzWhizz");
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void should_throw_exception_le_0(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Invalid input");

        FizzBuzz.calc(0);
    }
}
