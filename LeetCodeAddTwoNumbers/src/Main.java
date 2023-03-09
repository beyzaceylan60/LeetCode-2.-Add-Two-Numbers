//Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode lAns = new ListNode(0); //Create new linked list
            ListNode node = lAns;                //It's like flag node
            int carry = 0;                       //If there is an overflow, we will keep it in this variable.
            int sum = 0;                         //We will keep it in sum of values
            while (l1 != null || l2 != null || carry != 0) {
                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next; //next node
                }
                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next; //next node
                }
                node.next = new ListNode((sum + carry) % 10);
                node = node.next;
                carry = ((sum + carry) / 10); //Integer division
                sum = 0;
            }
            return lAns.next; //Beacuse first node's value is 0
        }
    }