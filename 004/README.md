## 两个排序后数组的中位数

### 思路
1. 取两个已排序数组的中位数，并且要求复杂度为O(logn)，可以联想到二分查找
2. 中位数可以泛化为两个数组中第k大的元素t，目标可以改为寻找第k大的元素
3. 我们可以从两个数组中取出k个元素，优先从A数组中取，虽然取出元素的相对大小不能确定，
但有一点可以肯定，A[m-1] 和 B[k-m-1]中的较大值一定是这k个元素中最大的，
（如果m>k，元素全从A数组中取出，分析情况与此类似）

**两种情况**
- 如果这k个元素包含t => t=这两个值的较大值 => 这两个值的较小值不是t
- 如果这k个元素不包含t => 这两个值的较小值不是t
所以可以排除较小值以及从该数组取出的元素，不妨假设A[m-1]为较小值
此时目标值t就是剩余的元素中第k-m大的值，缩小了搜索范围
，然后可以递归求解。


特殊的，如果m+n为偶，需寻找k=(m+n)/2和k=(M+N)/2+1
如果m+n为奇，只需寻找k=(m+n)/2



## 关于java
1. @Override是伪代码,表示重写(当然不写也可以)，编译器可以给你验证@Override下面的方法名是否是你父类中所有的，如果没有则报错
2. 注解@see可以在注释中实现链接跳转.@see可以指向包,类,方法,属性.
```java
 @see package.class#member
```
	如果指向的在当前类中,可以只写井号后面的.
	如果指向的在当前包中,可以省略包名
3. interface

## 接口使用 interface 
1. 关键字来声明，可以看做是一种特殊的抽象类，可以指定一个类必须做什么，而不是规定它如何去做。
2. 接口的使用与类的使用有些不同。在需要使用类的地方，会直接使用new关键字来构建一个类的实例，但接口不可以这样使用，因为接口不能直接使用 new 关键字来构建实例。

接口必须通过类来实现(implements)它的抽象方法，然后再实例化类。类实现接口的关键字为implements。
注意
>a）实现一个接口就是要实现该接口的所有的方法(抽象类除外)。
>b）接口中的方法都是抽象的。
>c）多个无关的类可以实现同一个接口，一个类可以实现多个无关的接口。

4. 泛型
https://www.cnblogs.com/coprince/p/8603492.html
