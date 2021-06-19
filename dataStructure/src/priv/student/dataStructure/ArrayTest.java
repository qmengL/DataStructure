package priv.student.dataStructure;

public class ArrayTest {

    public static void main(String[] args) {
        Array testArr = new Array();
        //初始化测试
        System.out.println("===========数组测试程序===========");
        System.out.println("===========初始化测试===========");
        System.out.println("是否为空：" + testArr.isEmpty());
        System.out.println("size = " + testArr.size());
        testArr.show();
        //添加元素
        System.out.println("===========添加元素===========");
        testArr.add(99);
        testArr.add(98);
        testArr.add(97);
        testArr.show();
        //删除元素
        System.out.println("===========删除第2个位置的元素===========");
        testArr.delete(2);
        testArr.show();
        //取出指定位置元素
        System.out.println("===========取出第1个位置的元素===========");
        System.out.println(testArr.get(1));
        System.out.println("size = " + testArr.size());
        //插入元素到指定位置
        System.out.println("===========添加元素===========");
        testArr.add(96);
        testArr.add(95);
        testArr.add(94);
        testArr.show();
        System.out.println("===========在第4个位置插入元素33===========");
        testArr.insert(4, 33);
        testArr.show();
        //替换指定位置的元素
        System.out.println("===========将第1个位置的元素替换为100===========");
        testArr.set(1, 100);
        testArr.show();
        System.out.println("size = " + testArr.size());
    }
}
