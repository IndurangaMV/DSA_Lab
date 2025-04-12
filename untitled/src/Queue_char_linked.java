public class Queue_char_linked {
    Node_char front;
    Node_char rear;
    int queueSize;
    Queue_char_linked(){
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
    public char serve(){
        if (isQueueEmpty()){
            System.out.println("Queue is empty.");
            return 0;
        }else{
            char n=this.front.data;
            this.front=front.next;
            queueSize--;
            return n;
        }
    }
    public void append(char data){
        Node_char oldRear=rear;
        rear=new Node_char();
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

