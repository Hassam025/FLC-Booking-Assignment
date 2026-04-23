package com.flc;


import com.flc.model.*;
import com.flc.system.BookingSystem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookingSystemTest {
    @Test
    public void testBookingSystem() {
        Member member1 = new Member("M001", "John Doe");

        BookingSystem bookingS1 = new BookingSystem();
        boolean result = bookingS1.bookLessons(member1, "L001");
        assertTrue(result);
         assertEquals(BookingStatus.Booked, member1.getBookings().get(0).getStatus());

    }

    @Test
    public void testcancelbooking(){
        Member member1 = new Member("M001", "John Doe");

        BookingSystem bookingS1 = new BookingSystem();
        bookingS1.bookLessons(member1, "L001");
     
        String bookingId = member1.getBookings().get(0).getBookingId();
        
        // Test cancelling a booking
        boolean cancelResult = bookingS1.cancelBooking(bookingId, "L001");
        assertTrue(cancelResult);
         assertEquals(BookingStatus.Cancelled, member1.getBookings().get(0).getStatus());
    }


}
