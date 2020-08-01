
'''
Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

Example:

Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6
'''

'''

from heapq import heappush, heappop
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
 
class Solution:
    # @param a list of ListNode
    # @return a ListNode
    def mergeKLists(self, lists):
        if len(lists)==0: return
        listHeap=[]
        root=ListNode(0)
        curNode=root
        for Node in lists:
            if Node:
                heappush(listHeap,(Node.val,Node))
        while listHeap:
            pop=heappop(listHeap)
            curNode.next=ListNode(pop[0])
            curNode=curNode.next
            if pop[1].next:
                heappush(listHeap,(pop[1].next.val,pop[1].next))
        return root.next
'''