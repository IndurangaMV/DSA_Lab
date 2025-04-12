import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Queue_Char queue=new Queue_Char(20);
        Scanner scn =new Scanner(System.in);
        System.out.print("Enter your number: ");
        String number=scn.next();
        int d=number.length()/2;
        char[] textArr=number.toCharArray();
        for(char x:textArr){
            queue.append(x);
        }
        for(int i=0;i<d;i++){
            char c=queue.serve();
            queue.append(c);
        }
        while (!(queue.isQueueEmpty())){
            System.out.println(queue.serve());
        }
    }
}
