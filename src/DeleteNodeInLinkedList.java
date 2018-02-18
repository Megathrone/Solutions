/**
 *
 *
 * 题的意思是给了一个指定的node,删除这个node,所以就很简单了
 * @NogizakaZ
 *

public class ListNode {
    int val;
    ListNode next;

    ListNode ( int x ) {
        val = x;
    }
}
*/
public class DeleteNodeInLinkedList {
    public void deleteNode ( ListNode node ) {
         if ( node==null||node.next==null ){
             return ;
         }
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
