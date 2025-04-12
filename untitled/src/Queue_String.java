public class Queue_String {
    private int front;
    private int rear;
    private int maxSize;
    private int count;
    String[] arr;
    Queue_String(int max){
        maxSize=max;
        arr=new String[maxSize];
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
    public void appened(String item){
        if(isQueueFull()){
            System.out.println("\nQueue is full\n");
        }else{
            arr[++rear]=item;
            count++;
        }
    }
    public String serve(){
        if(isQueueEmpty()){
            System.out.println("\nQueue is empty.\n");
            return "";
        }else{
            String item=arr[front++];
            count--;
            return item;
        }
    }
}
