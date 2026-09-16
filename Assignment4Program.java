import java.util.*;
import static java.lang.System.out;
public class Assignment4Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.println("Enter Year: ");
        var year = sc.nextInt();
        String result = (year%400==0 || year%4==0 && year%100!=0) ? " is a leap year." :" is not a leap year.";
        out.println(result);

    }
}
