import java.util.Stack;

public class TwoStackQueue {
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    public TwoStackQueue() {
        stackPush = new Stack<Integer>();
        stackPop = new Stack<Integer>();
    }

    // push栈向pop栈导入数据
    private void pushToTop() {
        if (stackPop.empty()) {
            while(!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
    }

    public void add(int pushInt) {
        stackPush.push(pushInt);
        pushToTop();
    }

    public int poll() {
        // 队列数据结构实现类的方法，从队首获取元素.同时获取的这个元素将从原队列删除；
        if(stackPush.empty() && stackPush.empty()) {
            throw new RuntimeException("Queue is empty!");
        }

        pushToTop();
        return stackPop.pop();
    }

    public int peek() {
        if (stackPush.empty() && stackPop.empty()) {
            throw new RuntimeException("Queue is empty!");
        }
        pushToTop();
        return stackPop.peek();
    }

    public static void main(String args[]) {
        TwoStackQueue twoStackQueue1 = new TwoStackQueue();

        twoStackQueue1.add(1);
        twoStackQueue1.add(2);
        twoStackQueue1.add(3);



        System.out.println("---------");
        System.out.println(twoStackQueue1.poll());
        System.out.println(twoStackQueue1.poll());
        System.out.println(twoStackQueue1.poll());

//        System.out.println(twoStackQueue1.poll());


    }

}
