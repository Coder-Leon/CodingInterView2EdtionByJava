import java.util.Stack;

public class Code09_QueueWithTwoStacks {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() throws Exception {
        if (stack1.empty() && stack2.empty()) {
            throw new Exception("Queue is empty");
        }
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public static void main(String[] args) throws Exception{
        Code09_QueueWithTwoStacks code09 = new Code09_QueueWithTwoStacks();
        code09.push(1);
        code09.push(2);
        System.out.println(code09.pop());
        code09.push(3);
        code09.push(4);
        code09.push(5);
        System.out.println(code09.pop());
    }
}
