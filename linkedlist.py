#crate a linked list using phython.

#node discription.
class node:
    def __init__(self,data):
        self.data=data
        self.next=None

#creating a linked list.
class linkedlist:

    #declaring head.
    def __init__(self):
        self.head=None
    
    # adding the nodes.
    def append(self,data):
        new_node=node(data)

        #condition check if no nodes are there.
        if not self.head:
            self.head=new_node
            return
        
        #declaring last node.
        last_node=self.head
        while last_node.next:
            last_node=last_node.next
        last_node.next=new_node

        # displaying the nodes.
    def display(self):
        current_node=self.head
        while current_node:
            print(current_node.data,end='')
            current_node=current_node.next
        print()

linked_list=linkedlist()
linked_list.append(1)
linked_list.append(2)
linked_list.append(3)
linked_list.display()

#TIMECOMPLIXIXTY =O(n)
