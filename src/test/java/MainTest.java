import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class MainTest {

    @Test
    public void testFactorial(){
        assertThat(Main.getFactorial(5)).isEqualTo(120);
    }

    @Test
    public void testRecursionFactorial(){
        assertThat(Main.getFactorialR(5)).isEqualTo(120);
    }

   @Test
    @Parameters({
            "5 | 120",
            "6 | 720",
            "1  | 1",
            "2 | 2",
            "0 | 1"
    })
public  void testGetFactorialStream(int number, int rezult){
        assertThat(Main.getFactorialStream(number)).isEqualTo(rezult);
   }

}