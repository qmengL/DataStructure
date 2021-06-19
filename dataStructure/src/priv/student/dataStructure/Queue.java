package priv.student.dataStructure;

public class Queue {

    private static final int MAXSIZE = 4; //最大空间
    private int[] queue; //队列
    private int frontPointer, rearPointer; //头尾指针

    public Queue() {
        queue = new int[MAXSIZE];
        frontPointer = 0;
        rearPointer = 0;
    }

    //判断为空
    public boolean isEmpty() {
        return frontPointer == rearPointer;
    }

    //判断为满
    public boolean isFull() {
        return frontPointer == (rearPointer + 1) % MAXSIZE;
    }

    //入队
    public void enQueue(int element) {
        if (isFull()) throw new RuntimeException("队列为满！");
        queue[rearPointer] = element;
        rearPointer = (rearPointer + 1) % MAXSIZE;
    }

    //出队
    public void deQueue() {
        if(isEmpty()) throw new RuntimeException("队列为空！");
        frontPointer = (frontPointer + 1) % MAXSIZE;
    }

    //打印队列
    public void show() {
        //显示有效队列
        System.out.print("当前排队情况：");
        int i = frontPointer;
        while(i % MAXSIZE != rearPointer)  {
            System.out.print(queue[i % MAXSIZE]);
            i+=1;
        }
        System.out.print('\n');
        //显示队列存储全部情况
        System.out.print("队列总体情况：");
        for(int element : queue) {
            System.out.print(element);
        }
        System.out.println(" front=" + frontPointer + " rear=" + rearPointer + '\n');
    }
}
