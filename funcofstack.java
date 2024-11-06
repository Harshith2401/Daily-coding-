/*Minimum Stack
Solved 
Design a stack class that supports the push, pop, top, and getMin operations.

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
Each function should run in 
O
(
1
)
O(1) time.

Example 1:

Input: ["MinStack", "push", 1, "push", 2, "push", 0, "getMin", "pop", "top", "getMin"]

Output: [null,null,null,null,0,null,2,1]

Explanation:
MinStack minStack = new MinStack();
minStack.push(1);
minStack.push(2);
minStack.push(0);
minStack.getMin(); // return 0
minStack.pop();
minStack.top();    // return 2
minStack.getMin(); // return 1
Constraints:

-2^31 <= val <= 2^31 - 1.
pop, top and getMin will always be called on non-empty stacks.
 */

 class MinStack 
{
        private Stack<Integer> stack;

    public MinStack() {
        stack= new Stack<>();
        
    }
    
    public void push(int val) {
        stack.push(val);
        
    }
    
    public void pop() {
        stack.pop();
        
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        Stack<Integer> temp= new Stack<>();
        int min=stack.peek();
        while(!stack.isEmpty())
        {
            min=Math.min(min,stack.peek());
            temp.push(stack.pop());
        
        }while(!temp.isEmpty())
        {
            stack.push(temp.pop());
        }
        return min;
    }
}
