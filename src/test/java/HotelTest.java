import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    ConferenceRoom conferenceRoom1;
    Guest guest1;
    Booking newBooking;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom1 = new Bedroom(25, 2, "Double");
        conferenceRoom1 = new ConferenceRoom("Steve Bobs Memorial Room", 24);
        guest1 = new Guest("Tim Bapple");
        newBooking = new Booking(bedroom1, 1);
    }

    @Test
    public void hotelCanHaveBedroom() {
        hotel.addBedroom(bedroom1);
        assertEquals(1, hotel.getBedrooms().size());
    }

    @Test
    public void hotelCanHaveConferenceRoom() {
        hotel.addConferenceRoom(conferenceRoom1);
        assertEquals(1, hotel.getConferenceRooms().size());
    }

    @Test
    public void hotelCanCheckinGuestToBedroom() {
        hotel.addBedroom(bedroom1);
        hotel.checkinGuestToBedroom(guest1, bedroom1);
        assertEquals(1, hotel.countBedroomGuests());
    }

    @Test
    public void hotelCanCheckinGuestToConferenceRoom() {
        hotel.addConferenceRoom(conferenceRoom1);
        hotel.checkinGuestToConferenceRoom(guest1, conferenceRoom1);
        assertEquals(1, hotel.countConferenceRoomGuests());
    }

    @Test
    public void hotelCanBookBedroom() {
        Booking myBooking = hotel.bookRoom(bedroom1, 1);
        assertEquals(bedroom1, myBooking.getBedroom());
        assertEquals(1, myBooking.getNights());
    }
}
