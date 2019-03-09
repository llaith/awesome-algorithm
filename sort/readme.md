
### 排序<a id="orgheadline1"></a>

排序是数据结构的算法中最为常见的一个概念。我们可以将排序理解为: 对某个数据序列按照一定的规则来确定每个数据的位置。

#### 排序算法的评价<a id="orgheadline2"></a>

我们在评价一个排序算法的优劣时会根据算法运行产生的一个指标来评价，以下就是常用的评价指标:

-   稳定/不稳定 假如  a = b, 排序前 a 在 b 前面，排完序后 a 仍然在 b 前面，则表示排序稳定，反之则是不稳定。
-   内排序 所有的排序操作都在内存中完成
-   外排序 排序时需要用到外部的磁盘
-   时间复杂度 一个算法执行所耗费的时间
-   空间复杂度 运行一个程序所需的内存大小

#### 主流排序算法的性能对比<a id="orgheadline3"></a>

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />

<col  class="org-left" />

<col  class="org-left" />

<col  class="org-left" />

<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<thead>
<tr>
<th scope="col" class="org-left">排序算法</th>
<th scope="col" class="org-left">平均时间复杂度</th>
<th scope="col" class="org-left">最好情况</th>
<th scope="col" class="org-left">最坏情况</th>
<th scope="col" class="org-left">空间复杂度</th>
<th scope="col" class="org-left">排序方式</th>
<th scope="col" class="org-left">稳定性</th>
</tr>
</thead>

<tbody>
<tr>
<td class="org-left">冒泡排序</td>
<td class="org-left">O(n<sup>2</sup>)</td>
<td class="org-left">O(n)</td>
<td class="org-left">O(n<sup>2</sup>)</td>
<td class="org-left">O(1)</td>
<td class="org-left">内排序</td>
<td class="org-left">稳定</td>
</tr>


<tr>
<td class="org-left">选择排序</td>
<td class="org-left">O(n<sup>2</sup>)</td>
<td class="org-left">O(n<sup>2</sup>)</td>
<td class="org-left">O(n<sup>2</sup>)</td>
<td class="org-left">O(1)</td>
<td class="org-left">内排序</td>
<td class="org-left">不稳定</td>
</tr>


<tr>
<td class="org-left">插入排序</td>
<td class="org-left">O(n<sup>2</sup>)</td>
<td class="org-left">O(n)</td>
<td class="org-left">O(n<sup>2</sup>)</td>
<td class="org-left">O(1)</td>
<td class="org-left">内排序</td>
<td class="org-left">稳定</td>
</tr>


<tr>
<td class="org-left">希尔排序</td>
<td class="org-left">O(n log n)</td>
<td class="org-left">O(n log<sup>2</sup> n)</td>
<td class="org-left">O(n log<sup>2</sup> n)</td>
<td class="org-left">O(1)</td>
<td class="org-left">内排序</td>
<td class="org-left">不稳定</td>
</tr>


<tr>
<td class="org-left">归并排序</td>
<td class="org-left">O(n log n)</td>
<td class="org-left">O(n log n)</td>
<td class="org-left">O(n log n)</td>
<td class="org-left">O(n)</td>
<td class="org-left">外排序</td>
<td class="org-left">稳定</td>
</tr>


<tr>
<td class="org-left">快速排序</td>
<td class="org-left">O(n log n)</td>
<td class="org-left">O(n log n)</td>
<td class="org-left">O(n<sup>2</sup>)</td>
<td class="org-left">O(log n)</td>
<td class="org-left">内排序</td>
<td class="org-left">不稳定</td>
</tr>


<tr>
<td class="org-left">堆排序</td>
<td class="org-left">O(n log n)</td>
<td class="org-left">O(n log n)</td>
<td class="org-left">O(n log n)</td>
<td class="org-left">O(1)</td>
<td class="org-left">内排序</td>
<td class="org-left">不稳定</td>
</tr>


<tr>
<td class="org-left">计数排序</td>
<td class="org-left">O(n + k)</td>
<td class="org-left">O(n + k)</td>
<td class="org-left">O(n + k)</td>
<td class="org-left">O(k)</td>
<td class="org-left">外排序</td>
<td class="org-left">稳定</td>
</tr>


<tr>
<td class="org-left">桶排序</td>
<td class="org-left">O(n + k)</td>
<td class="org-left">O(n + k)</td>
<td class="org-left">O(n<sup>2</sup>)</td>
<td class="org-left">O(n + k)</td>
<td class="org-left">外排序</td>
<td class="org-left">稳定</td>
</tr>


<tr>
<td class="org-left">基数排序</td>
<td class="org-left">O(n \* K )</td>
<td class="org-left">O(n \* k)</td>
<td class="org-left">O(n \* k)</td>
<td class="org-left">O(n + k)</td>
<td class="org-left">外排序</td>
<td class="org-left">稳定</td>
</tr>
</tbody>
</table>


