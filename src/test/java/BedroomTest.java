import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;

    @Before
    public void before() {
        bedroom1 = new Bedroom(10, 1,"Single");
        bedroom2 = new Bedroom(20, 2,"Double");
        bedroom3 = new Bedroom(30, 4,"Family");
    }

    @Test
    public void roomHasNumber() {
        assertEquals(10, bedroom1.getRoomNumber());
    }

    @Test
    public void roomHasCapacity() {
        assertEquals(2, bedroom2.getCapacity());
    }

    @Test
    public void roomHasType() {
        assertEquals("Family", bedroom3.getType());
    }

    @Test
    public void roomShouldStartEmpty() {
        assertEquals(0, bedroom1.getGuests().size());
    }
}
