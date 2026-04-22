package com.flc.system;
import com.flc.model.Lessons;
import java.util.ArrayList;

public class Timetable {
    private ArrayList<Lessons> Lessons;

    public Timetable(){
        Lessons=new ArrayList<>();
        initializeLessons();
    
    }

    private void initializeLessons(){

// number of weeks from 1 to 4 in the Month of March  and have weeks from 5 to 8 in the Month of April
// format of the sample reord is  (LessonsID , Date ,Time ,Type ,price ,weeknd ,month)



            // record for the week#1

        Lessons.add(new Lessons("L203","Saturday" ,"Morning","Yoga" , 18,1,3));
        Lessons.add(new Lessons("L202","Saturday" ,"Evening","Zumba" , 24,1,3));
        Lessons.add(new Lessons("L201","Saturday" ,"Morning","Box fit" , 13,1,3));
        Lessons.add(new Lessons("L204","Saturday" ,"Afternoon","Aquacise" , 11,1,3));
        Lessons.add(new Lessons("L205","Saturday" ,"Morning","Pilates" , 11.50,1,3));
        Lessons.add(new Lessons("L206","Saturday" ,"Evening","Body Blitz" , 30,1,3));

        //reord for the week#2
        // ===== WEEKEND 2 (March) =====
        Lessons.add(new Lessons("L207", "Saturday", "Morning",   "Zumba",      24.00, 2, 3));
        Lessons.add(new Lessons("L208", "Saturday", "Afternoon", "Yoga",       18.00, 2, 3));
        Lessons.add(new Lessons("L209", "Saturday", "Evening",   "Pilates",    11.50, 2, 3));
        Lessons.add(new Lessons("L210", "Sunday",   "Morning",   "Box Fit",    13.00, 2, 3));
        Lessons.add(new Lessons("L211", "Sunday",   "Afternoon", "Aquacise",   11.00, 2, 3));
        Lessons.add(new Lessons("L212", "Sunday",   "Evening",   "Body Blitz", 30.00, 2, 3));

        // ===== WEEKEND 3 (March) =====
        Lessons.add(new Lessons("L213", "Saturday", "Morning",   "Body Blitz", 30.00, 3, 3));
        Lessons.add(new Lessons("L214", "Saturday", "Afternoon", "Aquacise",   11.00, 3, 3));
        Lessons.add(new Lessons("L215", "Saturday", "Evening",   "Yoga",       18.00, 3, 3));
        Lessons.add(new Lessons("L216", "Sunday",   "Morning",   "Zumba",      24.00, 3, 3));
        Lessons.add(new Lessons("L217", "Sunday",   "Afternoon", "Pilates",    11.50, 3, 3));
        Lessons.add(new Lessons("L218", "Sunday",   "Evening",   "Box Fit",    13.00, 3, 3));

        // ===== WEEKEND 4 (March) =====
        Lessons.add(new Lessons("L219", "Saturday", "Morning",   "Aquacise",   11.00, 4, 3));
        Lessons.add(new Lessons("L220", "Saturday", "Afternoon", "Body Blitz", 30.00, 4, 3));
        Lessons.add(new Lessons("L221", "Saturday", "Evening",   "Zumba",      24.00, 4, 3));
        Lessons.add(new Lessons("L222", "Sunday",   "Morning",   "Pilates",    11.50, 4, 3));
        Lessons.add(new Lessons("L223", "Sunday",   "Afternoon", "Box Fit",    13.00, 4, 3));
        Lessons.add(new Lessons("L224", "Sunday",   "Evening",   "Yoga",       18.00, 4, 3));

        // ===== WEEKEND 5 (April) =====
        Lessons.add(new Lessons("L225", "Saturday", "Morning",   "Pilates",    11.50, 5, 4));
        Lessons.add(new Lessons("L226", "Saturday", "Afternoon", "Box Fit",    13.00, 5, 4));
        Lessons.add(new Lessons("L227", "Saturday", "Evening",   "Aquacise",   11.00, 5, 4));
        Lessons.add(new Lessons("L228", "Sunday",   "Morning",   "Yoga",       18.00, 5, 4));
        Lessons.add(new Lessons("L229", "Sunday",   "Afternoon", "Zumba",      24.00, 5, 4));
        Lessons.add(new Lessons("L230", "Sunday",   "Evening",   "Body Blitz", 30.00, 5, 4));

        // ===== WEEKEND 6 (April) =====
        Lessons.add(new Lessons("L231", "Saturday", "Morning",   "Box Fit",    13.00, 6, 4));
        Lessons.add(new Lessons("L232", "Saturday", "Afternoon", "Pilates",    11.50, 6, 4));
        Lessons.add(new Lessons("L233", "Saturday", "Evening",   "Body Blitz", 30.00, 6, 4));
        Lessons.add(new Lessons("L234", "Sunday",   "Morning",   "Zumba",      24.00, 6, 4));
        Lessons.add(new Lessons("L235", "Sunday",   "Afternoon", "Yoga",       18.00, 6, 4));
        Lessons.add(new Lessons("L236", "Sunday",   "Evening",   "Aquacise",   11.00, 6, 4));

        // ===== WEEKEND 7 (April) =====
        Lessons.add(new Lessons("L237", "Saturday", "Morning",   "Aquacise",   11.00, 7, 4));
        Lessons.add(new Lessons("L238", "Saturday", "Afternoon", "Body Blitz", 30.00, 7, 4));
        Lessons.add(new Lessons("L239", "Saturday", "Evening",   "Zumba",      24.00, 7, 4));
        Lessons.add(new Lessons("L240", "Sunday",   "Morning",   "Box Fit",    13.00, 7, 4));
        Lessons.add(new Lessons("L241", "Sunday",   "Afternoon", "Aquacise",   11.00, 7, 4));
        Lessons.add(new Lessons("L242", "Sunday",   "Evening",   "Yoga",       18.00, 7, 4));

        // ===== WEEKEND 8 (April) =====
        Lessons.add(new Lessons("L243", "Saturday", "Morning",   "Zumba",      24.00, 8, 4));
        Lessons.add(new Lessons("L244", "Saturday", "Afternoon", "Aquacise",   11.00, 8, 4));
        Lessons.add(new Lessons("L245", "Saturday", "Evening",   "Yoga",       18.00, 8, 4));
        Lessons.add(new Lessons("L246", "Sunday",   "Morning",   "Body Blitz", 30.00, 8, 4));
        Lessons.add(new Lessons("L247", "Sunday",   "Afternoon", "Box Fit",    13.00, 8, 4));
        Lessons.add(new Lessons("L248", "Sunday",   "Evening",   "Pilates",    11.50, 8, 4));
    


    }



