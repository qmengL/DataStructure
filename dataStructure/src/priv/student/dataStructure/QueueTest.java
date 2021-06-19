package priv.student.dataStructure;

public class QueueTest {
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println("===========队列测试程序===========");
        System.out.println("是否为空：" + q.isEmpty());
        System.out.println("===========入队===========");
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
//        q.enQueue(4);  //测试队列为满
        q.show();
        System.out.println("===========出队===========");
        q.deQueue();
        q.deQueue();
        q.deQueue();
//        q.deQueue();  //测试队列为空
        q.show();
        System.out.println("===========测试循环===========");
        q.enQueue(4);
        q.show();
        q.enQueue(5);
        q.show();
        q.deQueue();
        q.show();
    }
}
