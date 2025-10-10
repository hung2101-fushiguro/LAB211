
public class Main {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(3);
        st.push(2);
        st.disp();
        System.out.println("Pop:" + st.pop().data);
        st.disp();
        System.out.println("Peek:" + st.peek().data);
    }
}