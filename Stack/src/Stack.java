public class Stack {
    class Node {
        int data;
        Node next;

        public Node(int x, Node n) {
            this.data = x;
            this.next = n;
        }

        public Node(int x) {
            this(x, null);
        }
    }

    Node head;

    public Stack() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int x) {
        Node newNode = new Node(x);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public Node pop() {
        if (isEmpty()) {
            System.out.println("Not have element in stack!");
            return null;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
            return temp;
        }
    }

    public Node peek() {
        return head;
    }

    public void disp() {
        if (isEmpty()) {
            System.out.println("Stack empty!");
        }
        System.out.println("Top---->Bot");
        Node cur = head;
        while(cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
