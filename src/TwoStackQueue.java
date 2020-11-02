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
        while(!stackPush.empty()) {
                stackPop.push(stackPush.pop());
        }
    }

    public void add(int pushInt) {
        stackPush.push(pushInt);
        pushToTop();
    }

    public int poll() {
        return stackPop.pop();
    }

    public int peek() {
        return stackPop.peek();
    }

    public static void main(String args[]) {
        TwoStackQueue twoStackQueue1 = new TwoStackQueue();

        twoStackQueue1.add(1);
        System.out.println(twoStackQueue1.stackPush);
        System.out.println(twoStackQueue1.stackPop);
        twoStackQueue1.add(2);
        System.out.println(twoStackQueue1.stackPush);
        System.out.println(twoStackQueue1.stackPop);
        twoStackQueue1.add(3);
        System.out.println(twoStackQueue1.stackPush);
        System.out.println(twoStackQueue1.stackPop);



        System.out.println("---------");
        System.out.println(twoStackQueue1.poll());
        System.out.println(twoStackQueue1.poll());
        System.out.println(twoStackQueue1.poll());




    }

}
