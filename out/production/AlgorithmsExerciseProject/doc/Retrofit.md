# Retrofit 源码解析
1. 从 `create()` 方法入手，可以看到 Retrofit 内部是通过动态代理来实现的。 
   - 首先会检查判断传入的 Service 是否是接口类型等一系列安全判断操作
   - 然后使用动态代理来代理 Service 中每个方法的实例。
   - 代理前会先对方法进行判断，如果是 Object 的默认方法(equals/toString 等)则忽略代理。
   - 如果是已经有默认实现了的，也忽略代理。
   - 进入真正的代理逻辑，通过 loadServiceMethod 来获取代理方法，首先会在缓存中取出 ServiceMethod 实例，如果没有则在锁保护后在尝试一次，还是没有的话才会去创建 ServiceMethod。
   - 
