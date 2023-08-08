
    import java.util.Queue;

    public class CustomQueue {
        int arr[];
        int front;
        int rear;
        int size;

        CustomQueue(int i){
            arr = new int[i];
            size = i;
            front = -1;
            rear = -1;
        }


        public void enQueue(int e){
            if( front == 0 && rear == size-1){
                System.out.println("Queue is full");
            }else {
                if(front == -1){
                    front = 0;
                }
                arr[++rear] = e;
            }
        }

        public void deQueue(){
            if (front == -1) {
                System.out.println("Queue is empty");
                System.exit(1);
            }else{
                int a = arr[front] ;
                if (front >= rear) {
                    front = -1;
                    rear = -1;
                }
                System.out.println("Element dequeued : "+ a);
                front++;
            }

        }
        public void displayQueue(){
            if(front == -1){
                System.out.println("Queue is empty");
            }
            for(int i = front ; i<= rear; i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }
    }
    class DemoQueue{
        public static void main(String[] args) {
            CustomQueue q1 = new CustomQueue(5);
            q1.enQueue(30);
            q1.enQueue(20);
            q1.enQueue(10);
            q1.displayQueue();
            q1.deQueue();
            q1.displayQueue();
            q1.deQueue();
            q1.deQueue();
        }
    }

// create a milk class(manufacturing date(key), mrp, quantity, brand,  and store it in Hashmap

//    Queue is a data structure which follows the principle of FIFO i.e the elements that is inserted first gets deleted first
//In Queue, there are two pointers i.e Front and Rear
//Rear pointer is used for insertion and Front pointer is used for deletion.
//Enqueue function is used to insert element while deQueue function is to delete element.

