package hello;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class SpecialGreetingEntityProcessorTest {

    @Test
    public void testProcessor() {

        SpecialGreetingEntityProcessor processor = new SpecialGreetingEntityProcessor();
        assertThat(processor.getSpecialGreetingEntity().getContent(), is("I like cheese on toast"));

    }

}
