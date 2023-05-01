import java.util.Calendar;
import java.util.Scanner;

public class Java_Date_and_Time {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Day: ");
            int day = scanner.nextInt();
            System.out.print("Enter Month: ");
            int month = scanner.nextInt();
            System.out.print("Enter Year: ");
            int year = scanner.nextInt();
            //create array day of week
            String[] day_of_week ={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
            //declare object Calender get time zone
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month-1, day);
            int p = calendar.get(Calendar.DAY_OF_WEEK);
            System.out.println(day_of_week[p-1]);
        }
    }
}

