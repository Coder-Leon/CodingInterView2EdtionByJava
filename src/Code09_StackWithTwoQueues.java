import java.util.ArrayDeque;
import java.util.Queue;

public class Code09_StackWithTwoQueues {

    Queue<Integer> queue1 = new ArrayDeque<Integer>();
    Queue<Integer> queue2 = new ArrayDeque<Integer>();

    public void push(int node) {
        if (!queue2.isEmpty()) {
            queue2.add(node);
        } else {
            queue1.add(node);
        }

    }

    public int pop() throws Exception {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            throw new Exception("Stack is empty");
        }
        if (queue2.isEmpty()) {
            while (queue1.size() != 1) {
                queue2.add(queue1.remove());
            }
            return queue1.remove();
        } else if (queue1.isEmpty()){
            while (queue2.size() != 1) {
                queue1.add(queue2.remove());
            }
            return queue2.remove();
        }
        return -1;
    }

    public static void main(String[] args) throws Exception{
        Code09_StackWithTwoQueues code09 = new Code09_StackWithTwoQueues();
        code09.push(1);
        code09.push(2);
        System.out.println(code09.pop());
        code09.push(3);
        code09.push(4);
        code09.push(5);
        System.out.println(code09.pop());
    }
}
