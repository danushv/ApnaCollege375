class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)
        {
            return head;
        }
ListNode currentNode=head;
while(head.next!=null)
{
ListNode p=head.next;
head.next=p.next;
p.next=currentNode;
currentNode=p;
}
        return currentNode;
    }
}
