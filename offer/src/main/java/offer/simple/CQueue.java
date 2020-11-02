package offer.simple;

import java.util.Stack;

/**
 * 用两个栈实现队列
 * leetcode offer 09
 */
public class CQueue {

    Stack stack1;

    Stack stack2;


    public CQueue() {
         stack1 = new Stack();
         stack2 = new Stack();

    }

    public void appendTail(int value) {
       stack1.push(value);
    }

    public int deleteHead() {
     if(stack2.empty()){
         while (!stack1.empty()){
             stack2.push(stack1.pop());
         }
     }
     return stack2.empty()? -1 :(int) stack2.pop();
    }
}
