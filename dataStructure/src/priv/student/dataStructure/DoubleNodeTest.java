package priv.student.dataStructure;

public class DoubleNodeTest {

    public static void main(String[] args) {
        //创建节点
        DoubleNode dn1 = new DoubleNode(1);
        DoubleNode dn2 = new DoubleNode(2);
        DoubleNode dn3 = new DoubleNode(3);

        //检查单个节点的前后指针
        System.out.println("===========测试单个节点===========");
        System.out.println("当前节点: " + dn1.getData() + " 下一节点: " + dn1.getNextNode().getData() +
                " 上一节点: " + dn1.getLastNode().getData());

        //创建链表
        System.out.println("===========插入节点===========");
        dn1.insertNext(dn2);
        dn1.insertNext(dn3);
        System.out.println("当前节点: " + dn3.getData() + " 下一节点: " + dn3.getNextNode().getData() +
                " 上一节点: " + dn3.getLastNode().getData());

        //删除节点
        System.out.println("===========删除节点" + dn3.getData() + "===========");
        dn1.removeNext();
        System.out.println("当前节点: " + dn1.getData() + " 下一节点: " + dn1.getNextNode().getData() +
                " 上一节点: " + dn1.getLastNode().getData());
    }
}
