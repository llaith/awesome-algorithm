### reddit 排序算法

reddit 是美国最大的网上社区，对于每个帖子分别可以投赞成票和反对票，而 reddit 的排序算法就是将赞成票和反对票再与时间
结合起来对帖子进行排序。
整个帖子的排序与如下的因素有关；

t ＝ 发帖时间 - 2005年12月8日 7:46:43 t的单位为秒。后面那部分是 reddit 的成立时间。
x = 赞成票  - 反对票
y = (x > 0)? 1 : -1; 如果 x 等于 0， 则 y ＝ 0 。 y 的符号会影响计算方向。
z = (x != 0)? abs(x) : 1 。 z 是赞成票与反对票的差的绝对值。

reddit 的得分计算公式如下：


![公式](http://chart.googleapis.com/chart?cht=tx&chl=\Large%20x=\log_{10}(z)+\frac{yt}{45000})


这个公式有两个部分，从前半部分我们可以看到，当z等于10的时候，才意味着可以得到一份，要想得到2分，z 就得到
100分，也就是说，除非这个帖子特别受欢迎，否则分数就很难增长。从后半部分我们可以看到，当 y 大于 0 的时候，
分数就与时间大小成正比，越新的帖子越靠前。当 y 小于 0 时，分数就与时间大小成反比。


代码实现:


```java

public static Double ranking(Long t, int x, int y){
        
        int z = x == 0 ? 1 : Math.abs(x);
        
        double score = Math.log10(z) + y*t/45000;
        
        return score;
}
```
