.................
Main.java
.................
class Main{
    public static void main(String[] args){
        CircularQueue newCQ = new CircularQueue(3);
        
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
}


...........
//////finish///////////
