import java.util.ArrayList;
import java.util.Stack;

public class Code06_PrintListInReversedOrder {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        ArrayList<Integer> list = printListInReverseOrder(listNode);
        for (int val : list) {
            System.out.println(val);
        }
    }

    public static ArrayList<Integer> printListInReverseOrder(ListNode listNode) {
        Stack<Integer> stack = new Stack<Integer>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }

        return list;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
