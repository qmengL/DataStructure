package priv.student.dataStructure;

import java.util.Arrays;

public class Array {

    private int[] arr; //数组

    //初始化
    public Array() {
        arr = new int[0];
    }

    //判断非空
    public boolean isEmpty() {
        return arr.length==0;
    }

    //获取长度
    public int size() {
        return arr.length;
    }

    //往数组末尾添加一个元素
    public void add(int element) {
        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[arr.length] = element;
        arr = newArr;
    }

    //删除数组中的元素
    public void delete(int index) {
        //判断位置是否合法
        if (index >arr.length || index < 1) throw new RuntimeException("下标越界");
        int[] newArr = new int[arr.length-1];
        for (int i = 0; i <arr.length - 1; i++) {  //这里容易数组下标越界，建议将短数组作为下标遍历范围
            if (i < index - 1){
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i + 1];
            }
        }
        arr = newArr;
    }

    //打印所有元素到控制台
    public void show() {
        System.out.println(Arrays.toString(arr));
//        for (int j : arr) System.out.print(j);
    }

    //获取指定位置的元素
    public int get(int index) {
        if (index > arr.length || index < 1) throw new RuntimeException("数组越界");
        return arr[index-1];
    }

    //插入一个元素到指定的位置
    public void insert(int index, int element) {
        if (index > arr.length + 1 || index < 1) throw new RuntimeException("数组越界");
        int[] newArr = new int[arr.length + 1];
        int i = 0;
        for (; i < index - 1; i++) newArr[i] = arr[i];
        newArr[i] = element;
        for (; i < arr.length; i++) newArr[i+1] = arr[i];
        arr = newArr;
    }

    //替换指定位置的元素
    public void set (int index, int element) {
        if (index > arr.length || index < 1) throw new RuntimeException("数组越界");
        arr[index - 1] = element;
    }
}
