package introjunit;


import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {
    @Test

    public void testCreate() {
        //given
        Gentleman gentleman = new Gentleman();

        //when
        String text = gentleman.sayHello(null);
        //then
        assertThat(text, equalTo("Hello Anonymus"));
        
        //when
        text = gentleman.sayHello("Joe");
        //then
        assertThat(text, equalTo("Hello Joe"));
    }
}
