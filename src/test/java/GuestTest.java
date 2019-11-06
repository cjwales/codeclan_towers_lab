import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;
    Guest guest2;
    Guest guest3;


    @Before
    public void before() {
        guest1 = new Guest("Jordan");
        guest2 = new Guest("Niall");
        guest3 = new Guest("Steve");
    }

    @Test
    public void guestHasName() {
        assertEquals("Jordan", guest1.getName());
    }
}
