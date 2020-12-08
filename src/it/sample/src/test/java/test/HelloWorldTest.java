package test;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void smokes() throws Exception {
      HelloWorld helloWorld = new HelloWorld("Hello World");

        assertEquals(helloWorld.getStr(), "Hello World");
    }

}
