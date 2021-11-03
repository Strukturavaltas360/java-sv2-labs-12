package junit5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class GentlemanTest {
    @Test

    void testCreate() {

    //given
    Gentleman gentleman = new Gentleman();

    //when
    String text = gentleman.sayHello("John Doe");

    //then
    assertEquals(text, "Hello John Doe");

    //when
    text = gentleman.sayHello(null);

    //then
    assertEquals(text, "Hello Anonimus");
        
    }
}
