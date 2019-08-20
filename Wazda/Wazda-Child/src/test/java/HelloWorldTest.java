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
    public void addNumbers_5_plus_7_should_return_12(){

        int answer = testee.add(5, 7);

        assertEquals(12, answer);
    }

}
