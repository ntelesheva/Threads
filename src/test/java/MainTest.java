import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    @Test
    public void testFactorial(){
        assertThat(Main.getFactorial(5)).isEqualTo(120);
    }

    @Test
    public void testRecursionFactorial(){
        assertThat(Main.getFactorialR(5)).isEqualTo(120);
    }

}