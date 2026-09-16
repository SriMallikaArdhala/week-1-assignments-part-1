import static java.lang.System.out;
import java.util.Scanner;
public class Assignment2Program {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        out.println("Enter three numbers:");
        var num1=sc.nextInt();
        var num2=sc.nextInt();
        var num3=sc.nextInt();
        var largestOfTwo= (num1>num2) ? num1 : num2;
        var largestOfThree= (largestOfTwo>num3) ? largestOfTwo : num3;
        out.println(largestOfThree + " is the largest number.");

    }
}
