package design_patterns;

/**
 * 饿汉模式不支持懒加载
 */
class EagerSingleton {
    private EagerSingleton() {
    }

    private final static EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return instance;
    }
}

/**
 * 懒汉模式支持懒加载，但因为加了同步锁，会有性能问题，不支持高并发。
 */
class LazySingleton {
    private LazySingleton() {
    }

    private static LazySingleton instance;

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

/**
 * 双重检测方式则既支持懒加载，也支持高并发，同时为了兼顾低版本 Java 带来的指令重排序问题，对 `instance` 添加 `volatile` 关键字。
 * （高版本 Java 内部实现中已经解决了这个问题）
 */
class DoubleCheckSingleton {
    private DoubleCheckSingleton() {
    }

    private static volatile DoubleCheckSingleton instance;

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}

/**
 * 类似饿汉式，但同时也支持懒加载，instance 的唯一性、创建过程的线程安全性都由 JVM 来保证。
 */
class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
    }

    private static class SingletonHolder {
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
