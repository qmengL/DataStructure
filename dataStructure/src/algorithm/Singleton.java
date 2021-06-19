package algorithm;

public class Singleton {

    //测试代码
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        System.out.println("创建s1: " + s1.toString());
        Singleton s2 = Singleton.getInstance();
        System.out.println("创建s2: " + s2.toString());
    }

    private Singleton() {
        System.out.println("创建单例模式: " + this);
    }

//    //饿汉式
//    private static Singleton instance = new Singleton();
//    public static Singleton getInstance() {
//        return instance;
//    }

//    //懒汉式
//    private static Singleton instance = null;
//    public static Singleton getInstance() {
//        if(null == instance) instance = new Singleton();  //线程不安全
//        return instance;
//    }

//    //改进后线程安全的双重锁懒汉式
//    private volatile static Singleton instance = null; //volatile 禁止重排序，所有的写操作将在读操作以前
//    public static Singleton getInstance() {
//        if(null == instance) {
//            synchronized (Singleton.class) {
//                if(null == instance) instance = new Singleton();
//            }
//        }
//        return instance;
//    }

    //内部静态类实现
    public static Singleton getInstance() {
        return SingletonHolder.sInstance;
    }
    private static class SingletonHolder {
        private static final Singleton sInstance = new Singleton();
    }
}
