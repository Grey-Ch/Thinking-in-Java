# Object

## `equals()`

```java
class test {
    public int num;
    public boolean equals(Object obj)	//override args be same
    {
        if(!(obj instanceof test))
            return false;
        test t = (test)obj;
        return this.num==t.num;
    }
}
```

subObject.java