package priv.student.dataStructure;

public class StackTest {
    public static void main(String[] args) {
        Stack myStack = new Stack();

        //入栈
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
//        myStack.push(4); //测试栈满情况

        //出栈及查看栈顶元素
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.peek());  //此处应连续输出两次栈顶元素
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek()); //测试栈空情况
    }
}
