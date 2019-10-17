# 内部类

只有内部类可以private，其他类不可

内部类可直接访问外部类成员

外部类可通过实例化对象访问内部类

其他类访问内部类：

```java
class test {
    outer.inner in = new outer().new inner();
}
```

