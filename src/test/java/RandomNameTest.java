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
    public void canReturnAnArrayOfTwoRandomNames() {
        assertEquals(2, randomName.getTwoRandomNames().size());
    }

    @Test
    public void canReturnAnArrayOfThreeRandomNames() {
        assertEquals(3, randomName.getThreeRandomNames().size());
    }

    @Test
    public void canReturnAnArrayOfFourRandomNames() {
        assertEquals(4, randomName.getFourRandomNames().size());
    }
}
