import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    ConferenceRoom conferenceRoom3;
    Guest guest1;

    @Before
    public void before() {
        conferenceRoom1 = new ConferenceRoom("Colin Bell Memorial Room", 6);
        conferenceRoom2 = new ConferenceRoom("Chris Wales Memorial Room", 8);
        conferenceRoom3 = new ConferenceRoom("NateDawgg Memorial Room", 12);
        guest1 = new Guest("James Banned");
    }

    @Test
    public void roomHasName() {
        assertEquals("Colin Bell Memorial Room", conferenceRoom1.getName());
    }

    @Test
    public void roomHasCapacity() {
        assertEquals(8, conferenceRoom2.getCapacity());
    }

    @Test
    public void roomStartsEmpty() {
        assertEquals(0, conferenceRoom3.getGuests().size());
    }

    @Test
    public void bedroomCanAddGuest() {
        conferenceRoom1.addGuest(guest1);
        assertEquals(1, conferenceRoom1.getGuests().size());
    }

}
