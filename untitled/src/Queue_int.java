public class Queue_int {
    Node_int front;
    Node_int rear;
    int queueSize;
    Queue_int(){
        front=null;
        rear =null;
        queueSize=0;
    }
    public boolean isQueueEmpty(){
        if(queueSize==0){
            return true;
        }else{
            return false;
        }
    }
    public int serve(){
        if (isQueueEmpty()){
            System.out.println("Queue is empty.");
            return 0;
        }else{
           int n=this.front.data;
            this.front=front.next;
            queueSize--;
            return n;
        }
    }
    public void append(int data){
        Node_int oldRear=rear;
        rear=new Node_int();
        rear.data=data;
        rear.next=null;
        if(isQueueEmpty()){
            front=rear;
        }else{
            oldRear.next=rear;
        }
        queueSize++;
    }
}
