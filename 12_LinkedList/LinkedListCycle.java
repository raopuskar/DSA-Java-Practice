/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 //This is faster approach using Floyd's Tortoise and Hare algorithm
public class LinkedListCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;
        
    }
}

//Example usage:
// ListNode head = new ListNode(3);
// head.next = new ListNode(2);
// head.next.next = new ListNode(0);
// head.next.next.next = new ListNode(-4);
// head.next.next.next.next = head.next; // Creates a cycle
// LinkedListCycle solution = new LinkedListCycle();
// ListNode cycleStart = solution.detectCycle(head);
// if(cycleStart != null){
//     System.out.println("Cycle starts at node with value: " + cycleStart.val);
// } else {
//     System.out.println("No cycle detected.");
// }