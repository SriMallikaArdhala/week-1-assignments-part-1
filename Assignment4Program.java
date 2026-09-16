import java.util.*;
import static java.lang.System.out;
public class Assignment4Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.println("Enter Year: ");
        var year = sc.nextInt();
        out.println((year%400==0) || ((year%4==0) && (year%100!=0)) ? year + " is a leap year." : year +" is not a leap year." );

    }
}
