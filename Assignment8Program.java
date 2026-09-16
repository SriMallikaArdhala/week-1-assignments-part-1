import java.util.*;
import static java.lang.System.out;
public class Assignment8Program {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        out.println("Enter the positive integer: ");
        int number=sc.nextInt();
        int result = NoOfDigits(number);
        out.println("No of digits: "+result);
        int result1 = SumOfDigits(number);
        out.println("The sum of digits: "+result1);
        int result2 = ReverseOfNo(number);
        out.println("The reversed number: "+result2);

    }
    public static int NoOfDigits(int number){
        int digits=0;
        while(number!=0) {
            int res=number/10;
            int rem = number % 10;
            number = res;
            digits++;
        }
        return digits;
    }
   public static int SumOfDigits(int number){
       int sum=0;
       while(number!=0) {
           int res=number/10;
           int rem = number % 10;
           sum+=rem;
           number = res;

       }
       return sum;


    }
    public static int ReverseOfNo(int number){
        int reverse=0;
        while(number!=0) {
            reverse=reverse*10+(number % 10);
            int res=number/10;
            number = res;
        }
        return reverse;
    }

}

