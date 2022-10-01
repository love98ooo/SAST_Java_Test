# 答案
## T1
### 错误
FishMan 接口中的message变量没有初始化  

### 修改
``` String message = "人不可以,至少不应该"; ```

## T3
### 原因
之前的 message 变量来自于 FishMan 接口；

此时的 message 变量来自于 Nun 类，使用无参构造器创建 Nun 对象时，引用类型 message 被初始化为 null