import java.util.*;
import static java.lang.System.out;
public class Assignment9Program {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        out.println("enter a number: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%3==0){
                continue;
            }
            out.print(i+" ");
        }

    }
}
