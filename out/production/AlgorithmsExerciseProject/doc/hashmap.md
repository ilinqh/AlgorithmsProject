# HashMap
## 1. 基本结构
HashMap 是一个非线程安全的。
- JDK 1.7 及之前
  - 数组 + 链表的形式，每个节点包括四个元素 (hash 值 + key + value + next 指针)。
  - 调用无参构造函数的时候，内部会调用有两个参数的构造函数，确定默认数组长度和负载因子。
  - 首次调用 `put()` 方法的时候，才会根据设定的数组长度初始化数组。

- JDK 1.8 及之后
  - JDK 1.8 中 HashMap 与 JDK 1.7 中的 HashMap 的最大区别是引入了红黑树。
  - 当 HashMap 中的链表长度超过 8 并且数组的长度超过 64 时，链表会转化为`红黑树`。
  
## 注意点
### 插入节点的具体流程
当插入新的节点时，会先对节点的 hash 值进行二次 hash 处理，处理方式如下
```java
// 1.7 及之前
int hash(Object k) {
    int h = hashSeed;
    if (0 != h && k instanceof String) {
    return sun.misc.Hashing.stringHash32((String) k);
    }

    h ^= k.hashCode();

    h ^= (h >>> 20) ^ (h >>> 12);
    return h ^ (h >>> 7) ^ (h >>> 4);
}

// 1.8 及之后
int hash(Object key) {
    int h;
    return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
}
```
然后，再将二次 hash 处理后得到的值与 HashMap 的数组长度 - 1 进行与计算 `(n - 1) & hash`，得到该节点在数组中的下标。
二次 hash 处理的目的是让更多为的 hash 值参与到数组下标的计算中，尽量降低 hash 碰撞；
与数组长度 - 1 进行与运算，相当于对数组长度取模，因为数组长度都是 2 的次方，进行减一操作后通过位运算来取模可以更加高效，这也是为什么数组长度一定是 2 的次方的原因。

获取到节点的下标后，会到数组中查找该下标是否已经有节点，如果该位置没有节点，则将新的节点插入到数组中；如果该位置已经有节点了，则是下面两种情况
- 1.7 版本中，会将新节点的 next 指针指向数组中的头结点，然后再将该新节点插入到数组中，即头插法
- 1.8 版本中
  - 若改下标上的数据结构是一个链表，则是将该节点插入到链表尾部，即尾插法。如果达到树化条件则会触发链表转红黑树的操作。
  - 若该下标上的数据结构是一个红黑树，则会根据该新节点二次 hash 得到的 hash 值判断插入到树上的位置，同时做树的平衡处理。

### 扩容
首先将数组扩容为原来长度的两倍，然后遍历原数组上的节点，根据节点的二次 hash 值配合新数组长度确定新节点的位置。
这里有一个注意项，1.7 版本中，因为是头插法，所以扩容后的链表顺序与原本的顺序相反。1.8 版本的则不受影响。






















