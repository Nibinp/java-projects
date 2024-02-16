class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
        {
            return head;
        }
        ListNode one=head;
		ListNode two =one.next;
		while(two!=null)
		{
			if(one.val==two.val)
			{
				one.next=two.next;
				two=two.next;
			}
			else 
			{
				one=one.next;
				two=one.next;
			}
		}
		
		
		return head;
		
    }
}
