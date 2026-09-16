import java.util.*;
import java.lang.*;
public class Assignment5Program {
    public static void main(String[] args){
        enum Day{
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THRUSDAY,
            FRIDAY,
            STATURDAY,
            SUNDAY
        };
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day value : ");
        int dayValue=sc.nextInt();
        if(dayValue<1 || dayValue >7)
            System.out.println("Invalid day number");
        else {
            Day day = Day.values()[dayValue - 1];
            System.out.println(day);
        }

    }

}
