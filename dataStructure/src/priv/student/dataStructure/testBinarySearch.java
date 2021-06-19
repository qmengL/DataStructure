package priv.student.dataStructure;

public class testBinarySearch {

    public static void main (String[] args) {
        int[] arr = new int[] {2, 4, 6}; //待查找数组
        int element = 4; //待查找元素
        int index; //待查找元素位置，若不在数组中，则返回-1
//        index = new testBinarySearch().recBinarySearch(arr, 0, arr.length, element); //递归函数测试
        index = new testBinarySearch().nonRecBinarySearch(arr, element); //非递归函数测试
        System.out.println("所选元素" + element + "在第" + (index+1) +"个位置");
    }

    //二分法递归查找正序排列数组
    //输入：待查找数组，头指针，尾指针，待查找元素
    //输出：待查找元素的位置或0
    public int recBinarySearch(int[] arrInAscendingOrder, int front, int rear, int elementToFind) {
        int middle = (front + rear) / 2; //中间位置
        //结束递归的条件
        if (middle == front) {
            if (arrInAscendingOrder[front] == elementToFind) return middle;
            else return -1; //避免死循环
        }
        if (middle == rear) {
            if (arrInAscendingOrder[middle] == elementToFind) return middle;
            else return -1; // 避免数组越界
        }
        //递归
        if (arrInAscendingOrder[middle] > elementToFind) return recBinarySearch(arrInAscendingOrder, front, middle, elementToFind);
        if (arrInAscendingOrder[middle] < elementToFind)  return recBinarySearch(arrInAscendingOrder, middle + 1, rear, elementToFind);
        if (arrInAscendingOrder[middle] == elementToFind) return middle;
        return -1;
    }

    //二分法非递归查找正序排列数组
    //输入：待查找数组，待查找元素
    //输出：待查找元素的位置或0
    public int nonRecBinarySearch(int[] arrInAscendingOrder, int element) {
        int front = 0; // 头指针
        int rear = arrInAscendingOrder.length; // 尾指针
        int middle = 0; // 中间指针
        while (true) {
            middle = (front + rear) / 2;
            if (arrInAscendingOrder[middle] != element) {
                if (arrInAscendingOrder[middle] > element) {
                    if (front == middle) return -1;
                    rear = middle;
                } else {
                    if (rear == middle) return -1;
                    front = middle + 1;
                }
            } else {
                return middle;
            }
        }
    }
}
