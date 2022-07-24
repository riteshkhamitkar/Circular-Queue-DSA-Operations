public class CircularQueue {
    int [] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    public CircularQueue(int size){
        this.arr = new int[size];
        this.size = size;
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The CQ is created successfully! " + size + " size!");
    }

    //isEmpty

    public boolean isEmpty(){
        if(topOfQueue==-1){
            return true;
        }else{
            return false;
        }
    }

    //isFull 

    public boolean isFull(){
        if(topOfQueue+1 == beginningOfQueue){
            return true;
        }else if(beginningOfQueue == 0 && topOfQueue == size){
            return true;
        }else{
            return false;
        }
    }
}
