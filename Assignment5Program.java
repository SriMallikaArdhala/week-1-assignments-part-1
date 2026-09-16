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
        Day day= Day.values()[dayValue-1];
        System.out.println(day);

    }

}