    // return Lessons by overall day 
    public ArrayList<Lessons> getLessonsByDay(String day)
    {
        
        ArrayList<Lessons> overallLessons=new ArrayList<>();
        {
            for (Lessons ln: Lessons)
                if(ln.getDay()!= null && ln.getDay().equalsIgnoreCase(day))
                    overallLessons.add(ln);
        }

        return overallLessons;
    }


    public ArrayList<Lessons> getLessonsByExerciseType(String exerciseType)
    {
        ArrayList<Lessons> overallExerciseType=new ArrayList<>();
        for(Lessons ln: Lessons){
            if(ln.getExercise_type()!= null && ln.getExercise_type().equalsIgnoreCase(exerciseType))
                overallExerciseType.add(ln);
        }
        return overallExerciseType;
    }

//get lesson by overall type

    public ArrayList<Lessons> getLessonsByType(String type)
    {
    ArrayList<Lessons> overalltype=new ArrayList<>();
    for(Lessons ln: Lessons){
        if(ln.getExercise_type()!= null && ln.getExercise_type().equalsIgnoreCase(type))
            overalltype.add(ln);
    }
        return overalltype;
    }

//get lesson by overall month
    public ArrayList<Lessons> getLessonsByMonth(int month)
    {
        ArrayList<Lessons> overallmonth=new ArrayList<>();
        for(Lessons ln: Lessons){
            if(ln.getMonth()==month)
                overallmonth.add(ln);
        }
        return overallmonth;
    }

    //get lesson by overall weekend
    public ArrayList<Lessons> getLessonsByWeekend(int weekend)
    {
        ArrayList<Lessons> overallweekend=new ArrayList<>();
        for(Lessons ln: Lessons){
            if(ln.getWeekend()==weekend)
                overallweekend.add(ln);
        }
        return overallweekend;
    }
    
    public ArrayList<Lessons> getAllLessons(){return Lessons;} 
    
    public Lessons getLessonId(String id)
    {
        for(Lessons l: Lessons)
        {
            if(l.getLessonId().equalsIgnoreCase(id))
            {
                return l;
            }
        }
        return null;
    }

    public Lessons getLessonById(String lessonId){
        for(Lessons l: Lessons){
            if(l.getLessonId().equalsIgnoreCase(lessonId)){
                return l;
            }
        }
        return null;
    }

    public void displayLessons(ArrayList<Lessons> list)
    {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(String.format("%-10s %-10s %-10s %-15s %-10s %-10s %-10s", 
        "LessonsID", "Day", "Time", "Exercise Type", "Price", "Weekend", "Month"));
        System.out.println("---------------------------------------------------------------------------------");
        for(Lessons ln: list){
            System.out.println(String.format("%-10s %-10s %-10s %-15s %-10.2f %-10d %-10d",
                    ln.getLessonId(), ln.getDay(), ln.getTime(), ln.getExercise_type(),
                    ln.getPrice(), ln.getWeekend(), ln.getMonth()));
        }
        System.out.println("---------------------------------------------------------------------------------");
    }
































    }
