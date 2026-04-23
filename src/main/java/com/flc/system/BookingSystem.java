package com.flc.system;

import com.flc.model.*;

import java.util.ArrayList;

public class BookingSystem {
    private ArrayList<Booking> bookings;
    private ArrayList<Member> member;
    private Timetable timetable;
    private int bookiingCount;

    public BookingSystem() {
        this.bookings = new ArrayList<>();
        this.member = new ArrayList<>();
        this.timetable = new Timetable();
        this.bookiingCount = 1;
        intializeMember();
    }

    private void intializeMember() {
        member.add(new Member("M001", "Faraz"));
        member.add(new Member("M002", "Jhon"));
        member.add(new Member("M003", "James"));
        member.add(new Member("M004", "Sheikh"));
        member.add(new Member("M005", "Madiha"));
        member.add(new Member("M006", "Ramzan"));
        member.add(new Member("M007", "Ahmed"));
        member.add(new Member("M008", "Talha"));
        member.add(new Member("M009", "Areeb"));
        member.add(new Member("M010", "Hassam"));
    }

    public boolean bookLessons(Member member, String lessonId) {
        // Member member = getMemberById(memberId);
        if (member == null) {
            System.out.println("Member not found");
            return false;

        }

        Lessons lessons = timetable.getLessonById(lessonId);
        if (lessons == null) {
            System.out.println("lesson not found");
            return false;
        }

        if (!lessons.isAvailable()) {
            System.out.println("lesson not available");
            return false;
        }

        if (isDuplicateBooking(member, lessons)) {
            System.out.println("Lesson is already booked for it , so before book new lesson ,you have to cancel the previous one");
            return false;
        }

        // Release old spot if the member has a previous booking
        Booking booking = new Booking(generateBookId(), member, lessons);
        bookings.add(booking);
        member.addBooking(booking);
        lessons.incrementBooked();
        System.out.println("Booked successfully");
        return true;

    }

    public Booking findBookingById(String bookingId) {
        for (Booking b : bookings) {
            if (b.getBookingId().equalsIgnoreCase(bookingId)) {
                return b;
            }
        }
        return null;
    }

    public boolean changeBooking(String bookingId, String newLessonsId) {
        Booking booking = findBookingById(bookingId);
        if (booking == null) {
            System.out.println("Booking not found");
            return false;
        }

        Lessons newLessons = timetable.getLessonById(newLessonsId);
        if (newLessons == null) {
            System.out.println("New lesson not found");
            return false;
        }

        if (!newLessons.isAvailable()) {
            System.out.println("New lesson is not available");
            return false;
        }

        if (isDuplicateBooking(booking.getMember(), newLessons)) {
            System.out.println(
                    "Booking is already exit , Kingly berfore book new Booking ,you have to cancel the previous one.");
            return false;
        }

        // Release old spot
        booking.getLessons().decrementBooked();

        // Change to new lesson
        booking.changeLessons(newLessons);
        newLessons.incrementBooked();

        System.out.println("Booking changed successful");
        return true;

    }

    public boolean cancelBooking(String bookingId , String lessonsId) {
        Booking booking = findBookingById(bookingId);
        if (booking == null) {
            System.out.println("Booking not found");
            return false;
        }

        if (booking.getStatus() == BookingStatus.Cancelled) {
            System.out.println("Booking is already cancel");
            return false;
        }

        if (booking.getStatus() == BookingStatus.Attended) {
            System.out.println("Cannot cancel attended booking");
            return false;
        }

        booking.getLessons().decrementBooked();
        booking.cancel();
        booking.getMember().removeBooking(booking);
        System.out.println("Booking cancelled successful");
        return true;

    }

    public boolean attendLessons(String bookingId, String review, int rating) {
        Booking booking = findBookingById(bookingId);
        if (booking == null) {
            System.out.println("Booking not found");
            return false;
        }

        if (booking.getStatus() != BookingStatus.Booked &&
                booking.getStatus() != BookingStatus.Changed) {
            System.out.println("Booking is already attended");
            return false;
        }

        if (rating < 1 || rating > 5) {
            System.out.println("Rating should be between 1 and 5");
            return false;
        }

        booking.attend(review, rating);
        System.out.println("Lessons attended successful");
        return true;

    }

    public Member getMemberById(String Id) {
        for (Member m : member) {
            if (m.getId().equalsIgnoreCase(Id)) {
                return m;
            }
        }
        return null;
    }

    public boolean isDuplicateBooking(Member Member, Lessons lesson) {
        for (Booking b : Member.getBookings()) {
            if (b.getMember().getId().equals(Member.getId())
                    && (b.getStatus() == BookingStatus.Cancelled)) {
                return true;
            }
        }
        return false;
    }

    public String generateBookId() {
        return "B" + String.format("%03d", bookiingCount++);
    }

    public void displayMemberBookings(Member member) {
        if (member == null) {
            System.out.println("Member not found");
            return;
        }

        System.out.println("Bookings for member: " + member.getName());

        if (member.getBookings().isEmpty()) {
            System.out.println("No bookings found for this member");
            return;
        }

        for (Booking b : member.getBookings()) {
            System.out.printf("ID: %-6s | %-10s  %-10s %-12s | status:%s%n", b.getBookingId(), b.getLessons().getName(),
                    b.getLessons().getInstructor(), b.getLessons().getTime(), b.getStatus());
        }

    }

    
    public Timetable getTimetable() {
        return timetable;
    }

    public ArrayList<Member> getMember() {
        return member;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

}
