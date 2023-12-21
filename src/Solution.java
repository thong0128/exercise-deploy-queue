public class Solution {
    public static void main(String[] args) {
        Queue myQueue = new Queue();
        for (int i = 0; i < 10; i++) {
            myQueue.enQueue(i);
        }
        System.out.println(myQueue.displayQueue());

        Queue myQueue1 = new Queue();
        myQueue1.enQueue(10);
        System.out.println(myQueue1.displayQueue());
    }
}
