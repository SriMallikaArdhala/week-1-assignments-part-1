import java.util.Scanner;
import static java.lang.System.out;
public class Assignment7Program {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        out.println("Enter a positive integer: ");
        var number=sc.nextInt();
        for(int i=1;i<=10;i++){
            out.println(number +"x "+i +"= "+(number*i));
        }

    }
}
