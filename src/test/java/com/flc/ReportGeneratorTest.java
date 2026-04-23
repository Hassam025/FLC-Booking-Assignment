
package com.flc;


import com.flc.system.BookingSystem;
import org.junit.jupiter.api.Test;
import com.flc.system.ReportGenerator;
import static org.junit.jupiter.api.Assertions.*;


public class ReportGeneratorTest {
    @Test
    public void testGenerateMonthlyLessonsReport() {
        BookingSystem bookingSystem = new BookingSystem();
        ReportGenerator reportGenerator = new ReportGenerator(bookingSystem);
        // You may want to add some bookings/lessons to bookingSystem here for a real test
        try {
            reportGenerator.generateMonthlyLessonsReport(5); // e.g., May
        } catch (Exception e) {
            fail("generateMonthlyLessonsReport should not throw exception: " + e.getMessage());
        }
    }

    @Test
    public void testAttendCount() {
        BookingSystem bookingSystem = new BookingSystem();
        ReportGenerator reportGenerator = new ReportGenerator(bookingSystem);
        // You may want to add some bookings/lessons to bookingSystem here for a real test
        try {
            reportGenerator.generateChampionReport(5); // e.g., May
        } catch (Exception e) {
            fail("generateChampionReport should not throw exception: " + e.getMessage());
        }
    }

    
    
}
