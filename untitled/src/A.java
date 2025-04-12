import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Queue_String queue=new Queue_String(2);
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter first string: ");
        queue.appened(scn.next());

        System.out.print("Enter second String: ");
        queue.appened(scn.next());

        StringBuilder newText= new StringBuilder(queue.serve());
        newText.append(queue.serve());
        System.out.println(newText);
    }
}
