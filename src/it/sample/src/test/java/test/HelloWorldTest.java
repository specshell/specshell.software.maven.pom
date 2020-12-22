package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {

    @Test
    public void smokes() throws Exception {
        HelloWorld helloWorld = new HelloWorld("Hello World");
        assertEquals(helloWorld.getStr(), "Hello World");
    }

}
