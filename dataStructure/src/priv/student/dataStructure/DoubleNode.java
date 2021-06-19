package priv.student.dataStructure;

public class DoubleNode {

    private int data;  //节点数据
    private DoubleNode nextNode; //下一节点
    private DoubleNode lastNode; //上一节点

    public DoubleNode(int input) {
        data = input;
        nextNode = this;
        lastNode = this;
    }

    //插入节点
    public void insertNext(DoubleNode inserted) {
        inserted.nextNode = nextNode;
        inserted.lastNode = this;
        nextNode.lastNode = inserted;
        nextNode = inserted;
    }

    //删除节点
    public void removeNext() {
        DoubleNode next = nextNode;
        nextNode = next.nextNode;
        next.nextNode.lastNode = this; //此时没有指针指向next,会在随后的一个不确定的时间被垃圾回收器收走
    }

    //获取下一个节点
    public DoubleNode getNextNode() {
        return nextNode;
    }

    //获取上一个节点
    public DoubleNode getLastNode() {
        return lastNode;
    }

    //获取节点数据
    public int getData() {
        return data;
    }

}
