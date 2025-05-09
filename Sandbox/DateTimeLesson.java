package Sandbox;
import java.time.*;

public class DateTimeLesson {
    public static void main(String[] args) {
        
        // Date of Birth Calculator
        LocalDate dob = LocalDate.of(2000, 3, 7);
        LocalDate current = LocalDate.now();
        Period age = Period.between(dob, current);
        System.out.println(age.getYears());

    }
    
}
