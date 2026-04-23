
package com.flc;


import com.flc.model.Lessons;
import com.flc.system.BookingSystem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LessonTest {
    
    @Test
    public void IsFullTest(){
        Lessons lessons = new Lessons("L001", "Sautrday", "Morning","Yoga",35,1, 5);
         for(int x=0; x<100; x++)
         {
            lessons.incrementBooked();
         }
        assertTrue(lessons.isFull(),"Lesson woud full after 10 bookings");
    }
}
