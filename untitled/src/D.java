public class D {
    public static void main(String[] args) {
        Queue_int queue=new Queue_int();
        for(int i=1;i<=5;i++){
            insertElement(i,queue);
        }
        rotate(2,queue);

        while (!(queue.isQueueEmpty())){
            System.out.println(queue.serve());
        }

    }
    public static void insertElement(int x,Queue_int q){
        q.append(x);
    }
    public static void rotate(int r,Queue_int q){
        for (int j=0;j<r;j++){
            int n=q.serve();
            q.append(n);
        }
    }
}
