import java.util.ArrayList;

public class Code06_PrintListInReversedOrderRecursively {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        ArrayList<Integer> list = printListInReverseOrderRecursively(listNode);
        for (int val : list) {
            System.out.println(val);
        }
    }

    public static ArrayList<Integer> printListInReverseOrderRecursively(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (listNode != null) {
            if (listNode.next != null) {
                list = printListInReverseOrderRecursively(listNode.next);
            }
            list.add(listNode.val);
        }
        return list;
    }
}
