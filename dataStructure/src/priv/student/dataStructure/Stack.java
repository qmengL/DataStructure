package priv.student.dataStructure;

public class Stack {

    private int[] stack;  //栈
    private int topPointer;  //栈顶指针
    private static final int MAXSIZE = 3; //最大空间

    public Stack() {
        stack = new int[MAXSIZE];
        topPointer = 0;
    }

    //判断栈是否为空
    public boolean isEmpty() {
        return topPointer == 0;
    }

    //判断栈是否为满
    public boolean isFull() {
        return topPointer == MAXSIZE;
    }

    //压入元素
    public void push(int element) {
        if(isFull()) throw new RuntimeException("栈满！");
        stack[topPointer++] = element;
//        //单开一个stack.length+1空间的新栈，避免判断栈满
//        int[] newStack = new int[stack.length+1];
//        for(int i = 0; i < stack.length; i++) newStack[i] = stack[i];
//        newStack[stack.length] =  element;
//        stack = newStack;
//        topPointer+=1;
    }

    //取出栈顶元素
    public int pop() {
        if(isEmpty()) throw new RuntimeException("栈为空！");
        return stack[--topPointer];
    }

    //查看栈顶元素
    public int peek() {
        if(topPointer==0) throw new RuntimeException("栈为空！");
        return stack[topPointer-1];
    }
}
