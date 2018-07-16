import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RandomNameTest {

    RandomName randomName;

    @Before
    public void before() {
        this.randomName = new RandomName();
    }

    @Test
    public void hasArrayListOfNames() {
        assertEquals(6, randomName.getNames().size());
    }


}
