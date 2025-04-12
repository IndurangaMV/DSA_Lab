import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Queue_String queue=new Queue_String(10);
        Scanner scn =new Scanner(System.in);
        System.out.print("Enter your number: ");
        String number=scn.next();
        queue.appened(number.substring(0,(number.length()/2)));
        queue.appened(number.substring(number.length()/2));
        String t1=queue.serve();
        String t2=queue.serve();
        System.out.println(t2+t1);
    }
}
