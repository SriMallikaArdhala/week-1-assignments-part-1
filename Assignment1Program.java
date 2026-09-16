import static java.lang.System.out;
import java.util.Scanner;
public class Assignment1Program {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        out.println("Enter number:");
        var num=sc.nextInt();
        var status1 = num > 0;
        var status2= num<0 ;
        var remainder=num%2;
        var outputtext="";
        if(status1 || status2){
            outputtext=status1?"it a positive number ":"it is a negative number ";
            if(remainder==0){
                outputtext+="and even number";

            }else{
                outputtext+="and odd number";
            }
            out.println(outputtext);
        }
        if(num==0){
            out.println("the given number is zero");
        }
    }
}

