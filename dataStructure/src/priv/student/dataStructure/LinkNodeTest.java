package priv.student.dataStructure;

public class LinkNodeTest {
    public static void main(String[] args) {

        //创建及添加节点
        LinkNode node1 = new LinkNode(1);
        LinkNode node2 = new LinkNode(2);
        LinkNode node3 = new LinkNode(3);
        node1.append(node2).append(node3);

        //显示所有节点内容
        System.out.println("===========显示链表===========");
        node1.show();

        //判断并查看末尾节点的数据
        System.out.println("===========末尾节点===========");
        LinkNode nodeTest =  node1.getNextNode().getNextNode();
        System.out.println("判断是否为末节点：" + nodeTest.isLast());
        System.out.println("查看节点：" + nodeTest.getData());

        //删除中间节点
        System.out.println("===========删除中间节点===========");
        if(node1.getNextNode().getNextNode().removeNext()) node1.show();  //删除失败测试，原因：末尾节点的下一个无法删除
//        if(node1.removeNext()) node1.show(); //删除成功测试
        else System.out.println("节点删除失败！");

        //在中间插入新节点
        System.out.println("===========插入节点===========");
        if(node1.insertNext(new LinkNode(4).append(new LinkNode(5)))) node1.show();  //插入失败测试，原因：插入了节点串
//        if(node1.insertNext(new LinkNode(4))) node1.show(); //插入成果测试
        else System.out.println("节点插入失败！");
    }
}
