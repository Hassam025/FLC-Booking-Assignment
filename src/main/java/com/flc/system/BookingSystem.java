package com.flc.system;
import com.flc.model.*;
import java.util.ArrayList;

public class BookingSystem {
    private ArrayList<Booking> bookings;
    private ArrayList<Member> Member;
    private timetable timetable;
    private int bookiingCount;
    
    public BookingSystem(){
        this.bookings=new ArrayList<>();
        this.Member=new ArrayList<>();
        this.timetable=new timetable();
        this.bookiingCount=1;
        intializeMember();
    }
    private void intializeMember(){
        Member.add(new Member("M001","Hassan"));
        Member.add(new Member("M002","Ali"));
        Member.add(new Member("M003","Hamza"));
        Member.add(new Member("M004","Sara"));
        Member.add(new Member("M005","Ayesha"));
        Member.add(new Member("M006","Zainab"));
        Member.add(new Member("M007","Omar"));
        Member.add(new Member("M008","Fatima"));
        Member.add(new Member("M009","Ahmed"));
        Member.add(new Member("M010","Maryam"));
    }

    public boolean bookLessons(String memberId , String lessonId)
    {
        Member member= findMemberById(memberId);
        if(member == null){
            System.out.println("Member not found");
            return false;

        }

        Lessons Lessons = timetable.getLessonsbyid(lessonId);
        if (lesson == null){
            System.out.println("lesson not found");
            return false;
        }

        if(!Lessons.isAvailable()){
            System.out.println("lesson not available");
            return false;
        }

        if (isDuplicateBooking(memberId, lessonId)){
            System.out.println("you have already booking for this Lessons, kiindly make sure to cancel the previous booking before making a new one");
            return false;
        }

        // Release old spot if the member has a previous booking

        booking.getLessons().decrementBooked();

        // change to new Lessons 
        booking.changeLessons(newLessons);
        newLessons.incrementBooked();

        System.out.println("Booking changed successfully");


    }
    

    public boolean cancelBooking(String bookingId){
        Booking booking = findBookingById(bookingId);
        if (booking == null){
            System.out.println("Booking not found");
            return false;
        }

        if(booking.getStatus() == BookingStatus.Cancelled){
            System.out.println("Booking is already cancelled");
            return false;
        }

        if(booking.getStatus() == BookingStatus.Attended){
            System.out.println("Cannot cancel an attended booking");
            return false;
        }

        booking.getLessons().decrementBooked();
        booking.cancel();
        booking.getMemeber().removeBooking(booking);
        System.out.println("Booking cancelled successfully");
        return true;

    }



    public boolean attendLessons(String bookingId, String review, int rating){
        Booking booking = findBookingById(bookingId);
        if (booking == null){
            System.out.println("Booking not found");
            return false;
        }

        if (booking.getStatus() != BookingStatus.Booked&&
            booking.getStatus() !=BookingStatus.Changed)
        {
            System.out.println("Booking is already attended");
            return false;
        }

        if (rating < 1 || rating > 5){
            System.out.println("Rating must be between 1 and 5");
            return false;
        }

        booking.attend(review, rating);
        System.out.println("Lessons attended successfully");
        return true;

    }

    public Member findMemberById(String Id){
        for (Member m : Member){
            if(m.getId().equalsIgnoreCase(Id)){
                return m;
            }
        }
        return null;
    }



    public boolean isDuplicateBooking(Member member, Lessons lesson){
        for (Booking b : member.getBookings()){
            if (b.getMemeber().getLessonsId().equals(lesson.getLessonsId())
            && (b.getStatus() == BookingStatus.Cancelled)){
                return true;
            }
        }
        return false;
    }

    public String generateBookId(){
        return "B" + String.format("%03d", bookiingCount++);
    }

    public void displayMemberBookings(String memberId){
        Member member = findMemberById(memberId);
        if(member == null){
            System.out.println("Member not found");
            return;
        }


        System.out.println("Bookings for member: " + member.getName());


        if(member.getBookings().isEmpty()){
            System.out.println("No bookings found for this member");
            return;
        }

        for(Booking b: member.getBookings()){
            System.out.println("ID: %-6s | %-10s  %-10s %-12s | stsus:%s%n" + b.getBookingId(), b.getLessons().getName(), b.getLessons().getInstructor(), b.getLessons().getTime(), b.getStatus());
        }

        
    }

    public Timetable getTimetable() {
        return timetable;
    }
    public ArrayList<Member> getMember() {
        return Member;
    }
    public ArrayList<Booking> getBookings() {
        return bookings;
    }


}

