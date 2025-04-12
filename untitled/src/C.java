import java.util.Locale;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Queue_Char queue=new Queue_Char(5);
        Scanner scn=new Scanner(System.in);
        queue.append('A');
        queue.append('E');
        queue.append('I');
        queue.append('O');
        queue.append('U');

        System.out.print("Enter your word: ");
        char[] text=scn.next().toUpperCase(Locale.ROOT).toCharArray();
        char vowel;
        while (!(queue.isQueueEmpty())){
            vowel= queue.serve();
            for (char x:text){
                if(x == vowel){
                    System.out.println(x);
                }
            }
        }



    }
}
