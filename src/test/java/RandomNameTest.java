import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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

    @Test
    public void canReturnAnArrayOfXRandomNamesForXEquals3() {
        int actual = randomName.getXRandomNames(3).size();
        assertEquals(3, actual);
    }

    @Test
    public void canReturnAnArrayOfXRandomNamesForXEquals7() {
        int actual = randomName.getXRandomNames(7).size();
        assertEquals(7, actual);
    }

}
