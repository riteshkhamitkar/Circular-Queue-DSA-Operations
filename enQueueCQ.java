.................
Main.java
.................
class Main{
    public static void main(String[] args){
        CircularQueue newCQ = new CircularQueue(3);
        newCQ.enQueue(1);
        newCQ.enQueue(2);
        newCQ.enQueue(3);
        newCQ.enQueue(4);
        newCQ.enQueue(5);

    }
}
..................................
CircularQueue.java
..................................
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

    public boolean isFull() {
        if (topOfQueue+1 == beginningOfQueue) {
          return true;
        } else if (beginningOfQueue==0 && topOfQueue+1==size) {
          return true;
        } else {
          return false;
        }
      }

    // enqueue CQ

     // enQueue
  public void enQueue(int value) {
    if (isFull()) {
      System.out.println("The CQ is full!");
    } else if (isEmpty()) {
      beginningOfQueue = 0;
      topOfQueue++;
      arr[topOfQueue] = value;
      System.out.println("Successfully inserted "+value+" in the queue");
    } else {
      if (topOfQueue+1 == size) {
        topOfQueue = 0;
      } else {
        topOfQueue++;
      }
      arr[topOfQueue] = value;
      System.out.println("Successfully inserted "+value+" in the queue");
    }
  }
}

...........
//////finish///////////
