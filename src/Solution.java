public class Solution {
    public static void main(String[] args) {
        Queue myQueue = new Queue();
        for (int i = 0; i < 10; i++) {
            myQueue.enQueue(i);
        }
        myQueue.displayQueue();
        System.out.println(myQueue.deQueue().data);
        myQueue.displayQueue();

        Queue myQueue1 = new Queue();
        myQueue1.enQueue(10);
        myQueue1.displayQueue();
        System.out.println(myQueue1.deQueue().data);
        myQueue1.displayQueue();
    }
}
