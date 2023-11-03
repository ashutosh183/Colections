import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(100);
        System.out.println(st.size());
        int val = st.pop();
        st.push(null);
        System.out.println("The popped element is ---> "+val);
        System.out.println(st.size());
    }
}