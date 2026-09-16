import java.util.*;
import static java.lang.System.out;
public class Assignment6Program {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        out.println("Enter the numbers: ");
        var num1=sc.nextInt();
        var num2=sc.nextInt();
        out.println("enter operator: ");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+': out.println("Addition: "+(num1+num2));break;
            case '-': out.println("Subtraction: "+(num1-num2));break;
            case '*': out.println("Multiplication: "+(num1*num2));break;
            case '/': if(num2!=0)
                            out.println("Division: "+(num1/num2));
                       else
                            out.println("division by zero error.");
                       break;
            case '%': out.println("remainder: "+(num1%num2));break;
            default: out.println("invalid operator");

        }


    }
}
