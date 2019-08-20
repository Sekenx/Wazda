import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class HelloWorldTest {

    HelloWorld testee = new HelloWorld();

    @Test
    public void shouldAnswerWithTrue(){
        assertTrue(true);
    }

    @Test
    public void add_Numbers_5_plus_7_expect_12(){

        int answer = testee.add(5, 7);

        assertEquals(12, answer);
    }
}
