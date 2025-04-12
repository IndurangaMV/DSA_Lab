import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Queue_char_linked queue=new Queue_char_linked();
        System.out.println("Enter the word:");
        String text=scn.nextLine();
        char[] textArr=text.toCharArray();
        for(char x:textArr){
            queue.append(x);
        }
        char checkLetter;
        boolean allRepeat=true;
        outer:
        while(!(queue.isQueueEmpty())){
            checkLetter= queue.serve();
            int c=0;
            for(char x:textArr){
                if(checkLetter==x){
                   c++;
                }
            }
            if(c<2){
                System.out.println("The first non-repeating character is: "+checkLetter);
                allRepeat=false;
                break outer;
            }
        }
        if(allRepeat){
            System.out.println("All the characters are repeated.");
        }
    }
}
