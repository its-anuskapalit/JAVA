import java.time.LocalDate;

//day28
class online{
    public static void main(String args[]){
        System.out.println(LocalDate.now());
    }
}
//----------------------------------------------------------------------
import java.time.LocalDate;
class online{
    public static void main(String args[]){
        LocalDate id = LocalDate.now();
        System.out.println(id);
        LocalDate id2= id.minusDays(2);
        LocalDate id3= id.plusDays(2);
        System.out.println(id2);
        System.out.println(id3);
    }
}
//-----------------------------------------------------------
import java.time.LocalDate;
class online{
    public static void main(String args[]){
        LocalDate id = LocalDate.of(2011,04,02);
        System.out.println(id.isLeapYear());
    }
}
//----------------------------------------------------------
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class online{
    public static void main(String args[]){

        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }
}
//-------------------------------------------------------
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class online{
    public static void main(String args[]){
        LocalDateTime defaultdate=LocalDateTime.now();
        System.out.println("Before: "+defaultdate);
        DateTimeFormatter custom= DateTimeFormatter.ofPattern("dd/MM/yyyy /E");

        System.out.println("After: "+defaultdate.format(custom));
    }
}
//---------------------------------------------------------------------
import java.time.LocalTime;
import java.time.Duration;
import java.util.*;

class Online {
   public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("First time");
       String st1 = scanner.nextLine();

       System.out.println("Second Time");
       String st2 = scanner.nextLine();

       LocalTime lt1 = LocalTime.parse(st1);
       LocalTime lt2 = LocalTime.parse(st2);
       Duration duration = Duration.between(lt1, lt2);
       System.out.println("Duration: " + duration);
   }
}
//------------------------------------------------------------------------
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class online {
    public static void main(String[] args) {
        ZoneId newYork = ZoneId.of("America/New_York");
        ZonedDateTime current = ZonedDateTime.now(newYork);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = current.format(formatter);
        System.out.println(formattedTime);
    }
}
//--------------------------------------------------------------------------------------

