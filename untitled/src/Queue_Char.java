public class Queue_Char {
    private int front;
    private int rear;
    private int maxSize;
    private int count;
    char[] arr;
    Queue_Char(int max){
        maxSize=max;
        arr=new char[maxSize];
        front=0;
        rear=-1;
        count=0;
    }
    public boolean isQueueEmpty(){
        if(rear<front){
            return true;
        }else{
            return false;
        }
    }
    public boolean isQueueFull(){
        if(rear==maxSize-1){
            return true;
        }else{
            return false;
        }
    }
    public void append(char item){
        if(isQueueFull()){
            System.out.println("\nQueue is full\n");
        }else{
            System.out.println("inserting "+item);
            arr[++rear]=item;
            count++;
        }
    }
    public char serve(){
        if(isQueueEmpty()){
            System.out.println("\nQueue is empty.\n");
            return '0';
        }else{
            char item=arr[front++];
            count--;
            return item;
        }
    }
}
