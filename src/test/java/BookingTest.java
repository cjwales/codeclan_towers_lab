import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking1;
    Booking booking2;
    Booking booking3;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;

    @Before
    public void before() {
        bedroom1 = new Bedroom(101, 1, "Single");
        bedroom1 = new Bedroom(202, 2, "Double");
        bedroom1 = new Bedroom(303, 4, "Family");
        booking1 = new Booking(bedroom1, 7);
        booking2 = new Booking(bedroom2, 4);
        booking3 = new Booking(bedroom3, 2);
    }

    @Test
    public void bookingHasBedroom() {
        booking1.setBedroom(bedroom1);
        assertEquals(bedroom1, booking1.getBedroom());
    }

    @Test
    public void bookingHasNumberOfNights() {
        booking2.getNights();
        assertEquals(4, booking2.getNights());
    }

}
