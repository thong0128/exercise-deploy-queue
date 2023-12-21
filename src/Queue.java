public class Queue {
    public Node front;
    public Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }
    public void enQueue(int data) {
        Node temp = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = temp;
            this.rear.link = this.front;
            return;
        }
        this.rear.link = temp;
        this.rear = temp;
        this.rear.link = this.front;
    }

    public Node deQueue() {
        if (this.front == null)
            return null;
        Node temp = this.front;
        if (this.front == this.rear) {
            this.front = null;
            this.rear = null;
            return temp;
        }
        this.front = this.front.link;
        this.rear.link = this.front;
        return temp;
    }

    public String displayQueue() {
        String display = "{";
        Node temp = this.front;
        do {
            if (temp == this.rear)
                display += temp.data;
            else
                display += temp.data + ", ";
            temp = temp.link;
        }while (temp!=this.front);
        display += "}";
        return display;
    }
}
