import java.util.concurrent.LinkedBlockingQueue;

/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */
class MyStack {
    private Queue<Integer> a;//输入队列
    private Queue<Integer> b;//输出队列
    
    public MyStack() {
        a = new LinkedList<>();
        b = new LinkedList<>();
    }
    
    public void push(int x) {
        a.offer(x);
        // 将b队列中元素全部转给a队列
        while(!b.isEmpty())
            a.offer(b.poll());
        // 交换a和b,使得a队列没有在push()的时候始终为空队列
        Queue temp = a;
        a = b;
        b = temp;
    }
    
    public int pop() {
        return b.poll();
    }
   
    public int top() {
        return b.peek();
    }
    
    public boolean empty() {
        return b.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

